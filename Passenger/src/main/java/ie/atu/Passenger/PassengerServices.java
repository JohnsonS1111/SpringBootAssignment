package ie.atu.Passenger;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PassengerServices {

    public List<Passenger> getPassengers()
    {
        List<Passenger> myPassengers = List.of(
                new Passenger("Mr", "Johnson", 1324636790, "28549868934", 52),
                new Passenger("Ms", "Joey", 37995798789L, "0892227333", 26),
                new Passenger("Mrs", "Joanna", 1527146308, "2898259364", 18));
        return myPassengers;
    }

    public Passenger getPassengers(long passengerID){
        Passenger myPassenger = new Passenger("Mr", "Johnson", 12383799444L, "23467278274", 80);
        return myPassenger;
    }
}
