package observer;

public class Test {
    public static void main(String[] args) {
        WechartServer server = new WechartServer();
        User zhangsan = new User("张三");
        User lisi = new User("李四");
        server.registerObserver(zhangsan);
        server.registerObserver(lisi);
        server.setMsg("php是世上最好的语言");

        server.removeObserver(lisi);
        server.setMsg("java是世上最好的语言");

    }
}
