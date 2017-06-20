package br.com.computingforum.filtros;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import br.com.computingforum.model.User;
//impede o cara ja logado de acessar o login e o cadastro
@Service
public class FilterLogado extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object controller) throws Exception {
		User  user= (User) request.getSession().getAttribute("user");
		if(user==null)
			return true;
		
		response.sendRedirect("/");			
		return false;
	}

}
