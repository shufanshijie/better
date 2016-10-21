package com.shang.order.service;

import com.shang.order.mapper.OrderMapper;
import com.shang.order.record.Order;

import java.util.Date;
import java.util.List;

/**
 * Created by shangjie-work on 2016/10/21.
 */
public interface OrderService {

    Order getOrderById(String id);

    List<Order> getOrdersByUser(String userId, int pageSize, int page);

    int countByUser(String userId);

    int deleteExpiredOrder(String userId,Date deadLine);

    int deleteById(String orderId);

    int updateOrderStatus(String orderStatus,String orderId);


}
