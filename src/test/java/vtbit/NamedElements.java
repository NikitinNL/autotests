package vtbit;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

/**
 * Интерфейс NamedElements. Содержит методы с локаторами помеченными аннотацией @Name.
 * <p>
 * <p>Поддержка fluent interface Page Object ов
 * <p>Поддержка аннотаци @Name для локаторов переменных внутри Page Object
 *
 *@author Nikitin Nikita
 */


//public interface NamedElements<T>  {
//     @Step("Клик по элементу '{elementName}' с параметрами {format}")
//     default T clickElement(String elementName, String... format) {
//         if (format.length == 0) setCurrentStepName(format("Клик по элементу '%s'", elementName));
//         String xpath = formatLocator(elementName, format);
//         SelenideElement element = $x(xpath).as(elementName);
//         doWithHandleThrowable(elementName, xpath,
//                 ()-> {
//             element.should(visible).hover();
//             screenShot(element);
//             element.click();
//             return element;
//                 }
//                 );
//         return (T) this;
//     }
//}
