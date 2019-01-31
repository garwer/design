package factory.simple;


public class SimpleFactory {
    public static Product create(String str) {
        if("A".equals(str)) {
            return new ProductA();
        } else if("B".equals(str)) {
            return new ProductB();
        }
        return null;
    }
}
