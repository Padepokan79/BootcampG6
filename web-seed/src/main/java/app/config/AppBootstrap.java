package app.config;

import java.util.HashMap;

import org.javalite.activeweb.AppContext;
import org.javalite.activeweb.Bootstrap;

//import app.util.XmlReader;

public class AppBootstrap extends Bootstrap {
	
    public void init(AppContext context) {   
    	context.set("LoggedInUsers", new HashMap<String, Object>());
//    	XmlReader reader = new XmlReader("static-server/webapps/static.xml");    	
//    	String staticResourcePath = reader.getElementBySpecificAttribute("Set", "name", "resourceBase");
//        context.set("staticServerResourcePath", staticResourcePath);    
//        
//        System.out.println("staticResourcePath : " + staticResourcePath);
    }
}
