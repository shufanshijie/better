package shang.better.model;

import java.util.List;

public class BOmsBatchOrder {
	
	private int id;
	private String batchName;
	private List<BOmsOrder> orders;
	public List<BOmsOrder> getOrders() {
		return orders;
	}
	public void setOrders(List<BOmsOrder> orders) {
		this.orders = orders;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	
}
