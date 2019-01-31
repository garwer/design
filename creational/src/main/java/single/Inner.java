package single;

public class Inner {
    private Inner(){};

    private static Inner getOmstamce() {
        return InnerClass.inner;
    }

    private static class InnerClass {
        private static Inner inner = new Inner();
    }
}
