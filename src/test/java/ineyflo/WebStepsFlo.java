package ineyflo;

import io.qameta.allure.Step;
import vtbit.WebStepsV;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

import java.util.Map;

public class WebStepsFlo {
    // SelenideElements / locator / etc

    LocatorsFlo startElement = new LocatorsFlo();

    @Step("Открыть страницу и проверить доступность элементов")
    public WebStepsFlo startOpenPage() {
        open("/");
        startElement.knopkaGlavnaya.shouldHave(text("Главная")).highlight();

        return this;
    }

    @Step("Проверка модуля Почему выбирают нас")
    public WebStepsFlo textWhatChoose() {
        startElement.textWhat.scrollTo();
        startElement.textWhat.shouldHave(text("Почему выбирают нас")).highlight();

        return this;
    }

    @Step("Банер доставка 30 мин")
    public WebStepsFlo textDelivery30() {
        startElement.del30.shouldHave(text("Доставка от 30 минут")).highlight();

        return this;
    }

    @Step("Банер Гарантия 3 дня")
    public WebStepsFlo textGuarantee() {
        startElement.Guarantee.shouldHave(text("Гарантия 3 дня на цветы")).highlight();

        return this;
    }

    @Step("Банер 100% списание бонусов")
    public WebStepsFlo textBonus() {
        startElement.Bonus.shouldHave(text("100% списание бонусов")).highlight();

        return this;
    }

    @Step("Банер Доставка")
    public WebStepsFlo textDelivery() {
        startElement.Delivery.shouldHave(text("Доставка")).highlight();

        return this;
    }

    @Step("Кнопка вверх")
    public WebStepsFlo buttonUp() {
        startElement.Up.highlight().click();

        return this;
    }

    @Step("Поле поиска")
    public WebStepsFlo searchStr(String flo) {
        startElement.Search.highlight().click();
        startElement.Search.setValue(flo).pressEnter();

        return this;
    }

    @Step("Проверка инфо в результате поиска")
    public WebStepsFlo checkFlo(Map<String, String> verifyData) {
        startElement
                .verify("Результаты поиска: ", verifyData.get("Результаты поиска: "))
                //.verify("Платеж в месяц", verifyData.get("Платеж в месяц"))
        ;
        return this;
    }


}
