package vtbit;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;

public class VtbTests extends TastBaseV{

    //@Test  // Тэг   - не сочетается с @ParameterizedTest
    @Tag("vtbit-1")
    @Feature("Заполнение формы заявки") // Проверяемый функцонал
    @Story("Проверка ")   // Создание заявки
    @Owner("Nikitin")     // Автор
    @Severity(SeverityLevel.BLOCKER)   // Уровень критичности функционала
    @Link(type = "manual", value = "ID_TK", url = "https://testing..../")  // Вид тестирования / ID TK / Ссылка на ТК
    @DisplayName("Проверка отдельных модулей")    // Название плохое
    @MethodSource("vtbit.StreamSettlementV#vtbit1")
    @ParameterizedTest(name = "vtbit-1 - {0}")

    void vtbit1(Map<String, String> params) {

        new WebStepsV()
                .startOpenPage()
                .clickIndividual()
                //.cookiesBox()
                .clickIpoteca()
                .cookiesBox()
                .regionClick()
                .regionDefine(params.get("Регион недвижимости"))
                .target()
                .view()
                .zpCard()
                .sum(params.get("Стоимость недвижимости"))
                .matherCapital()
                .termCred(params.get("Срок кредита"))
                .verifyInfo();
    }

}
