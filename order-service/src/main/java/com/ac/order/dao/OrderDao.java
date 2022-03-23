package com.ac.order.dao;

import com.ac.order.entity.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {

    public void insert(Order order){
        System.out.println("订单插入数据库成功");
    }
}
