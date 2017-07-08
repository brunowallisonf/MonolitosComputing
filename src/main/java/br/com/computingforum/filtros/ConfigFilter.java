package br.com.computingforum.filtros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class ConfigFilter  extends WebMvcConfigurerAdapter{
@Autowired private FilterLogin filtro;
@Autowired private FilterAdmin adfiltro;
@Autowired private FilterLogado logadofiltro;
	@Override
	public void addInterceptors(InterceptorRegistry registry){
		registry.addInterceptor(filtro).addPathPatterns("/private/**","/admin/*");
		registry.addInterceptor(adfiltro).addPathPatterns("/admin/*");
		registry.addInterceptor(logadofiltro).addPathPatterns("/show-login","/cadastro","/cadastrar","/login");
	}
}
