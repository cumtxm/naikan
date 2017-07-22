package org.fkit.domain;

import java.io.Serializable;

public class Collect implements Serializable {
	private int id;				// id
	private String name;
	private String image;
	private Double price;
	private Integer user_id;
	private Integer goods_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(Integer goods_id) {
		this.goods_id = goods_id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String toString() {
		return "Collect [id=" + id + ", name=" + name + ", image=" + image+ ",price=" + price+ ",user_id="+user_id+",goods_id="+goods_id+"]";
	}
}
