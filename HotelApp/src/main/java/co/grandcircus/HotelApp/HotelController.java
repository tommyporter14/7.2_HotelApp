package co.grandcircus.HotelApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HotelController {

	@Autowired
	private HotelRepository repo;
	
	@RequestMapping("/")
	public String showHome(){
		return "home";
	}
	
	@PostMapping("/listHotels")
	public String listHotels(Model model, @RequestParam String city) {
		List<Hotel> hotels = repo.findByCity(city, Sort.by("price"));
		model.addAttribute("hotels", hotels);
		return "/listHotels";
	}
}
