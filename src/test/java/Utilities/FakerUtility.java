package Utilities;

import com.github.javafaker.Faker;

public class FakerUtility {
    private static final Faker faker = new Faker();

    public static String getAddress() {
        return faker.address().streetAddress();
    }

    public static String getCity() {
        return faker.address().city();
    }

    public static String getState() {
        return faker.address().state();
    }

    public static String getZipCode() {
        return faker.address().zipCode();
    }

    public static String getPhoneNumber() {
        return faker.phoneNumber().cellPhone();
    }

    public static String getAccountNumber() {
        return faker.number().digits(10); // 10 haneli rastgele hesap numarası
    }

    public static String getAmount() {
        return String.valueOf(faker.number().numberBetween(10, 100));
    }
}
