package com.shang.order.mapper.impl;

import com.shang.order.mapper.OrderMapper;
import com.shang.order.record.Order;
import com.shang.order.record.OrderExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by shangjie-work on 2016/10/21.
 */
@Component(value = "orderDao")
public class OrderMapperImpl extends MybatisBaseDAO implements OrderMapper {
    @Override
    public int countByExample(OrderExample example) {
        return getSqlSession().selectOne("com.shang.order.mapper.OrderMapper.countByExample",example);
    }

    @Override
    public int deleteByExample(OrderExample example) {
        return getSqlSession().delete("com.shang.order.mapper.OrderMapper.deleteByExample", example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return getSqlSession().delete("com.shang.order.mapper.OrderMapper.deleteByPrimaryKey",id);
    }

    @Override
    public int insert(Order record) {
        return getSqlSession().insert("com.shang.order.mapper.OrderMapper.insert",record);
    }

    @Override
    public int insertSelective(Order record) {
        return getSqlSession().insert("com.shang.order.mapper.OrderMapper.insertSelective",record);
    }

    @Override
    public List<Order> selectByExample(OrderExample example) {
        return getSqlSession().selectList("com.shang.order.mapper.OrderMapper.selectByExample",example);
    }

    @Override
    public Order selectByPrimaryKey(String id) {
        return getSqlSession().selectOne("com.shang.order.mapper.OrderMapper.selectByPrimaryKey", id);
    }

    @Override
    public int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("record",record);
        map.put("_parameter",example);
        return getSqlSession().update("com.shang.order.mapper.OrderMapper.updateByExampleSelective",map);
    }

    @Override
    public int updateByExample(@Param("record") Order record, @Param("example") OrderExample example) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("record",record);
        map.put("_parameter",example);
        return getSqlSession().update("com.shang.order.mapper.OrderMapper.updateByExample",map);
    }

    @Override
    public int updateByPrimaryKeySelective(Order record) {
        return getSqlSession().update("com.shang.order.mapper.OrderMapper.updateByPrimaryKeySelective",record);
    }

    @Override
    public int updateByPrimaryKey(Order record) {
        return getSqlSession().update("com.shang.order.mapper.OrderMapper.updateByPrimaryKey",record);
    }
}
