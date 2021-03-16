package com.alisdlyc.monoid.dal;

import com.alisdlyc.monoid.entity.Book;
import com.alisdlyc.monoid.entity.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.regex.Pattern;

@Repository
public class BookDALImpl implements BookDAL{

    @Autowired
    private MongoTemplate template;

    @Override
    public JsonResult findByTitle(String title, Integer pageIndex) {
        //模糊匹配
        Pattern pattern = Pattern.compile("^.*"+ title + ".*$", Pattern.CASE_INSENSITIVE);
        Query query = Query.query(Criteria.where("title").regex(pattern));
        // 分页排序
        int pageSize = 10;
        Long total = template.count(query, Book.class) / pageSize + 1;

        int start = (pageIndex - 1) * pageSize;
        query.with(Sort.by(Sort.Direction.DESC, "title"));
        query.skip(start).limit(pageSize);
        List<Book> bookList = template.find(query, Book.class);

        System.out.println(total + "-- qwq --");
        return new JsonResult(total, total > pageIndex, total > 0 && pageIndex != 0, bookList);
    }
}
