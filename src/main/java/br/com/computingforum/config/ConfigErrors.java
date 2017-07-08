package br.com.computingforum.config;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
@Configuration
public class ConfigErrors {
	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer() {
		return new EmbeddedServletContainerCustomizer() {
			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
				
				ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/WEB-INF/views/error/404.jsp");
				ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/WEB-INF/views/error/errorgeneric.jsp");
				ErrorPage error405Page = new ErrorPage(HttpStatus.METHOD_NOT_ALLOWED, "/WEB-INF/views/error/errorgeneric.jsp");
				ErrorPage error400Page = new ErrorPage(HttpStatus.BAD_REQUEST, "/WEB-INF/views/error/errorgeneric.jsp");
				
				container.addErrorPages(error404Page, error500Page,error400Page,error405Page);
				
			}
		};
	}
}
