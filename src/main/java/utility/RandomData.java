package utility;

import com.github.javafaker.Faker;


public class RandomData {

    private RandomData() {
        
    }

    static Faker faker = new Faker();

    public static String firstName() {
        return faker.name().firstName();
    }

    public static String lastName() {
        return faker.name().lastName();
    }

    public static String company() {
        return faker.company().name();
    }

    public static String webSite() {
        return faker.internet().url();
    }

    public static String email() {
        return faker.internet().emailAddress();
    }

    public static String streetAddress() {
        return String.format("%s %s", faker.address().streetAddressNumber(), faker.address().streetName());
    }

    public static String city() {
        return faker.address().city();
    }

    public static String state() {
        return faker.address().state();
    }

    public static String zipCode() {
        return faker.address().zipCode().substring(0, 5);
    }

    public static String mobilePhone() {
        return faker.phoneNumber().cellPhone().replace('.', '-');
    }

    public static String password() {
        return faker.bothify("Lp!??##?$#?##?##??#");

    }
}
