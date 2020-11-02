package cn.day10.ConstructorMethodReference;

public class Demo {

    public static void printName(String name, PersonBuilder pb) {
        Person person = pb.builderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {

        printName("aas",(String name)->{
            return new Person(name);
        });

        printName("bbb",Person::new);

    }
}
