package ie.atu.Passenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path="api/passenger")
public class PassengerApplication {
	PassengerServices myService;

	public PassengerApplication(PassengerServices myService) {
		this.myService = myService;
	}

	public static void main(String[] args) {
		SpringApplication.run(PassengerApplication.class, args);
	}

	@GetMapping
	public List<Passenger> getPassengers()
	{
		PassengerServices myService = new PassengerServices();
		return myService.getPassengers();
	}

	@GetMapping("/{passengerID}")
	public Passenger getPassengers(@PathVariable long passengerID){

		return myService.getPassengers(passengerID);
	}
}
