package idv.example.demo._01_register.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="customer")
public class CustomerBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("customerId")	
	private Integer customerId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("password")
	private String password;
	@Transient
	@JsonIgnore
	private String password1;
	@JsonProperty("email")
	private String email;
	@JsonProperty("birthday")
	private Date birthday;
	@JsonProperty("lastPostTime")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private java.util.Date lastPostTime;
	@JsonProperty("registerTime")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Timestamp registerTime;
	@JsonProperty("totalPayment")
	private Double totalPayment;

	public CustomerBean(Integer customerId, String name, String password, String password1, String email, Date birthday,
			java.util.Date lastPostTime, Timestamp registerTime, Double totalPayment) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.password = password;
		this.password1 = password1;
		this.email = email;
		this.birthday = birthday;
		this.lastPostTime = lastPostTime;
		this.registerTime = registerTime;
		this.totalPayment = totalPayment;
	}

	public CustomerBean() {
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public java.util.Date getLastPostTime() {
		return lastPostTime;
	}

	public void setLastPostTime(java.util.Date lastPostTime) {
		this.lastPostTime = lastPostTime;
	}

	public Timestamp getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Timestamp registerTime) {
		this.registerTime = registerTime;
	}

	public Double getTotalPayment() {
		return totalPayment;
	}

	public void setTotalPayment(Double totalPayment) {
		this.totalPayment = totalPayment;
	}

	
	
//	@Override
//	public String toString() {
//		return "CustomerBean [customerId=" + customerId + ", name=" + name + ", password=" + password + ", password1="
//				+ password1 + ", email=" + email + ", birthday=" + birthday + ", lastPostTime=" + lastPostTime
//				+ ", registerTime=" + registerTime + ", totalPayment=" + totalPayment + "]";
//	}

}
