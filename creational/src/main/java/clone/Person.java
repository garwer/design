package clone;

public class Person implements Cloneable{
    private String sex;
    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Appearance appearance;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public void setAppearance(Appearance appearance) {
        this.appearance = appearance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", appearance=" + appearance +
                '}';
    }
}
/*     @Override
     public Object clone() {
         Object o = null;
         try {
             //Object中的clone()识别出你要复制的是哪一个对象
             o = (Person) super.clone();
         } catch (CloneNotSupportedException e) {
             System.out.println(e.toString());
         }
         return o;
     }*/


