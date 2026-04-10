package vtbit;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.WebDriverRunner;

import java.util.Map;

public class WebStepsV {
    // SelenideElements / locator / etc

    LocatorsV starElement = new LocatorsV();

    @Step("Открыть страницу и проверить доступный элемент")
    public WebStepsV startOpenPage() {
        open("/"); // открыли браузер
        starElement.hederPage.shouldHave(text("ВТБ ОНЛАЙН")).highlight();
        return this;
    }


    @Step("Закрыть окно cookies, если оно присутствует")
    public WebStepsV cookiesBox() {
        if ($("#cookies-box").isDisplayed()) {
            $("#cookies-box").$("#cookie-buttons").click();
            sleep(500); // небольшая пауза после закрытия
        }
        return this;
    }

    @Step("Нажать на кнопку меню Частным лицам")
    public WebStepsV clickIndividual() {
        starElement.Individual.highlight().click();
        return this;
    }

    @Step("Нажать на кнопку Ипотека в меню Частным лицам")
    public WebStepsV clickIpoteca() {
        starElement.credit.highlight().click();
        starElement.creditDonload.highlight().shouldHave(text("Ипотека"));
        //downloadIpoteca.creditDonload.click();
        return this;
    }

    @Step("Нажать на поле Регион и очистить его")
    public WebStepsV regionClick() {
        starElement.deleteRegion.scrollTo();
        starElement.deleteRegion.highlight().click();
        //regionCell.deleteRegion.clear();
        starElement.deleteClouse.click();
        return this;
    }

    @Step("Заполнить поле Регион")
    public WebStepsV regionDefine(String Region) {
        starElement.oblast.setValue(Region).pressEnter();
        return this;
    }

    @Step("Цель кредита, выбрать из выпадающего списка")
    public WebStepsV target() {
        starElement.targetClick.highlight().click();
        starElement.targetIn.highlight().click();
        return this;
    }

    @Step("Вид ипотеки")
    public WebStepsV view() {
        starElement.ipotecaIn.highlight().click();
        return this;
    }

    @Step("Вклчить тогл ЗП карта банка")
    public WebStepsV zpCard() {
        starElement.zpTogl.highlight().click();
        return this;
    }

    @Step("Указать сумму ипотеки")
    public WebStepsV sum(String sumCred) {
        starElement.sumIpoteca.click();
        starElement.sumClouse.click();
        starElement.sumInput.sendKeys(sumCred);
        return this;
    }

    @Step("Включить тогл Материнский капитал")
    public WebStepsV matherCapital() {
        starElement.matherTogl.highlight().click();
        return this;
    }

    @Step("Срок кредита")
    public WebStepsV termCred(String year) {
        starElement.timeCred.highlight().click();
        starElement.timeCred.clear();
        starElement.timeCred.setValue(year);
        return this;
    }

    @Step("Проверка инфо в сводной табличке по запрошенным параметрам")
    public WebStepsV verifyInfo(Map<String, String> verifyData) {
        starElement
                .verify("Сумма кредита", verifyData.get("Сумма кредита"))
                .verify("Платеж в месяц", verifyData.get("Платеж в месяц"))
                ;
        return this;
    }

}
