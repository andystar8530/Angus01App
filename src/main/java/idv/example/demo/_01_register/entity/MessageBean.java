package idv.example.demo._01_register.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("messageId")	
	private Integer messageId;
	@JsonProperty("content")
	private DataBean content;
	public MessageBean() {
		super();
	}
	public MessageBean(Integer messageId, DataBean content) {
		super();
		this.messageId = messageId;
		this.content = content;
	}
	public Integer getMessageId() {
		return messageId;
	}
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}
	public DataBean getContent() {
		return content;
	}
	public void setContent(DataBean content) {
		this.content = content;
	}
	
}
