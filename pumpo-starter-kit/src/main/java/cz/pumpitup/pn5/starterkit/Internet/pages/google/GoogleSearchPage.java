package cz.pumpitup.pn5.starterkit.Internet.pages.google;

import cz.pumpitup.pn5.actions.Click;
import cz.pumpitup.pn5.actions.ExtendedAction;
import cz.pumpitup.pn5.actions.SetValue;
import cz.pumpitup.pn5.actions.Wait;
import cz.pumpitup.pn5.core.Lookup;
import cz.pumpitup.pn5.web.WebAgentAccessor;
import cz.pumpitup.pn5.web.actions.Navigate;
import org.openqa.selenium.By;

@Navigate("https://www.google.com")
@Wait(value = GoogleSearchPage.ACCEPT_BUTTON_XPATH, by = Lookup.XPATH)
public interface GoogleSearchPage extends WebAgentAccessor {

    String ACCEPT_BUTTON_XPATH = "//button[2]";
    String QUERY = "q";

    @Click(value = ACCEPT_BUTTON_XPATH, by = Lookup.XPATH)
    GoogleSearchPage acceptCookies();

    @SetValue(value = QUERY, by = Lookup.NAME)
    GoogleSearchPage typeIntoSearchBox(String term);

    @ExtendedAction
    default GoogleSearchPage submit() {
        getAgent().getDriver().findElement(By.name(QUERY)).submit();
        return null;
    }

    GoogleSearchResultsPage onSearchResultsPage();

}
