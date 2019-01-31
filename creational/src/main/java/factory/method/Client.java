package factory.method;


public class Client {
    public static void main(String[] args) {
        MethodFactory methodFactory = new ProductAFactory();
        Product product = methodFactory.create();
        product.create();
    }
}
