package ineyflo;

import org.junit.jupiter.params.provider.Arguments;   // !!!!! только такой импорт

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamSettlementFlo {

    public static Stream<Arguments> floit1() {
        Map<String, String> params = new HashMap<>();
        params.put("Вид цветка", "Роза");
        //params.put("****", "****");
        //params.put("****", "****");

        Map<String, String> verifyData = new HashMap<>();
        verifyData.put("Результаты поиска: ", "Роза");
        //verifyData.put("*****", "*****");


        return Stream.of(Arguments.of(params, verifyData));
    }
}
