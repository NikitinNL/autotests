package vtbit;
import org.junit.jupiter.params.provider.Arguments;   // !!!!! только такой импорт

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamSettlementV {

    public static Stream<Arguments> vtbit1() {
        Map<String, String> params = new HashMap<>();
        params.put("Регион недвижимости", "Московская область");
        params.put("Стоимость недвижимости", "3000000");
        params.put("Срок кредита", "10");

        Map<String, String> verifyData = new HashMap<>();
        verifyData.put("Сумма кредита", "1 690 266 ₽");
        verifyData.put("Платеж в месяц", "18 765 ₽");


        return Stream.of(Arguments.of(params, verifyData));
    }


}
