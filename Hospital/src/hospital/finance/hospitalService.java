package hospital.finance;

public class hospitalService {
	//attributes
	private int serviceID;
	private String serviceName;
	private double price;
	
	//getters
	public int getServiceID() {
		return serviceID;
	}
	
	public String getServiceName() {
		return serviceName;
	}
	
	public double getPrice() {
		return price;
	}
	
	//setters
	public void setServiceID(int serviceID) {
		this.serviceID = serviceID;
	}
	
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
