package br.com.computingforum.filtros;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import br.com.computingforum.model.User;
@Service
public class FilterAdmin extends HandlerInterceptorAdapter{
	@Override
	public boolean  preHandle(HttpServletRequest request, HttpServletResponse response,Object controller){
		User u =  (User) request.getSession().getAttribute("user");
		
		if(u.getIsAdmin()){
			return true;
		}
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
