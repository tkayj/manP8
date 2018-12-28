package com.man.dm.create.build2;

import java.util.Date;

public abstract class AutoMessage {

	private String to;
	private String from;
	
	private String subject;
	
	private String body;
	
	private Date sendDate;
	
	public void send() {
		
		System.out.println("收件人地址："+to);
		System.out.println("发件人地址："+to);
		System.out.println("标题："+to);
		System.out.println("内容："+to);
		System.out.println("发送日期："+to);		
	}
	

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	
	
	
}
