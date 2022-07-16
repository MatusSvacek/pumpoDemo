package cz.pumpitup.pn5.starterkit.Internet.pages.pumpitup;

import cz.pumpitup.pn5.actions.AssertElementContent;
import cz.pumpitup.pn5.actions.AssertElementPresent;
import cz.pumpitup.pn5.actions.Click;
import cz.pumpitup.pn5.actions.Wait;
import cz.pumpitup.pn5.core.Lookup;
import cz.pumpitup.pn5.starterkit.Internet.pages.google.GoogleSearchPage;
import cz.pumpitup.pn5.web.WebAgentAccessor;

@Wait(value = GettingStartedPage.GETTING_STARTED_HEADER_XPATH, by = Lookup.XPATH)
public interface GettingStartedPage extends WebAgentAccessor {

    String GETTING_STARTED_HEADER_XPATH = "//span[contains(text(),'Getting started')]";
    String CONFIGURATION_BUTTON_XPATH = "//a[@title='Configuration']";
    @Click(value = CONFIGURATION_BUTTON_XPATH, by = Lookup.XPATH)
    GettingStartedPage goToConfigurationPage();

    ConfigurationPage onConfigurationPage();
}
