package shang.better.model;

import java.util.List;

public class BOmsOrder {
	
	private int id;
	private int lotNo;
	private String orderName;
	private List<TOmsOrderDtl> orderDtls;
	
	public List<TOmsOrderDtl> getOrderDtls() {
		return orderDtls;
	}
	public void setOrderDtls(List<TOmsOrderDtl> orderDtls) {
		this.orderDtls = orderDtls;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLotNo() {
		return lotNo;
	}
	public void setLotNo(int lotNo) {
		this.lotNo = lotNo;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	

}
