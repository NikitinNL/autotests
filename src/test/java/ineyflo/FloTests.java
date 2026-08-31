package ineyflo;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;

public class FloTests extends TastBaseFlo {
    @Tag("floit-1")
    @Feature("Проверка страницы") // Проверяемый функцонал
    @Story("Проверка")            // Создание заявки
    @Owner("Nikitin")             // Автор
    @Severity(SeverityLevel.BLOCKER)   // Уровень критичности функционала
    @Link(type = "manual", value = "ID_TK", url = "https://testing..../")  // Вид тестирования / ID TK / Ссылка на ТК
    @DisplayName("Проверка отдельных модулей")    // Название плохое
    @MethodSource("ineyflo.StreamSettlementFlo#floit1")
    @ParameterizedTest(name = "floit - {0}")

    void floit1(Map<String, String> params, Map<String, String> verifyData) {

        new WebStepsFlo()
                .startOpenPage()
                .textWhatChoose()
                .textDelivery30()
                .textGuarantee()
                .textBonus()
                .textDelivery()
                .buttonUp()
                .searchStr(params.get("Вид цветка"))
                .checkFlo(verifyData);


    }

}
