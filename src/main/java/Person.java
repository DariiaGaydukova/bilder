import java.util.OptionalInt;

public class Person {


    private static String name;
    private static String surname;

    private OptionalInt age;

    public void setCity(String city) {
        this.city = city;
    }

    private String city;

    public Person(String name, String surname, OptionalInt age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public Person(String name, String surname, OptionalInt age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public static String getSurname() {
        return surname;
    }


    public void happyBirthday() {
        age = OptionalInt.of(age.getAsInt() + 1);
    }

    public boolean hasAge() {
        return age.isPresent();

    }

    public boolean hasAddress() {
        if (city == null) {
            return false;
        } else return true;

    }

    public static String getName() {
        return name;
    }


    public OptionalInt getAge() {
        return age;
    }


    public String getCity() {
        return city;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAge(0)
                .setCity(getCity());

    }


    @Override
    public String toString() {
        return "Person{" +
                "name= " + name + '\'' +
                ", surname= " + surname + '\'' +
                ", age= " + age.getAsInt() +
                ", city= " + getCity() +
                '}';
    }
}




