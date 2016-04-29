package shang.better.model;

import java.util.List;

public class BOmsOrder {
	
	private int id;
	private TOmsOrder order;
	private List<TOmsOrderDtl> orderDtls;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TOmsOrder getOrder() {
		return order;
	}
	public void setOrder(TOmsOrder order) {
		this.order = order;
	}
	
	public List<TOmsOrderDtl> getOrderDtls() {
		return orderDtls;
	}
	public void setOrderDtls(List<TOmsOrderDtl> orderDtls) {
		this.orderDtls = orderDtls;
	}
	

}
