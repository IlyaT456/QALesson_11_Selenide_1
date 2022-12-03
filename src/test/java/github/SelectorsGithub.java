package github;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.*;

public class SelectorsGithub {

    public SelectorsGithub goToSoftAssertions() {
        $("a[title='SoftAssertions']").shouldBe(Condition.exist).click();
        return this;
    }

    public SelectorsGithub goToMenuItem(String name) {
        $x("//a[@class='menu-item' and text()='" + name + "']").click();
        return this;
    }

    public SelectorsGithub checkJUnit5() {
        $("div[class='markdown-body']").shouldBe(Condition.text("Using JUnit5 extend test class:"));
        return this;
    }

}
