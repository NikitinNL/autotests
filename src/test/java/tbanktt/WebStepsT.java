package tbanktt;

import io.qameta.allure.Step;
import tbanktt.utils.RandomUtilsT;
//import tbank.helpers.HighlightUtils;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class WebStepsT {


    String telephone = RandomUtilsT.getRandomTelephone(),
            username = RandomUtilsT.getRandomUserName(),
            birthday= RandomUtilsT.getRandomBirthday(),
            username2 = username,
            birthday2 = birthday;



    @Step("Открыть страницу и проверить наличие элемента")
    public void openPage() {
        open("/");
        $(".bb0iMjkRt").shouldHave(text("Оформить карту")).highlight();
    }

    @Step("Оформление кредитной карты")
    public void clickSummCred() {

        $("button[data-qa-type='tui/segmented-item']").shouldHave(text("Кредитная карта")).highlight();
        // Главное меню выпадающее
        $("span[data-test='menu-item-0-title']").highlight().hover();
        $("a[href='/cards/credit-cards/'].abdq8u6g5").highlight().click();
        // Оформить платинум карту
        $("a[href='/cards/credit-cards/form/platinumtest2/'].abMOdGcBa").highlight().click();
        // Заполнение кредитного лимита
        $(".abqH57b3u").highlight().click();
        $("input[aria-labelledby='fGPYDGGA9J']").clear();
        $("input[aria-labelledby='fGPYDGGA9J']").setValue("00").pressEnter();
        // Чек боксы для потребностей и поиск элементов
        $("button[data-qa-type='uikit/multiSelect.arrow']").highlight().click();
        $("span[data-qa-type='uikit/multiSelect.dropdown.item.title']").highlight().hover();
        $("div[data-qa-type='uikit/multiSelect.dropdown.item'].kbPLoS1xs").highlight().click();
        $("div[data-dropdown-item-index='2'").highlight().click();
        $("div[data-dropdown-item-index='4'").highlight().click();
        $(".ibtzm5psy").click();
        // Указываем рандомный телефон
        //$("div[data-qa-type='uikit/inputPhone.value.text']").highlight().click();
        $("div[data-qa-type='uikit/inputPhone']").highlight().click();
        $("input[name='phone_mobile']").highlight().click();
        $("input[name='phone_mobile']").setValue(telephone).highlight();
        back();
    }


    @Step("Заявка на накопительный счет")
    public void savingAccount() {
        // Главное меню выпадающее
        $("span[data-test='menu-item-0-title']").highlight().hover();
        $("a[href='/savings/saving-account/'].abdq8u6g5").highlight().click();
        // Проверка элемента на новой странице
        $(".cbmXX3skm").shouldHave(text("Откройте накопительный счет —"));
        // нажать на кнопку "Оформить"
        $("button[data-qa-type='tui/button']").highlight().click();
        // заполнение формы
        $("label[data-qa-data='Premium']").highlight().shouldHave(text("11% годовых c"));
        $("input[value='Premium']").highlight().click();
        $("div[data-qa-type='uikit/inputFio.inputBox.main'].wbsIjBENu").click();
        $("input[aria-autocomplete='list']").setValue(username).highlight();
        $("div[data-qa-type='uikit/inputPhone']").click();
        $("input[name='phone_mobile']").setValue(telephone).highlight();
        $("div[data-qa-type='uikit/input.inputBox.inputContainer']").click();
        $("input[name='birthdate']").setValue(birthday).highlight();
        $("input[aria-labelledby=':rj:-label :rj:-title-0 :rj:-description-0']").highlight().click();
    }

    @Step("Калькулятор ипотечного страхования")
    public void mortgageInsurance() {
        // Главное меню выпадающее
        $("span[data-test='menu-item-0-title']").highlight().hover();
        $("a[href='/insurance/mortgage/'].abi1WX8dx").highlight().click();
        // Проверка элемента на новой странице
        $("h1[data-test='htmlTag title']").highlight().shouldHave(text("Купите страховку со скидкой 10% и получите шанс погасить ипотеку"));
        // Нажать на кнопку расчитать стоимость
        $(".bb0iMjkRt").highlight().click();
        // Заполнить форму
        $("div[data-guid='618aacdd-4251-4aac-b2e6-e39737e63335']").highlight().shouldHave(text("Калькулятор страхования ипотеки"));
        $(".kbMel6HUv").highlight().click();
        $("div[data-dropdown-item-index='1']").highlight().click();
        $$(".sbMel6HUv").get(1).highlight().click();
        $$(".sbMel6HUv").get(1).highlight().click();
        $("div[data-dropdown-item-index='3']").$(byText("Таунхаус")).highlight().click();
        $("div[data-qa-type='uikit/InputMoney uikit/InputMoney_required']").highlight().click();
        $("input[name='mortgage_balance']").setValue("5000000").pressEnter().highlight();
        $("input[name='dnd']").click();
        $("input[name='dnd']").setValue("06.03.2026");
        $("input[name='insurer_data_fio']").setValue(username).pressEnter().highlight();
        $("input[name='insurer_data_birthdate']").setValue(birthday).highlight();
        $("input[name='phone_mobile']").setValue(telephone).highlight();
    }



}
