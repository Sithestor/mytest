package com.demo1.pojo;

import lombok.*;

import java.util.Date;
@Data
public class Items {
    private Integer id;
    private String name;
    private Double price;
    private String pic;
    private Date createtime;
    private String detail;


}
