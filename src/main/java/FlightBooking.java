package prog2.exercise5.flight.booking.system;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.ParseException;
import java.util.Date;
import java.util.Random;

import javax.print.DocFlavor.STRING;
import javax.sql.rowset.CachedRowSet;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.time.LocalDate;

public class FlightBooking 
{
    private int Size ;
    private String  TicketNumber;
    private String  PassengerFullName;
    private String FlightCompany;
    private LocalDate DepartingDate;
    private LocalDate ReturnDate;
    private int TotalPassengers;
    private double TotalTicketPrice;
    private int ChildPassengers;
    private int AdultPassengers;
    private BookingClass bookClass;
    private TripType type;
    private TripSource source;
    private TripDestination destination;
    private SourceAirport sourceairport;
    private DestinationAirport destinationairport;
    int DepartingTicketPrice;
    String [] fullName = {"Matt Jive", "Sally Fields", "Posh Quattro"};
    String [] gender = {"Male", "Female", "Other"};
    int [] age = {43, 32, 21};

    
    public FlightBooking(int size)
    {
     this.Size = size;
    }
     
    
   
    public TripSource getTripSource()
    {

        return source;
    }
    public String getFlightCompany()
    {

        return FlightCompany;
    }
    public TripDestination getTripDestination()
    {

        return destination;
    }
    public LocalDate getDepartingDate()
    {

        return DepartingDate;
    }
    public LocalDate getReturnDate()
    {

        return ReturnDate;
    }
    public int getTotalPassengers()
    {

        return TotalPassengers;
    }
    public int getChildPassengers()
    {

        return ChildPassengers;
    }
    public int getAdultPassengers()
    {

        return AdultPassengers;
    }


    public void setTicketNumber(String TicketNumber)
    {

        this.TicketNumber = TicketNumber;
    }
    public void setPassengerFullName(String PassengerFullName)
    {

        this.PassengerFullName = PassengerFullName;
    }
    public void setFlightCompany(String FlightCompany)
    {

        this.FlightCompany = FlightCompany;
    }
    public void setDepartingDate(LocalDate DepartingDate)
    {

        this.DepartingDate = DepartingDate;
    }
    
    public void setTotalPassengers(int totalPassengers, int TotalPassengers)
    {

        this.TotalPassengers = ChildPassengers+AdultPassengers;
    }
    public void setTotalTicketPrice(double TotalTicketPrice)
    {

        this.TotalTicketPrice = TotalTicketPrice;
    }
    public void setChildPassengers(int ChildPassengers)
    {

        this.ChildPassengers = ChildPassengers;
    }
    public void setAdultPassengers(int AdultPassengers)
    {

        this.AdultPassengers = AdultPassengers;
    }

    public String toString()
    {
        return "Dear " + PassengerFullName + ". Thank you for booking your flight with " +
                FlightCompany + ". \nFollowing are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + TicketNumber + "\n" +
                "From " + source + " to " + destination + "\n" +
                "Date of departure: " + DepartingDate + "\n" +
                "Date of return: " + ReturnDate + "\n" +
                "Total passengers: " + TotalPassengers + "\n" +
                "Total ticket price in Euros: " + TotalTicketPrice;
    }

    public enum BookingClass
    {
        FIRST,BUSINESS,ECONOMY;
    }

    public enum TripType
    {
        ONE_WAY,RETURN;
    }

    public enum TripSource
    {
        NANJING,BEIJING,OULU,HELSINKI; 
    }
    
    public enum TripDestination
    {
        NANJING,BEIJING,OULU,HELSINKI;
    }

    public enum SourceAirport
    {
        NANJING_LUKOU_INTERNATIONAL_AIRPORT, BEIJING_CAPITAL_INTERNATIONAL_AIRPORT, OULU_AIRPORT,HELSINKI_AIRPORT;
    }

    public enum DestinationAirport
    {
        NANJING_LUKOU_INTERNATIONAL_AIRPORT, BEIJING_CAPITAL_INTERNATIONAL_AIRPORT, OULU_AIRPORT,HELSINKI_AIRPORT;  
    }

    public void setBookingClass(String bookClass)
    {
        switch(bookClass)
        {
            case "1":
            this.bookClass = BookingClass.FIRST;
            break;

            case "2":
            this.bookClass = BookingClass.BUSINESS;
            break;

            case "3":
            this.bookClass = BookingClass.ECONOMY;
            break;
            default:
        }  
    }

    public void setTripType(String type)
        {
           switch(type)
           {
            case "1":
            this.type = TripType.ONE_WAY;
            break;

            case "2":
            this.type = TripType.RETURN;
            break;
            default:
           }
        }

        public void setTripSource(String source)
        {
            switch(source)
            {
                case "1":
                this.source = TripSource.NANJING;
                break;

                case "2":
                this.source = TripSource.BEIJING;
                break;

                case "3":
                this.source = TripSource.OULU;
                break;

                case "4":
                this.source = TripSource.HELSINKI;
                break;


                default:
            }
        }

        public void setTripDestination(String source , String destination)
        {
            switch(source)
            {
                case "1":
                this.source = TripSource.NANJING;
                break;

                case "2":
                this.source = TripSource.BEIJING;
                break;

                case "3":
                this.source = TripSource.OULU;
                break;

                case "4":
                this.source = TripSource.HELSINKI;
                break;



                default:
            } 
            switch(destination)
            {
                case "1":
                this.destination = TripDestination.NANJING;
                break;
                case "2":
                this.destination = TripDestination.BEIJING;
                break;
                case "3":
                this.destination = TripDestination.OULU;
                break;
                case "4":
                this.destination = TripDestination.HELSINKI;
                break;

                default:
            }
        }

        public void  setTicketNumber(int i)
        {
            switch(type)
            {
                case ONE_WAY:
                TicketNumber = "11";
                break;
                case RETURN:
                TicketNumber = "22";
                break;
                default:
            }

            switch(bookClass)
            {
                case FIRST:
                TicketNumber += "F";
                break;
                case BUSINESS:
                TicketNumber += "B";
                break;
                case ECONOMY:
                TicketNumber += "E";
                break;
            }

            TicketNumber += "6666";
            boolean isPrime1 = true;
            boolean isPrime2 = false;
            switch(source)
            {
                case NANJING:
                isPrime1 =true;
                break;
                case BEIJING:
                isPrime1 = true;
                break;
                case OULU:
                isPrime1 = false;
                break;
                case HELSINKI:
                isPrime1 = false;
                break;
                default:
            }

            switch(destination)
            {
                case NANJING:
                isPrime2 = true;
                break;
                case BEIJING:
                isPrime2 = true;
                break;
                case OULU:
                isPrime2 = false;
                break;
                case HELSINKI:
                isPrime2 = false;
                break;
                default:
            }

            if(isPrime1 = isPrime2)
            {
                TicketNumber += "DOM";
            }

            if(isPrime1 != isPrime2)
            {
                TicketNumber += "INT"; 
            }
        }

        public int setDepartingTicketPrice(int ChildPassengers,int AdultPassengers)
        {
           this.ChildPassengers = ChildPassengers;
           this.AdultPassengers = AdultPassengers;
            DepartingTicketPrice =  (int) (((ChildPassengers *((300 + (0.1*300)) + (0.05*300))) + (AdultPassengers*((300 + (0.1*300)) + (0.05*300)))) + 250);
           return  DepartingTicketPrice;
        }
        
        public int setReturnTicketPrice()
        {
            return DepartingTicketPrice;
        }

        public int setTotalTicketPrice()
        {
            return DepartingTicketPrice*2;
        }
        public double getTotalTicketPrice()
        {
            TotalTicketPrice = 2* ((0*(300 + (0.15*300) + (0.1*300) + 250)) + (3*(300 + (0.15*300) + (0.1*300) + 250)));
            return TotalTicketPrice;
        }
      
    public LocalDate setDepartureDate(LocalDate departureDate)
    {
        this.DepartingDate = departureDate;
        return departureDate;
    }
    
    public LocalDate setReturnDate(LocalDate returnDate)
    {
        this.ReturnDate = returnDate;
        return ReturnDate;
    }

     public void setPassengerFullName(int i ,String fullName)
     {
        this.fullName[i] = fullName;
     }

     public void setPassengerGender(int i, String gender)
     {
        this.gender[i] = gender;
     }

     public void setPassengerAge(int i , int age)
     {
        this.age[i] = age;
     }

     
     
     
     
     public void setSourceAirport(String sourceairport)
     {
        switch(sourceairport)
        {
            case "1":
            this.sourceairport = SourceAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
            break;
            case "2":
            this.sourceairport = SourceAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
            break;
            case "3":
            this.sourceairport = SourceAirport.OULU_AIRPORT;
            break;
            case "4":
            this.sourceairport = SourceAirport.HELSINKI_AIRPORT;
            break;
            default:
        }
     }

     public void setDestinationAirport(String sourceairport, String destinationairport)
     {
        switch(sourceairport)
        {
            case "1":
            this.sourceairport = SourceAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
            break;
            case "2":
            this.sourceairport = SourceAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
            break;
            case "3":
            this.sourceairport = SourceAirport.OULU_AIRPORT;
            break;
            case "4":
            this.sourceairport = SourceAirport.HELSINKI_AIRPORT;
            break;
            default:
        }

        switch(destinationairport)
        {
            case "1":
            this.destinationairport = DestinationAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
            break;
            case "2":
            this.destinationairport = DestinationAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
            break;
            case "3":
            this.destinationairport = DestinationAirport.OULU_AIRPORT;
            break;
            case "4":
            this.destinationairport = DestinationAirport.HELSINKI_AIRPORT;
            break;
            default:
        }
     }

    
     public String getPassengerFullName(int i)
      {
        return fullName[i];
      }
    
      public String getPassengerGender(int i)
      {
        return gender[i];
      }
    
      public int getPassengerAge(int i)
      {
        return age[i];
      }
      
    public void setTripDestination(String string) 
    {
    
    }    

}
