package pe.edu.upc.decorroom.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FurnitureSellers")
public class FurnitureSeller {
	@Id
	@Column(name = "furnitureSeller_id", length = 2, nullable = false)
	private String id;
	@Column(name = "furnitureSeller_name", length = 15)
	private String name;
	@Column(name = "furnitureSeller_lastName", length = 30)
	private String lastName;
	@Column(name = "furnitureSeller_dni", length = 8)
	private String dni;
	@Column(name = "furnitureSeller_name", length = 9)
	private String telephone;
	@Column(name = "furnitureSeller_name", length = 60)
	private String email;
	@OneToMany(mappedBy = "furnitureSeller")
	private List<Furniture> furnitures;
	@OneToMany(mappedBy = "furnitureSeller")
	private List<Sale> sales;
	@OneToMany(mappedBy = "furnitureSeller")
	private List<Rating> ratings;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Furniture> getFurnitures() {
		return furnitures;
	}
	public void setFurnitures(List<Furniture> furnitures) {
		this.furnitures = furnitures;
	}
	public List<Sale> getSales() {
		return sales;
	}
	public void setSales(List<Sale> sales) {
		this.sales = sales;
	}
	public List<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	public FurnitureSeller(List<Furniture> furnitures, List<Sale> sales, List<Rating> ratings) {
		super();
		this.furnitures = furnitures;
		this.sales = sales;
		this.ratings = ratings;
	}
	public FurnitureSeller() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
