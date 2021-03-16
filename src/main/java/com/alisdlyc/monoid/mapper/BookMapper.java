package com.alisdlyc.monoid.mapper;

import com.alisdlyc.monoid.entity.Book;

import java.util.List;

public interface BookMapper {
    List<Book> selectByKey(String key);
}
