package app.config;

import org.javalite.activeweb.AbstractControllerConfig;
import org.javalite.activeweb.AppContext;
import org.javalite.activeweb.controller_filters.DBConnectionFilter;
import org.javalite.activeweb.controller_filters.TimingFilter;

import app.controllers.auth.TokenController;
import app.filters.AuthorizationFilter;

public class AppControllerConfig extends AbstractControllerConfig {

	@SuppressWarnings("unchecked")
	public void init(AppContext context) {
        addGlobalFilters(new TimingFilter());
        addGlobalFilters(new DBConnectionFilter("default", true));//.exceptFor(TokenController.class);
        addGlobalFilters(new AuthorizationFilter()).exceptFor(TokenController.class);
    }
}
