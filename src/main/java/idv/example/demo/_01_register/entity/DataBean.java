package idv.example.demo._01_register.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataBean {
	@JsonProperty("data")
	private List<CustomerBean> data;

	public DataBean() {
		super();
	}

	public DataBean(List<CustomerBean> data) {
		super();
		this.data = data;
	}

	public List<CustomerBean> getData() {
		return data;
	}

	public void setData(List<CustomerBean> data) {
		this.data = data;
	}
	
	
}
