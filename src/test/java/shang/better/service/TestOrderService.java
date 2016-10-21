package shang.better.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.shang.order.record.Order;
import com.shang.order.service.OrderService;

import java.util.Calendar;
import java.util.List;

/**
 * Created by shangjie-work on 2016/10/21.
 */
public class TestOrderService extends TestBase{
    Log log = LogFactory.getLog(TestOrderService.class);

    @Autowired
    private OrderService orderService ;
    @Test
    public void testSelectById(){
        String orderId = "1000161021000060";
        Order order = orderService.getOrderById(orderId);
        System.out.println(order.getAddress());
        Assert.assertTrue(order.getAddress().length()>0);
    }
    @Test
    public void testSelectByUserId(){
        String userId = "117203";
        List<Order> orders = orderService.getOrdersByUser(userId,100,1);
        System.out.println("testSelectByUserId:"+orders.size());
        assert (orders.size()>0);
    }

    @Test
    public void testCountByUserId(){
        String userId = "117203";
       int orderSize = orderService.countByUser(userId);
        System.out.println("testCountByUserId:"+orderSize);
        assert (orderSize>0);
    }

    @Test
    public void testDeleteExpiredOrder(){
        String userId = "117203";
        Calendar cal = Calendar.getInstance();
        cal.set(2016,1,1);
        int orderSize = orderService.deleteExpiredOrder(userId,cal.getTime());
        System.out.println("testDeleteExpiredOrder:"+orderSize);
        assert (orderSize>0);
    }

    @Test
    public void testDeleteById(){
        String orderId = "1000151207000712";
        int orderSize = orderService.deleteById(orderId);
        System.out.println("testDeleteById:"+orderSize);
        assert (orderService.getOrderById(orderId)==null);
    }

    @Test
    public void testUpdateOrderStatus(){
        String orderId = "1000151208000002";
        String orderStatus = "PAID";
        int orderSize = orderService.updateOrderStatus(orderStatus,orderId);
        System.out.println("testUpdateOrderStatus:"+orderSize);
        assert (orderStatus.equals(orderService.getOrderById(orderId).getOrderStatus()));
    }


}
