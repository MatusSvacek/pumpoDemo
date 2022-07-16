package cz.pumpitup.pn5.starterkit.Internet.pages.pumpitup;

import cz.pumpitup.pn5.actions.AssertElementPresent;
import cz.pumpitup.pn5.actions.Click;
import cz.pumpitup.pn5.core.Lookup;
import cz.pumpitup.pn5.web.WebAgentAccessor;
import cz.pumpitup.pn5.web.actions.Navigate;

@Navigate(value = "https://pumpo5.dev/#/")
public interface PumpoDevPage extends WebAgentAccessor {

    String GETTING_STARTED_BUTTON_XPATH = "//div/p/a";
    @Click(value = GETTING_STARTED_BUTTON_XPATH, by = Lookup.XPATH)
    PumpoDevPage clickOnGettingStartedButton();

    GettingStartedPage onGettingStartedPage();

}

