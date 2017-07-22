package org.fkit.domain;

import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable{
	private Integer id;				// id	
	private String name;			// 商品名字
	private String price;			// 价格
	private String stock;
	private String sell;
	private String image;			// 商品图片
	private String image1;
	private String image2;
	private String image3;
	private String remark;			// 详细描述
	private String sort;			// 分类
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public String getImage2() {
		return image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public String getImage3() {
		return image3;
	}
	public void setImage3(String image3) {
		this.image3 = image3;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ",price=" + price + ", image=" + image
				+ ", stock="+stock+",sell="+sell+",image1=" + image1+ ",image2=" + image2+ ",image3=" + image3+ ",remark=" + remark + ",sort="+sort+"]";
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getSell() {
		return sell;
	}
	public void setSell(String sell) {
		this.sell = sell;
	}
}
