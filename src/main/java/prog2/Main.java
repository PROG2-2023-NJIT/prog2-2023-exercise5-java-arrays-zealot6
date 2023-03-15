import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[]args)
    {
        String sdepart = "2023-03-12";
        LocalDate depart = LocalDate.parse(sdepart);
        String sreturn = "2023-03-14";
        LocalDate returnDate = LocalDate.parse(sreturn);
        String random = "FOF"+Math.random();// flightID
        String substring = random.substring(random.length()-4);
        String sourceAirport = "NANJING LUKOU \n" +
                "INTERNATIONAL AIRPORT";
        String destinationAirport = "OULU AIRPORT";
        FlightBooking fbing = new FlightBooking(3);
        int expResult = 4;
        fbing.setTotalPassengers(2,3);
        int result = fbing.getTotalPassengers();
        fbing.setPassengerFullName("John Doe");
        fbing.setTicketNumber("MU759435");
        fbing.setTripSource("NanJing") ;
        fbing.setTripDestination("OULU");
        fbing.setFlightCompany("Flights-of-Fancy");
        fbing.setDepartingDate(LocalDate.parse("2023-03-12"));
        fbing.setReturnDate(LocalDate.parse("2023-03-14"));
        fbing.setTotalTicketPrice(5500);
     
        System.out.println(fbing.toString());
    }
    
}
