package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.admin.*;

public class Dashboard extends Controller{
	 public static Result blank() {
	    	return ok(dashboard.render());
	    }
}
