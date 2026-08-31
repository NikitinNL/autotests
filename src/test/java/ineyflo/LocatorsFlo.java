package ineyflo;

import com.codeborne.selenide.SelenideElement;
import jdk.jfr.Name;
import vtbit.LocatorsV;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.String.format;

public class LocatorsFlo {

    @Name("Проверка кнопки на странице")
    public final SelenideElement knopkaGlavnaya = $$("a[href='https://ineyflo.ru/']").get(1);

    @Name("Текст на стрнанице Почему выбирают нас")
    public final SelenideElement textWhat = $x("//h2[text()='Почему выбирают нас']");

    @Name("Банер Доставка 30 минут")
    public final SelenideElement del30 = $x("//h3[text()='Доставка от 30 минут']");

    @Name("Банер Гарантия 3 дня на цветы")
    public final SelenideElement Guarantee = $x("//h3[text()='Гарантия 3 дня на цветы']");

    @Name("Банер 100% списание бонусов")
    public final SelenideElement Bonus = $x("//h3[text()='100% списание бонусов']");

    @Name("Банер Доставка")
    public final SelenideElement Delivery = $x("//h3[text()='Доставка']");

    @Name("Кнопка вверх")
    public final SelenideElement Up = $("#bt-scroll-up");

    @Name("Строка поиска")
    public final SelenideElement Search = $("input[type='search']#woocommerce-product-search-field-0");

//    @Name("Результат поиска")
//    public final SelenideElement verify = $x("//h1[text()='Результаты поиска:']");

    @Name("Результат поиска")
    public final String resultInfo = "//span[text()='Роза']";

    public LocatorsFlo verify(String key, String value) {
        $x(format(resultInfo, key)).shouldHave(text(value));
        return this;
    }




}
