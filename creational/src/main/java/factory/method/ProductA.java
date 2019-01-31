package factory.method;


public class ProductA implements Product {

    @Override
    public void create() {
        System.out.println("生成产品A");
    }
}
