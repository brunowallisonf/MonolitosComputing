package br.com.computingforum.service.implement;

import br.com.computingforum.model.Token;
import br.com.computingforum.service.EmailService;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
@Service
public class EmailServiceImplement implements EmailService {


	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	private Environment env;

	@Autowired
	private Environment envire;
	@Override
	public void recoverEmail(Token token) {
		Runnable enviaEmail = new Runnable() {
		private Environment env;
			@Override
			public void run() {
				MimeMessage mimemessage = mailSender.createMimeMessage();
				final MimeMessageHelper message = new MimeMessageHelper(mimemessage,"UTF-8");
				final String corpo  ="Recupere sua senha atraves do link:  ";
				try {
					message.setTo(token.getUser().getEmail());
					message.setFrom("no-reply@monolitoscomputing.com");
					message.setSubject("Recuperacao de  Senha");
					message.setText("Recupere a senha através do link: localhost:8080/show_redefine?token="+token.getToken(), true);
					mailSender.send(mimemessage);
				} catch (MessagingException e) {
				
					e.printStackTrace();
				}

			}
			
		
		};
		Thread t= new Thread(enviaEmail);
		t.start();
		
	}

}
