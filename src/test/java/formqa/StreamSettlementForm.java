package formqa;
import org.junit.jupiter.params.provider.Arguments;   // !!!!! только такой импорт

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamSettlementForm {
    public static Stream<Arguments> formqa1() {
        Map<String, String> params = new HashMap<>();
        params.put("First Name", "Иванов");
        params.put("Last Name", "Иван");
        params.put("Email", "ivan2026@example.com");
        params.put("Mobile", "9001231212");
        params.put("Address", "Moscow never sleeps");
        params.put("SUB", "Math");


        Map<String, String> verifyData = new HashMap<>();
        verifyData.put("Student Name", "Иванов Иван");
        verifyData.put("Student Email", "ivan2026@example.com");
        verifyData.put("Mobile", "9001231212");
        verifyData.put("Address", "Moscow never sleeps");
        verifyData.put("Subjects", "Math");
        verifyData.put("Picture", "file_1");
        verifyData.put("Gender", "Female");
        verifyData.put("Date of Birth", "30 April,1995");
        verifyData.put("Hobbies", "Music");
        verifyData.put("State and City", "Rajasthan Jaipur");

        return Stream.of(Arguments.of(params, verifyData));

    }
}
