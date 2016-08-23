package com.learnSpring.email;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

/**
 * This class sends an email using MailSender
 *
 */

public class EPostMan {

	private MailSender mailSender;

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	/**
	 * This method sends an email message
	 * 
	 * @param from
	 *            - Email address from which the email is being sent
	 * @param to
	 *            - Email address to which the email is being sent
	 * @param subject
	 *            - Subject of the email
	 * @param body
	 *            - Body of the email
	 */
	public void sendMail(String from, String to, String subject, String body) {

		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setFrom(from);
		mail.setTo(to);
		mail.setSubject(subject);
		mail.setText(body);

		mailSender.send(mail);

	}

}
