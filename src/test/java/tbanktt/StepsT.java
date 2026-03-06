package tbanktt;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class StepsT extends TastBaseT {


    @Test
    @Tag("tbanktt")  // Тэг ТК
    @Feature("UI проверка")    // Проверяемый функционал
    @Story("Проверка отдельных модулей страницы")    // Поментка
    @Owner("Nikitin")   // Автор
    @Severity(SeverityLevel.BLOCKER)   // Уровень критичности функционала
    @Link(value = "Testing", url = "https://testing..../")  // ссылка на ТК в тест плане
    @DisplayName("Проверка отдельных модулей")  // Название ТК

    public void autotestTbank() {

        WebStepsT steps = new WebStepsT();
        ResultUtilsT stepsP = new ResultUtilsT();

        steps.openPage();  // Отрыли страницу и проверка наличие элемента на странице

        //steps.clickSummCred(); // Проверка заполнения формы на кредитную карту

        //steps.savingAccount(); // Проерка хаполнения формы на накопительный счет

        steps.mortgageInsurance(); // Проверка формы заполнения калькулятора ипотечного страхования

        stepsP.myProfile(); // Перейти в Мой полис

        stepsP.resultsProfile(); // Проверка заполнения формы Мой полис

        stepsP.backInsurance(); // Закрываем Мой полис

        stepsP.checkingClosure(); // Проверка закрытия формы Мой полис
    }


}
