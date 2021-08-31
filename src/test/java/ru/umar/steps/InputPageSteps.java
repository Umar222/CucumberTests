package ru.umar.steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Допустим;
import io.cucumber.java.ru.Затем;
import io.cucumber.java.ru.Тогда;
import ru.umar.pages.BasePage;
import ru.umar.pages.InputPage;

import static com.codeborne.selenide.Selenide.open;

public class InputPageSteps extends BasePage {

    InputPage inputPage = new InputPage();

    @Дано("в поле поиска ввожу {string}")
    public void вПолеПоискаВвожу(String test) {
        inputPage.searchInputField.val(test);
    }

    @Затем("внизу списка кликаю {string}")
    public void внизуСпискаКликаю(String text) {
        inputPage.searchButton(text).click();
    }

    @Тогда("отобразится окно со словом {string}")
    public void отобразитсяОкноСоСловом(String title) {
        inputPage.imageTitle.shouldHave(Condition.text(title));
    }

    @Допустим("открываю поисковую страницу гугла")
    public void открываюПоисковуюСтраницуГугла() {
        open(inputPageURL);
    }

    @Тогда("в списке отобразится {string}")
    public void вСпискеОтобразится(String word) {
        inputPage.firstLine.shouldHave(Condition.text(word));
    }
}
