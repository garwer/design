package clone.shadow;


import clone.Person;

public class TestShadow {
    public static void main(String[] args) throws CloneNotSupportedException {
       // Appearance appearance =
        Person person = new Person();
        person.setSex("男");
        person.setName("张三");
        Person shadowPerson = (Person) person.clone();

        shadowPerson.setSex("女");
        shadowPerson.setName("李四");

        System.out.println(person.toString());
        System.out.println(shadowPerson.toString());
        System.out.println("克隆后的名字:" + shadowPerson.getName()); //李四
    }
}
