package com.alisdlyc.monoid.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document("books")
public class Book implements Serializable {
    private String title;
    private String authors;
    private String classno;
    private String classnoAbs;
    private String commentCount;
    private String guancangCount;
    private String heading;
    private String imgUrl;
    private String isn;
    private String kejieCount;
    private String libraryId;
    private String libraryName;
    private String pubdateDate;
    private String publisher;
    private String reGrade;
    private String recCtrlId;
}
