package formqa;

import com.codeborne.selenide.SelenideElement;
import jdk.jfr.Name;
import vtbit.LocatorsV;

import javax.crypto.SecretKey;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.String.format;

public class LocatorsStep {

    @Name("Проверка элемента на странице после загрузки")
    public final SelenideElement elementForm = $x("//h5[text()='Student Registration Form']");

    @Name("Поле First Name")
    public final SelenideElement firstN = $("#firstName");

    @Name("Поле First Name")
    public final SelenideElement lastN = $("#lastName");

    @Name("Поле ввода Email")
    public final SelenideElement emailN = $("#userEmail");

    @Name("радиобатон generFemale")
    public final SelenideElement generFemale = $("#gender-radio-2");

    @Name("Поле мобильного телефона Mobile")
    public final SelenideElement mobileF = $("#userNumber");

    @Name("Поле даты рождения")
    public final SelenideElement birsdayDate = $("#dateOfBirthInput");

    @Name("Месяц в календаре выпадающий список")
    public final SelenideElement monthClick = $(".react-datepicker__month-select");

    @Name("Клик по месяцу - Апрель")
    public final SelenideElement monthApril = $x("//option[text()='April']");

    @Name("Клик по году в календаре")
    public final SelenideElement yearClick = $(".react-datepicker__year-select");

    @Name("Выбор года - 1995")
    public final SelenideElement year1995 = $x("//option[text()='1995']");

    @Name("Выбор даты в календаре = 30")
    public final SelenideElement dateClick = $(".react-datepicker__day--030.react-datepicker__day--weekend");

    @Name("Форма subject")
    public final SelenideElement subjectF = $("#subjectsInput");

    @Name("Клик по выпадающему списку - Maths")
    public final SelenideElement maths = $x("//div[text()='Maths']");

    @Name("Чекбокс hobbies")
    public final SelenideElement hobbiesClick = $("#hobbies-checkbox-3");

    @Name("Загрузка файла в форму")
    public final SelenideElement pictureUp = $("#uploadPicture");

    @Name("Поле адреса")
    public final  SelenideElement addressCurrent = $("#currentAddress");

    @Name("Поле State с выпадающим списком")
    public final SelenideElement stateClick = $("#react-select-3-input");

    @Name("Клик по названию Rajasthan в выпадающем списке State")
    public final SelenideElement rajasthanClick = $x("//div[text()='Rajasthan']");

    @Name("Клик по полю Sity")
    public final SelenideElement sityClick = $("#react-select-4-input");

    @Name("Клик по названию в выпадающем списке Sity")
    public final SelenideElement jaipur = $x("//div[text()='Jaipur']");

    @Name("Клик по кнопке Submit")
    public final SelenideElement submitClick = $("#submit");

    @Name("Модальное окно")
    public final SelenideElement modalWindows = $(".modal-content");

    @Name("Модальное окно с результатами")
    public final String resultInfo = ".table-striped";

    public LocatorsStep verify(String key, String value) {
        $(format(resultInfo, key)).shouldHave(text(value));
        return this;
    }

}
