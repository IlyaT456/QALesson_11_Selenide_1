package selenide;

import github.SelectorsGithub;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SelenideSearchSoftAssertionsTest {

    SelectorsGithub selectorsGithub = new SelectorsGithub();

    @Test
    public void selenideSearchSoftAssertionsTest() {
        open("https://github.com/search?q=Selenide");
        selectorsGithub
                .goToMenuItem("Wikis")
                .goToSoftAssertions()
                .checkJUnit5();
    }
}
