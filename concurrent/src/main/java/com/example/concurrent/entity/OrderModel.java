package com.example.concurrent.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author missj
 * @since 2018-12-10
 */
@TableName("orders")
public class OrderModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    @TableField("userId")
    private Integer userId;

    /**
     * 产品编号
     */
    @TableField("productId")
    private Integer productId;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 数量
     */
    private Integer number;

    /**
     * 总价
     */
    @TableField("totalPrice")
    private BigDecimal totalPrice;

    /**
     * 购买时间
     */
    private Date orderTime;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date date) {
		this.orderTime = date;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
