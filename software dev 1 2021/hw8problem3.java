import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Flight
{
    private String flightNo;
    private GregorianCalendar departureTime;
    private GregorianCalendar arrivalTime;

    Flight(String flightNo,GregorianCalendar departureTime,GregorianCalendar arrivalTime )
    {
        this.flightNo=flightNo;
        this.departureTime=departureTime;
        this.arrivalTime=arrivalTime;
    }

    public void setDepartureTime(GregorianCalendar departureTime)
        {
            this.departureTime=departureTime;
        }

    public GregorianCalendar getDepartureTime()
    {
        return this.departureTime;
    }

        public void setArrivalTime(GregorianCalendar arrivalTime)
        {
            this.arrivalTime=arrivalTime;
        }

    public GregorianCalendar getArrivalTime()
    {
        return this.arrivalTime;
    }

    public long getFlightTime()
    {
        if (departureTime!=null && arrivalTime!=null)
        {
            long diff_in_millis=arrivalTime.getTimeInMillis()-departureTime.getTimeInMillis();
            return (diff_in_millis/(1000*60));
        }
        return 0;
        }
    }

public class Itinerary
{
    ArrayList<Flight> flights=new ArrayList<>();

        public Itinerary(ArrayList<Flight> flights) 
        {
            this.flights=flights;
        }

    public long getTotalFlightTime()
    {

        long totalFlightTime=0;

        for (Flight flight : flights)
        {
            totalFlightTime+=flight.getFlightTime();
        }

        return totalFlightTime;
    }

    public long getTotalTravelTime()
    {

        Flight firstFlight=flights.get(0);

        Flight lastFlight=flights.get(flights.size()-1);

        long diff_in_millis=lastFlight.getArrivalTime().getTimeInMillis()-firstFlight.getDepartureTime().getTimeInMillis();

        return (diff_in_millis/(1000*60));
    }
}

public class TestFlightItinerary 
{   
    public static void main(String[] args) 
    {
        ArrayList<Flight> flights=new ArrayList<>();
        GregorianCalendar departureTime=new GregorianCalendar(2014,4,5,5,5,0);

        GregorianCalendar arrivalTime=new GregorianCalendar(2014,4,5,6,15,0);

        Flight flight1=new Flight("US230", departureTime, arrivalTime);

        departureTime=new GregorianCalendar(2014,4,5,6,55,0);

        arrivalTime=new GregorianCalendar(2014,4,5,7,45,0);

        Flight flight2=new Flight("US235", departureTime, arrivalTime);

        departureTime=new GregorianCalendar(2014,4,5,9,35,0);

        arrivalTime=new GregorianCalendar(2014,4,5,12,55,0);

        Flight flight3=new Flight("US237", departureTime, arrivalTime);

        flights.add(flight1);

        flights.add(flight2);

        flights.add(flight3);

        Itinerary itinerary= new Itinerary(flights);

        System.out.println("Total Flight Time is "+ itinerary.getTotalFlightTime()+" minutes");

        System.out.println("Total Travel Time is "+itinerary.getTotalTravelTime()+" minutes");
    }

}