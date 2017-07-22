package org.fkit.domain;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
	private Integer id;
	private String payment;
	private String status;
	private String time;
	private Integer user_id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", payment=" + payment + ", status=" + status
				+ ", time=" + time + ",user_id="+user_id+"]";
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
}
