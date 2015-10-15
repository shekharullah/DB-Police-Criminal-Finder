package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import providers.MyUsernamePasswordAuthProvider;
import providers.MyUsernamePasswordAuthProvider.MyLogin;
import providers.MyUsernamePasswordAuthProvider.MySignup;
import views.html.admin.*;


public class Admin extends Controller{
	 public static Result blank() {
	    	return ok(admin.render(MyUsernamePasswordAuthProvider.SIGNUP_FORM));
	    }
}
