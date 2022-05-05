package pe.edu.upc.decorroom.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Furnitures")
public class Furniture {
	@Id
	@Column(name = "furniture_id", length = 2, nullable = false)
	private String id;
	@Column(name = "furniture_name", length = 25)
	private String name;
	@Column(name = "furniture_price")
	private Integer price;
	@Column(name = "furniture_type", length = 25)
	private String type;
	@Column(name = "furniture_image")
	private String image;
	@Column(name = "furniture_height", length = 10)
	private Float height;
	@Column(name = "furniture_longer", length = 10)
	private Float longer;
	@Column(name = "furniture_weidth", length = 10)
	private Float width;
	@Column(name = "furniture_weight", length = 10)
	private Float weight;
	@Column(name = "furniture_description", length = 80)
	private String description;
	@Column(name = "furniture_stock")
	private Integer stock;
	@Column(name = "furniture_color", length = 20)
	private String color;
	@ManyToOne
	@JoinColumn(name="furnitureSeller_id", nullable = false)
	private FurnitureSeller furnitureSeller;
	@ManyToOne
	@JoinColumn(name="carBuy_id", nullable = false)
	private CarBuy carBuy;
	@ManyToOne
	@JoinColumn(name="client_id", nullable = false)
	private Client client;
	@ManyToOne
	@JoinColumn(name="company_id", nullable = false)
	private Company company;
	
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
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Float getHeight() {
		return height;
	}
	public void setHeight(Float height) {
		this.height = height;
	}
	public Float getLonger() {
		return longer;
	}
	public void setLonger(Float longer) {
		this.longer = longer;
	}
	public Float getWidth() {
		return width;
	}
	public void setWidth(Float width) {
		this.width = width;
	}
	public Float getWeight() {
		return weight;
	}
	public void setWeight(Float weight) {
		this.weight = weight;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public FurnitureSeller getFurnitureSeller() {
		return furnitureSeller;
	}
	public void setFurnitureSeller(FurnitureSeller furnitureSeller) {
		this.furnitureSeller = furnitureSeller;
	}
	public CarBuy getCarBuy() {
		return carBuy;
	}
	public void setCarBuy(CarBuy carBuy) {
		this.carBuy = carBuy;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}

	
}
