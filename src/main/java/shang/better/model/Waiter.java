package shang.better.model;

public class Waiter {
    private Integer id;

    private String waiterName;

    private String waiterCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWaiterName() {
        return waiterName;
    }

    public void setWaiterName(String waiterName) {
        this.waiterName = waiterName == null ? null : waiterName.trim();
    }

    public String getWaiterCode() {
        return waiterCode;
    }

    public void setWaiterCode(String waiterCode) {
        this.waiterCode = waiterCode == null ? null : waiterCode.trim();
    }
}