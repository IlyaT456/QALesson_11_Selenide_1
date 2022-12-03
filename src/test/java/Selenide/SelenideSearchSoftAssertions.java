package Selenide;

import github.SelectorsGithub;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SelenideSearchSoftAssertions {

    SelectorsGithub selectorsGithub = new SelectorsGithub();

    @Test
    public void SelenideSearchSoftAssertions() {
        open("https://github.com/search?q=Selenide");
        selectorsGithub
                .goToMenuItem("Wikis")
                .goToSoftAssertions()
                .checkJUnit5();
    }
}
