package br.com.computingforum.filtros;

import java.net.URI;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.mockito.internal.matchers.EndsWith;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
@Service
public class FilterLogin extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object controller) throws Exception {
			if(request.getSession().getAttribute("username")!= null)
				return true;
			request.getRequestDispatcher("WEB-INF/views/tela_login.jsp").forward(request, response);
			return false;
		  }
	
}
