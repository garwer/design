package cglib.constructionTest;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException {
        Class inner = Class.forName("cglib.constructionTest.Target$Student");
        //获取内部类构造函数
        Constructor[] constructors = inner.getDeclaredConstructors();
        for(Constructor c : constructors){
            System.out.println(Arrays.toString(c.getParameterTypes()));
        }
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Target.Student.class);
        enhancer.setCallback(NoOp.INSTANCE);
        Target.Student student = (Target.Student) enhancer.create();
        //Target.Student student = (Target.Student) enhancer.create(new Class[]{Target.class}, new Object[]{new Target()});
        System.out.println(student.name);
    }
}
