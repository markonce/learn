package com.example.concurrent.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author missj
 * @since 2018-12-10
 */
@TableName("product")
public class ProductModel implements Serializable {

    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 版本
     */
    private Integer version;

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

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
