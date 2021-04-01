package org.csbs.nmls.inputjson;

import org.csbs.nmls.model.Product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProdValue {
	@JsonProperty("org.csbs.nmls.model.Product")
	public Product product;
	
//	@JsonProperty("org.csbs.nmls.model.Jewelry")
//	public Jewelry jewelry;

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	
//	/**
//	 * @return the jewelry
//	 */
//	public Jewelry getJewelry() {
//		return jewelry;
//	}
//
//	/**
//	 * @param jewelry the jewelry to set
//	 */
//	public void setJewelry(Jewelry jewelry) {
//		this.jewelry = jewelry;
//	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProdValue [product=" + product + "]";
	}
}
