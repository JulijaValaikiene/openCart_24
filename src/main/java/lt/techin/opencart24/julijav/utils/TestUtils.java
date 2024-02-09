package lt.techin.opencart24.julijav.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class TestUtils {
    public static String getRandomNumber() {
        return RandomStringUtils.randomNumeric(1, 2);
    }
}
