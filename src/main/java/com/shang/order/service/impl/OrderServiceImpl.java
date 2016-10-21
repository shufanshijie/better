package com.shang.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shang.order.mapper.OrderMapper;
import com.shang.order.record.Order;
import com.shang.order.record.OrderExample;
import com.shang.order.service.OrderService;

import java.util.Date;
import java.util.List;

/**
 * Created by shangjie-work on 2016/10/21.
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderDao ;
    @Override
    public Order getOrderById(String id) {
        return orderDao.selectByPrimaryKey(id);
    }

    @Override
    public List<Order> getOrdersByUser(String userId, int pageSize, int page) {
        OrderExample example = new OrderExample();
        example.createCriteria().andUserIdEqualTo(userId);
        return orderDao.selectByExample(example);
    }

    @Override
    public int countByUser(String userId) {
        OrderExample example = new OrderExample();
        example.createCriteria().andUserIdEqualTo(userId);
        return orderDao.countByExample(example);
    }

    @Override
    public int deleteExpiredOrder(String userId, Date deadLine) {
        OrderExample example = new OrderExample();
        example.createCriteria().andUserIdEqualTo(userId).andCreateTimeLessThan(deadLine);
        return orderDao.deleteByExample(example);
    }

    @Override
    public int deleteById(String orderId) {
        return orderDao.deleteByPrimaryKey(orderId);
    }

    @Override
    public int updateOrderStatus(String orderStatus, String orderId) {
        Order order = new Order();
        order.setOrderStatus(orderStatus);
        OrderExample example = new OrderExample();
        example.createCriteria().andIdEqualTo(orderId);
        return orderDao.updateByExampleSelective(order,example);
    }
}
