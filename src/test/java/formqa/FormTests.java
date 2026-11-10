package formqa;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;

public class FormTests extends TestBaseForm{

    //@Test  // Тэг   - не сочетается с @ParameterizedTest
    @Tag("form-qa")
    @Feature("Заполнение формы") // Проверяемый функцонал
    @Story("Проверка заполнения формы")   // Создание заявки
    @Owner("Nikitin")     // Автор
    @Severity(SeverityLevel.BLOCKER)   // Уровень критичности функционала
    @Link(type = "manual", value = "ID_TK", url = "https://testing..../")  // Вид тестирования / ID TK / Ссылка на ТК
    @DisplayName("Проверка заполения формы")    // Наименование теста
    @MethodSource("formqa.StreamSettlementForm#formqa1")
    @ParameterizedTest(name = "form-qa - {0}")

    void formqa1(Map<String, String> params, Map<String, String> verifyData) {

        new FormSteps()
                .startOpenPage()                     // Открыть страницу с формой для запонения
                .elementForm()                       // Проверить элемент на странице после загрузки
                .firstName(params.get("First Name")) // Вводим имя
                .lastName(params.get("Last Name"))   // Вводим фамилию
                .email(params.get("Email"))          // Вводим почту
                .gender()                            // Радиобатон отмечаем
                .mobile(params.get("Mobile"))        // Вводим телефон
                .birsday()                           // Выставляем дату в календаре
                .subjects(params.get("SUB"))         // Выпадающий список выбор
                .hobbies()                           // Чек-бокс отмечаем
                .picture()                           // Загружаем файл
                .address(params.get("Address"))      // Заполнение поле Address
                .state()                             // Выпадающий список State
                .sity()                              // Выпадающий список Sity
                .submit()                            // Кнопка Submit
                .submitForm()                        // Дождаться модального окна
                .verifyInfo(verifyData);             // Проверка заполненных параметров в модальном окне
    }
}
