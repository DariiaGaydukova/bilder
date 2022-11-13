import java.util.OptionalInt;

public class PersonBuilder {

    private String name;

    private OptionalInt age;
    private String city;

    private String surname;
    Person person;


    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Не указаны обязательные данные!");
        }

        if (age.isPresent()) {
            person = new Person(name, surname, age);
        } else {
            person = new Person(name, surname);
        }

        if (!(city == null)) {
            person = new Person(name, surname, age, city);
        }

        return person;
    }


    public PersonBuilder setName(String name) {
        this.name = name;
        return PersonBuilder.this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return PersonBuilder.this;
    }

    public PersonBuilder setAge(int age) {
        this.age = OptionalInt.of(age);
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return PersonBuilder.this;
    }


}
