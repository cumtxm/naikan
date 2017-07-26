package org.fkit.domain;

import java.io.Serializable;

public class Cart implements Serializable {
	private int id;				// id
	private String name;
	private String image;
	private String price;
	private Integer quantity;
	private Integer user_id;
	private Integer goods_id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", name=" + name + ", image=" + image+ ",price=" + price+ ",quantity="+quantity+",user_id="+user_id+",goods_id="+goods_id+"]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Integer getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(Integer goods_id) {
		this.goods_id = goods_id;
	}
}
