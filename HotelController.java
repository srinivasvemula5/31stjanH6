package hotelappController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hotelappEntity.Hotel;

@RestController
public class HotelController {
	@PostMapping("/ind/hyd/hotel/add")
		public String saveNewHotel(@RequestBody Hotel newHotel) {
		System.out.println("from browser hotel data"+ newHotel);
		return"";
	}

}
