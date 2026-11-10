package formqa;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.String.format;

import com.codeborne.selenide.WebDriverRunner;
import vtbit.LocatorsV;
import vtbit.WebStepsV;

import java.util.Map;

public class FormSteps {

    LocatorsStep startElement = new LocatorsStep();

    @Step("Открыть страницу")
    public FormSteps startOpenPage() {
        open("automation-practice-form");   // открываем нужную страницу - форму для заполнения
        return this;
    }
    @Step("Проверка элемена на загруженной странице")
    public FormSteps elementForm() {
        startElement.elementForm.shouldHave(text("Student Registration Form")).highlight();
        return this;
    }
    @Step("Заполнение поля First Name")
    public FormSteps firstName(String firstName) {
        startElement.firstN.highlight().click();
        startElement.firstN.setValue(firstName).pressEnter();
        return this;
    }
    @Step("Заполнение поля Last Name")
    public FormSteps lastName(String lastName) {
        startElement.lastN.highlight().click();
        startElement.lastN.setValue(lastName).pressEnter();
        return this;
    }
    @Step("Заполнение поля Email")
    public FormSteps email(String email) {
        startElement.emailN.highlight().click();
        startElement.emailN.setValue(email);
        return this;
    }
    @Step("Радиобатон gender = Female")
    public FormSteps gender() {
        startElement.generFemale.highlight().click();
        return this;
    }
    @Step("Заполнение поля Mobile")
    public FormSteps mobile(String mobile) {
        startElement.mobileF.highlight().click();
        startElement.mobileF.setValue(mobile);
        return this;
    }

    @Step("Выставление даты в календаре")
    public FormSteps birsday() {
        startElement.birsdayDate.click();
        startElement.monthClick.click();
        startElement.monthApril.click();
        startElement.yearClick.click();
        startElement.year1995.click();
        startElement.dateClick.highlight().click();
        return this;
    }

    @Step("Заполнение поля Subjects")
    public FormSteps subjects(String SUB) {
        startElement.subjectF.click();
        startElement.subjectF.setValue(SUB);
        startElement.maths.click();

        return this;
    }

    @Step("Заполнение чекбокса hobbies")
    public FormSteps hobbies() {
        startElement.hobbiesClick.highlight().click();
        return this;
    }

    @Step("Вставляем файл")
    public FormSteps picture() {
        startElement.pictureUp.highlight().uploadFromClasspath("uploadFiles/file_1.pdf");
        return this;
    }

    @Step("Заполняем поле адрес")
    public FormSteps address(String add) {
        startElement.addressCurrent.setValue(add).highlight();
        return this;
    }

    @Step("Заполнение поля State")
    public FormSteps state() {
        startElement.stateClick.highlight().click();
        startElement.rajasthanClick.highlight().click();
        return this;
    }

    @Step("Заполнение поля Sity")
    public FormSteps sity() {
        startElement.sityClick.highlight().click();
        startElement.jaipur.highlight().click();
        return this;
    }

    @Step("Нажать на кнопку Submit")
    public FormSteps submit() {
        startElement.submitClick.highlight().click();
        return this;
    }

    @Step("Проверка появления заполненной формы")
    public FormSteps submitForm() {
        startElement.modalWindows.should();
        return this;
    }

    @Step("Проверка инфо в сводной табличке по запрошенным параметрам")
    public FormSteps verifyInfo(Map<String, String> verifyData) {
        startElement
                .verify("Student Name", verifyData.get("Student Name"))
                .verify("Student Email", verifyData.get("Student Email"))
                .verify("Mobile", verifyData.get("Mobile"))
                .verify("Address", verifyData.get("Address"))
                .verify("Subjects", verifyData.get("Subjects"))
                .verify("Picture", verifyData.get("Picture"))
                .verify("Gender", verifyData.get("Gender"))
                .verify("Date of Birth", verifyData.get("Date of Birth"))
                .verify("Hobbies", verifyData.get("Hobbies"))
                .verify("State and City", verifyData.get("State and City"))
                ;
        return this;
    }
}
