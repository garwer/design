package cglib;

import cglib.filter.DaoFilter;
import cglib.mapper.Dao;
import cglib.proxy.DaoAnotherProxy;
import cglib.proxy.DaoProxy;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

public class Client {
    public static void main(String[] args) {
        //将代理类存到本地磁盘
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");
        //实例化增强器
        Enhancer enhancer = new Enhancer();
        //设置目标类
        enhancer.setSuperclass(Dao.class);
        //设置拦截对象 回调的实现类
        //enhancer.setCallback(new DaoProxy());
        enhancer.setCallbacks(new Callback[]{new DaoProxy(), new DaoAnotherProxy(),NoOp.INSTANCE});
        enhancer.setCallbackFilter(new DaoFilter());
        //使用create 返回Object 生成代理类并返回实例
        Dao dao = (Dao) enhancer.create();
        //select优先级高 使用DaoProxy
        dao.select();
        dao.delete(); //无法代理被final修饰的方法
    }
}
