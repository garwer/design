package observer;

/**
 * 抽象观察者
 * 但被观察者调用方法 将通知观察者回调uodate
 */
public interface Observer {
    public void update(String msg);
}
