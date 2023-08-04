package demo.funda;

public class ProductModelTest {
    public static void main(String[] args) {
        ProductModel productModel = new ProductModel();
        System.out.println(productModel);
        System.out.println(productModel.getProductId());
        System.out.println(productModel.getProductName());
        productModel.setPrice(70.60f);
        System.out.println(productModel);
    }
}
