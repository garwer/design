package observer;

/**
 * 观察者
 */
public class User implements Observer {
    private String name;
    private String msg;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        this.msg = msg;
        read();
    }

    public void read() {
        System.out.println(name + "收到的订阅消息" + msg);
    }

}
