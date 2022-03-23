package com.ac.order.service;

import com.ac.order.entity.Order;

public interface IOrderService {
    Order makeOrder(String productId, String userId);
}
