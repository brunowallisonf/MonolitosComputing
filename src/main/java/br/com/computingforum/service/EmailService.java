package br.com.computingforum.service;

import javax.mail.internet.MimeMessage;

import br.com.computingforum.model.Token;

public interface EmailService {
	void recoverEmail(Token token);
	
}
