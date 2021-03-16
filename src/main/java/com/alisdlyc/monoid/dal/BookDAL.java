package com.alisdlyc.monoid.dal;

import com.alisdlyc.monoid.entity.Book;
import com.alisdlyc.monoid.entity.JsonResult;

import java.util.List;

public interface BookDAL {
    JsonResult findByTitle(String title, Integer pageIndex);
}
