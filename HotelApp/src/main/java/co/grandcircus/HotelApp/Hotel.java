package co.grandcircus.HotelApp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("hotels")
public class Hotel {

	@Id
	private String id;
	private String hotelName;
	private String city;
	private int price;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Hotel(String id, String hotelName, String city, int price) {
		this.id = id;
		this.hotelName = hotelName;
		this.city = city;
		this.price = price;
	}
	
	public Hotel() {}
	
}
