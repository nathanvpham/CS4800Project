package model.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Student extends Customer {
	
	@Column(name = "minor")
	private String minor;
	
	@Column(name = "major")
	private String major;
	
	@Column(name = "gradDate")
	private String gradDate;
	
	@Column(name = "enterDate")
	private String enterDate;
	
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="discountID")
	private DiscountScheme discount;

	public Student(int id, String name, int phone, String dateOfBirth, int addressNumber, String street, int zipCode,
			String city, String state, String minor, String major, String gradDate, String enterDate, 
			DiscountScheme discount) {
		super(id, name, phone, dateOfBirth, addressNumber, street, zipCode, city, state);
		
		this.minor = minor;
		this.major = major;
		this.gradDate = gradDate;
		this.enterDate = enterDate;
		this.discount = discount;
	}
	public void setMinor(String minor) {
		this.minor = minor;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setGradDate(String gradDate) {
		this.gradDate = gradDate;
	}
	public void setEnterDate(String enterDate) {
		this.enterDate = enterDate;
	}
	public void setDiscount(DiscountScheme dis) {
		discount = dis;
	}
	
	public DiscountScheme getDiscount() {
		return discount;
	}
	public String getMinor() {
		return minor;
	}
	public String getMajor() {
		return major;
	}
	public String getGradDate() {
		return gradDate;
	}
	public String getEnterDate() {
		return enterDate;
	}
}


