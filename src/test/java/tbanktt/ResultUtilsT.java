package tbanktt;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultUtilsT extends WebStepsT {

    @Step("Перейти в Мой полис")
    public void myProfile() {

        $(".abJpbImay").highlight().click(); // Нажать на ссылку "Моя анкета"
        $("div[data-qa-type='desktopPopup/content']").should(appear); // Дождаться появления анкеты
    }

    @Step("Проверка заполнения формы Мой полис")
    public void resultsProfile() {

        $("div[data-qa-type='tui/dialog-layout.content']").shouldHave(text("Тип недвижимости")).highlight();
        $("div[data-qa-type='tui/dialog-layout.content']").shouldHave(text("Таунхаус")).highlight();
        $("div[data-qa-type='tui/dialog-layout.content']").shouldHave(text("Вид страхования")).highlight();
        $("div[data-qa-type='tui/dialog-layout.content']").shouldHave(text("Страхование жизни и здоровья")).highlight();
        $("div[data-qa-type='tui/dialog-layout.content']").shouldHave(text("Страховая сумма")).highlight();
        $("div[data-qa-type='tui/dialog-layout.content']").shouldHave(text("5 500 000 ₽")).highlight();
        $("div[data-qa-type='tui/dialog-layout.content']").shouldHave(text("Срок действия полиса")).highlight();
        $("div[data-qa-type='tui/dialog-layout.content']").shouldHave(text("06.03.2026 - 05.03.2027")).highlight();
        $("div[data-qa-type='tui/dialog-layout.content']").shouldHave(text("Страхователь")).highlight();
        //$("div[data-qa-type='tui/dialog-layout.content']").shouldHave(text(username)).highlight();
        $("div[data-qa-type='tui/dialog-layout.content']").shouldHave(text("Дата рождения")).highlight();
        $("div[data-qa-type='tui/dialog-layout.content']").shouldHave(text(birthday)).highlight();
    }

    @Step("Вернуться к оформлению")
    public void backInsurance() {
        $(byText("Вернуться к оформлению")).highlight().click();
    }

    @Step("Проверка закрытия формы Мой полис")
    public void checkingClosure() {
        $(".abUO7kziR").shouldHave(text("Данные ипотеки")).highlight();
    }

}
