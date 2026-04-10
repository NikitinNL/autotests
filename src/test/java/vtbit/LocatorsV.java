package vtbit;

import com.codeborne.selenide.SelenideElement;
import jdk.jfr.Name;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.String.format;

public class LocatorsV {

    @Name("Проверка кнопки на странице")
    public final SelenideElement hederPage = $("a[href='https://online.vtb.ru']");
    @Name("Убираем Cookies")
    public final SelenideElement deleteCookies = $("a[href='https://online.vtb.ru']");
    @Name("Кнопкв 'Частным лицам' в верхнем меню")
    public final SelenideElement Individual = $("label[for='9ebrgmspmluqfghz57f4-desktop'].cWKJkk");
    @Name("Кнопка Ипотека")
    public final SelenideElement credit = $x("//span[text()='Ипотека']");
    @Name("Банер Ипотека")
    public final SelenideElement creditDonload = $(".iGChoU");
    @Name("Поле Регион")
    public final SelenideElement deleteRegion = $$(".v1-c-dkOKee").get(0);
    @Name("Кнопка очистки в поле Регион")
    public final SelenideElement deleteClouse = $("button[aria-label='Регион недвижимости Очистить'].v1-c-fMBMiR");
    @Name("Полле для ввода в поле Регион")
    public final SelenideElement oblast = $$("#realEstateRegionSearch").get(0);
    @Name("Поле Цель кредита выпадающий список")
    public final SelenideElement targetClick = $$(".v1-c-dkOKee").get(1);
    @Name("Выпадающий список - Квартира в новостройки")
    public final SelenideElement targetIn = $("div[title='Квартира в новостройке']");
    @Name("Кнопка IT-ипотека")
    public final SelenideElement ipotecaIn = $$(".v1-c-hITeeE").get(2);
    @Name("Тогл зарплатная карта")
    public final SelenideElement zpTogl = $("input[value='isPayrollClient']");
    @Name("Поле Сумма ипотеки")
    public final SelenideElement sumIpoteca = $$(".v1-c-dkOKee").get(2);
    @Name("Кнопка очистки поля Сумма ипотеки")
    public final SelenideElement sumClouse = $$("button[aria-label='Стоимость недвижимости шесть миллионов рублей Очистить']").get(0);
    @Name("Поле для ввода Суммы ипотеки")
    public final SelenideElement sumInput = $("#cost");
    @Name("тогл Материнский капитал")
    public final SelenideElement matherTogl = $("input[value='useMaternalCapital']");
    @Name("Поле Срок кредита")
    public final SelenideElement timeCred = $("#loanTerm");
    @Name("Таблица результата")
    public final String resultInfo = "//p[text()='%s']/following-sibling::p";

    public LocatorsV verify(String key, String value) {
        $x(format(resultInfo, key)).shouldHave(text(value));
        return this;
    }

}
