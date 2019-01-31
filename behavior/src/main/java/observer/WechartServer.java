package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 微信公众号服务
 * 被观察者:具体的主题 当集体的主题内部发送变化 发送通知
 *
 */
public class WechartServer implements Observerable {
    private List<Observer> list;
    private String msg;

    public WechartServer() {
        list = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (!list.isEmpty()) {
            list.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < list.size(); i++) {
            Observer o = list.get(i);
            o.update(msg);
        }
    }

    public void setMsg(String msg) {
        this.msg = msg;
        System.out.println("微信服务更新订阅消息为:" + msg);
        notifyObserver();
    }
}
