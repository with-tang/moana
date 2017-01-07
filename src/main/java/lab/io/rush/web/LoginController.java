package lab.io.rush.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jdk.nashorn.internal.objects.Global;
import lab.io.rush.model.UserInfo;

public class LoginController
{
	 @Resource
	    HttpServletRequest request;
	    
	 @RequestMapping("/loginpage")
	    public String toLoginPage(){
	        return "/WEB-INF/jsp/login.jsp";
	    }  
	 @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	    public String doLogin(@RequestParam String userName, @RequestParam String password){
	        
	        try {
	        	/*
	            UserInfo user = service.doLogin(userName, password);
	            request.getSession().setAttribute(Global.USER_SESSION_KEY, user);
	            */
	            return "redirect:/user/home.html";
	        } catch (Exception e) {
	            return "/WEB-INF/jsp/login.jsp";
	        }
	        
	    }
}
