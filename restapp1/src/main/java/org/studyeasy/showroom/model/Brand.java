package org.studyeasy.showroom.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
@Entity(name = "brands")
@Table(name = "brands")
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "brandId")
	int brandId;
	@Column(name = "brandName")
	private String BrandName;
	@Transient
	private Link links;

	public Link getLinks() {
		return links;
	}

	public void setLinks(Link links) {
		this.links = links;
	}

	public Brand() {

	}

	public Brand(int brandId, String brandName) {
		super();
		this.brandId = brandId;
		BrandName = brandName;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

}
