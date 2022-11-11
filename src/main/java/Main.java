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


    }
}