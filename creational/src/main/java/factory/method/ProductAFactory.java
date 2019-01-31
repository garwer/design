package factory.method;


public class ProductAFactory extends MethodFactory {
    @Override
    public Product create() {
        return new ProductA();
    }
}
