public class Main {
    public static void main(String[] args) {

        Person mother = new PersonBuilder()
                .setName("Ann")
                .setSurname("Ivanova")
                .setAge(31)
                .setCity("Ivanovo")
                .build();
        System.out.println(mother);

        Person doughter = mother.newChildBuilder()
                .setName("Ira")
                .build();
        System.out.println(doughter);

        try {
            // Не хватает обязательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
