package clone.deep;


import clone.Appearance;
import clone.Person;

public class TestDeep {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        Appearance appearance = new Appearance();
        appearance.setEars("大耳朵");
        person.setSex("男");
        person.setName("张三");
        person.setAge(16);
        appearance.setEars("大耳朵");
        person.setAppearance(appearance);
        Person shadowPerson = (Person) person.clone();
        shadowPerson.setAge(10);
        shadowPerson.setName("李四");
        appearance.setEyss("小眼睛");
        appearance.setEars("小耳朵");
        shadowPerson.setAppearance(appearance);
        System.out.println(person);
        System.out.println(shadowPerson);
    }
}
