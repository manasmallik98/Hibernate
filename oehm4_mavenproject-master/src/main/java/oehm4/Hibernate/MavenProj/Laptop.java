package oehm4.Hibernate.MavenAssignmentProj;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LapTop_Details")
public class Laptop implements Serializable
{
  @Id
  @Column(name = "ID")
  private Long id;
  
  @Column(name = "Brand")
  private String brand;
  
  @Column(name = "OS")
  private String os;
  
  @Column(name = "Generation_Proccessor")
  private String gp;
  
  @Column(name = "RAM_gb")
  private String ram;
  
  
  @Column(name = "Price")
  private Double price;

public Long getId(long id) {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getOs() {
	return os;
}

public void setOs(String os) {
	this.os = os;
}

public Double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}

public String getGp() {
	return gp;
}

public void setGp(String gp) {
	this.gp = gp;
}

public String getGb() {
	return ram;
}

public void setGb(String ram) {
	this.ram = ram;
}

@Override
public String toString() {
	return "Laptop [id=" + id + ", brand=" + brand + ", os=" + os + ", gp=" + gp + ", ram=" + ram + ", price=" + price
			+ "]";
}
  
}
