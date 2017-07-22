package org.fkit.domain;

import java.io.Serializable;

public class Comment implements Serializable {
	private Integer id;
	private Integer order_id;
	private Integer logistics;
	private Integer quality;
	private Integer service;
	private String picture;
	private String comment;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public Integer getLogistics() {
		return logistics;
	}
	public void setLogistics(Integer logistics) {
		this.logistics = logistics;
	}
	public Integer getQuality() {
		return quality;
	}
	public void setQuality(Integer quality) {
		this.quality = quality;
	}
	public Integer getService() {
		return service;
	}
	public void setService(Integer service) {
		this.service = service;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ",order_id=" + order_id
				+ ", logistics=" + logistics + ",quality="+quality+",service="+service+",picture="+picture+",comment="+comment+"]";
	}

}
