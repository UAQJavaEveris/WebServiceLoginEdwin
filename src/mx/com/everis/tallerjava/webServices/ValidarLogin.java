package mx.com.everis.tallerjava.webServices;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ValidarLogin {
	
	@WebMethod
	public String validarLogin(String user, String password){
		if(user.equals("admin") && password.equals("root")){
			return "acceso.jsp";
		}else{
			return "noAcceso.jsp";
		}		
	}

}
