package utils;

import com.github.javafaker.Faker;

import java.util.Locale;

import static homealfa.utils.RandomUtils.getRandomInt;

public class RandomUtilsT {

    Faker faker = new Faker();

    public static String getRandomTelephone() {
        return "9" + getRandomInt(11,99) + getRandomInt(111,999) + getRandomInt(11,99) + getRandomInt(11,99);
        //return new Faker().phoneNumber().phoneNumber();
    }

    public static String getRandomUserName() {
        return new Faker((new Locale("ru"))).name().fullName();
    }

    public static String getRandomBirthday() {
        int day = getRandomInt(1, 28);
        int month = getRandomInt(1, 12);
        int year = getRandomInt(1970, 2008);

        // Форматируем с ведущими нулями: дд.мм.гггг
        return String.format("%02d.%02d.%04d", day, month, year);
    }
}
