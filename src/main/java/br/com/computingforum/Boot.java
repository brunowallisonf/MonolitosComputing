package br.com.computingforum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import br.com.computingforum.filtros.FilterLogin;

@SpringBootApplication
public class Boot extends WebMvcConfigurerAdapter{
	
   public static void main(String[] args)
   {
      SpringApplication.run(Boot.class, args);
   }
}
