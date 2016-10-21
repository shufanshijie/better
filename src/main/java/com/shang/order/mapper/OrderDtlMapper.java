package com.shang.order.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.shang.order.record.OrderDtl;
import com.shang.order.record.OrderDtlExample;

public interface OrderDtlMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderform_order_detail
     *
     * @mbggenerated
     */
    int countByExample(OrderDtlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderform_order_detail
     *
     * @mbggenerated
     */
    int deleteByExample(OrderDtlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderform_order_detail
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderform_order_detail
     *
     * @mbggenerated
     */
    int insert(OrderDtl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderform_order_detail
     *
     * @mbggenerated
     */
    int insertSelective(OrderDtl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderform_order_detail
     *
     * @mbggenerated
     */
    List<OrderDtl> selectByExample(OrderDtlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderform_order_detail
     *
     * @mbggenerated
     */
    OrderDtl selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderform_order_detail
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") OrderDtl record, @Param("example") OrderDtlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderform_order_detail
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") OrderDtl record, @Param("example") OrderDtlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderform_order_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OrderDtl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_orderform_order_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OrderDtl record);
}