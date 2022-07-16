package cz.pumpitup.pn5.starterkit;

import org.junit.jupiter.api.Test;

public class WebNavigationTest {

    @Test
    public void searchPumpITupOnGoogle(Firefox firefox) {
        firefox
//                .waitSecondsOf(10)
                .openGoogleSearchPage()
                    .acceptCookies()
                    .typeIntoSearchBox("pumpitup sro")
                    .submit()
                .onSearchResultsPage()
                    .clickThroughFirstResult()
                .onPumpITupHomePage()
                    .assertThatContainsText("DevOps");
    }

    @Test
    public void interviewDemoTest(Firefox firefox) {
        firefox
                .openPumpoDevPage()
                    .clickOnGettingStartedButton()
                .onGettingStartedPage()
                    .goToConfigurationPage()
                .onConfigurationPage()
                    .goToTestConfiguration()
                .onTestConfigurationPage()
                    .goToConnection()
                    .assertThatTextAreaContains("A critical topic is how to manage all configurable values required to connecting to systems under test.");
    }
}