package com.alisdlyc.monoid.controller;

import com.alisdlyc.monoid.dal.BookDALImpl;
import com.alisdlyc.monoid.entity.Book;
import com.alisdlyc.monoid.entity.JsonResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@CrossOrigin
public class BookController {

    private final BookDALImpl bookDAL;

    public BookController(BookDALImpl bookDAL) {
        this.bookDAL = bookDAL;
    }

//    @RequestMapping(value = {"/search/{title}"}, method = RequestMethod.GET)
//    public JsonResult getAllBooks(@PathVariable("title") String title) {
//        return bookDAL.findByTitle(title);
//    }

    @PostMapping(value = "/search")
    public JsonResult postBooks(@RequestParam("title") String title, @RequestParam("pageIndex") Integer pageIndex) {
        return bookDAL.findByTitle(title, pageIndex);
    }

}
