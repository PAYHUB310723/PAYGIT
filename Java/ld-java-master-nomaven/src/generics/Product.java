package generics;


public class Product {
	@Override
	public String toString() {
		return "Product{" +
				"productId=" + productId +
				", productName='" + productName + '\'' +
				'}';
	}

	private  int productId =1; // required
	private  String productName = "MsTeams"; // required

	public Product(int productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}

}