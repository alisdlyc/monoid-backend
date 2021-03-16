package com.alisdlyc.monoid.entity;

import lombok.Data;

import java.util.List;

@Data
/*
this.total = res.data.total;
this.hasNext = res.data.hasNext;
this.hasPre = res.data.hasPre;
this.books = res.data.data;
* */
public class JsonResult {
    private Long total;
    private boolean hasNext;
    private boolean hasPre;
    private List<Book> data;

    public JsonResult(Long total, boolean hasNext, boolean hasPre, List<Book> data) {
        this.total = total;
        this.hasNext = hasNext;
        this.hasPre = hasPre;
        this.data = data;
    }
}
