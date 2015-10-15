package controllers;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.admin.*;

public class Dashboard extends Controller{
	
	 @Restrict(@Group(Application.USER_ROLE))
	 public static Result blank() {
	    	return ok(dashboard.render(Application.getLocalUser(session())));
	    }
}
