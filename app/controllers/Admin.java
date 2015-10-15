package controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import models.User;
import play.Routes;
import play.data.Form;
import play.mvc.*;
import play.mvc.Http.Response;
import play.mvc.Http.Session;
import play.mvc.Result;
import providers.MyUsernamePasswordAuthProvider;
import providers.MyUsernamePasswordAuthProvider.MyLogin;
import providers.MyUsernamePasswordAuthProvider.MySignup;
import views.html.*;
import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;

import com.feth.play.module.pa.PlayAuthenticate;
import com.feth.play.module.pa.providers.password.UsernamePasswordAuthProvider;
import com.feth.play.module.pa.user.AuthUser;

import controllers.routes;
import views.html.admin.*;


public class Admin extends Controller{
	
	
	 @Restrict(@Group(Application.USER_ROLE))
	 public static Result blank() {
	    	return ok(admin.render(MyUsernamePasswordAuthProvider.SIGNUP_FORM,Application.getLocalUser(session())));
	    }
}
