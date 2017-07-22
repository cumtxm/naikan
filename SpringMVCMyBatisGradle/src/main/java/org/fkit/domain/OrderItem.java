package org.fkit.domain;

import java.io.Serializable;


public class OrderItem implements Serializable {
	private Integer id;
	private String quantity;
	private Integer order_id;
	private Integer goods_id;
	private String goods_name;
	private String goods_price;
	private String goods_image;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public Integer getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(Integer goods_id) {
		this.goods_id = goods_id;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public String getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(String goods_price) {
		this.goods_price = goods_price;
	}
	public String getGoods_image() {
		return goods_image;
	}
	public void setGoods_image(String goods_image) {
		this.goods_image = goods_image;
	}
	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", quantity=" + quantity + ", order_id=" + order_id
				+ ", goods_id=" + goods_id + ",goods_name="+goods_name+",goods_price="+goods_price+",goods_image="+goods_image+"]";
	}
}
