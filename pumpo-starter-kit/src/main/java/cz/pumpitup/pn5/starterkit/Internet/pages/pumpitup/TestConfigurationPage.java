package cz.pumpitup.pn5.starterkit.Internet.pages.pumpitup;

import cz.pumpitup.pn5.actions.AssertElementContent;
import cz.pumpitup.pn5.actions.AssertElementPresent;
import cz.pumpitup.pn5.actions.Click;
import cz.pumpitup.pn5.actions.Wait;
import cz.pumpitup.pn5.core.Lookup;

@Wait(value = TestConfigurationPage.TEST_CONFIGURATION_HEADER_XPATH, by = Lookup.XPATH)
public interface TestConfigurationPage {

    String TEST_CONFIGURATION_HEADER_XPATH = "//a[@data-id='test-configuration']";
    String CONNECTION_TO_SYSTEMS_UNDER_TEST_XPATH = "//a[@data-id='connection-to-systems-under-test']";

    @Click(value = CONNECTION_TO_SYSTEMS_UNDER_TEST_XPATH, by = Lookup.XPATH)
    TestConfigurationPage goToConnection();

    @AssertElementPresent(value = "//*[contains(text(), \"%s\")]", by = Lookup.XPATH)
    TestConfigurationPage assertThatTextAreaContains(String expectedContent);

}
