package com.ac.order.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Order {

    private String id;

    private String orderNo;

    private Long priceFen;

    private String img;

    private Date createTime;

    private String userId;

    private String userName;

    private String productId;
}
