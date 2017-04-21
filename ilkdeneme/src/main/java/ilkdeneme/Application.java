package ilkdeneme;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

public class Application {
	
	public void addViewControllers(ViewControllerRegistry registry) {
	    registry.addViewController("/login").setViewName("login");
	}
}
