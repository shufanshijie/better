package shang.better.model;

public class TOmsOrderDtl {
	private int id;
	private int orderId;
	private int lotNo;
	private int productId;
	private String productName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getLotNo() {
		return lotNo;
	}
	public void setLotNo(int lotNo) {
		this.lotNo = lotNo;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
}
