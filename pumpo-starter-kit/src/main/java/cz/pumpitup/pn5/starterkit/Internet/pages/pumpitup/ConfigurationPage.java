package cz.pumpitup.pn5.starterkit.Internet.pages.pumpitup;

import cz.pumpitup.pn5.actions.Click;
import cz.pumpitup.pn5.core.Lookup;
import cz.pumpitup.pn5.web.WebAgentAccessor;
import org.checkerframework.checker.units.qual.C;

public interface ConfigurationPage extends WebAgentAccessor {

    @Click(value = "//a[@title='Test configuration']", by = Lookup.XPATH)
    ConfigurationPage goToTestConfiguration();

    TestConfigurationPage onTestConfigurationPage();
}
