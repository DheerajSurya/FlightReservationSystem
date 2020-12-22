import java.util.*;
public class Main {

    public static void main(String[] args) {
        Passenger p= new Passenger();
        Scanner sc= new Scanner(System.in);
        Scanner sc2= new Scanner(System.in);
        Ticket t= new Ticket();
        System.out.println("WELCOME to Indian Airline Reservation System!!");
        System.out.println("Name:");
        p.name=sc.nextLine();
        System.out.println("Contact Number:");
        p.phone=sc.nextLong();
        System.out.println("Email:");
        p.email=sc.next();
        System.out.println("Address Details:-");
        System.out.println("Street:");
        Address a = new Address();
        a.street =sc2.nextLine();
        System.out.println("City:");
        a.city=sc.next();
        System.out.println("State:");
        a.state =sc2.nextLine();
        System.out.println("Please enter your departure location and destination location:");
        System.out.println("From:");
        t.departure=sc2.next();
        System.out.println("To:");
        t.arrival=sc2.next();
        System.out.println("We have 2 available airlines");
        System.out.println("Type in one out of Indigo and British");
        Flight f=new Flight();
        f.airline=sc2.next();
        System.out.println("Thanks for selecting: "+f.airline+" Airlines");
        System.out.println();
        System.out.println("| Flight no: "+f.fno+"  |  Capacity: "+f.capacity+"  |  Seats Available: "+f.seatavailable+"  |  Price to pay: "+t.price+" |");
        System.out.println();
        System.out.println("Type in one of Regular or Tourist ticket");
        p.type_of_ticket=sc2.next();
        Regular rt=new Regular();
        Tourist tt=new Tourist();
        if(p.type_of_ticket.equals("Regular"))
        {
            System.out.println("Select service:food or snacks:");
            rt.service=sc2.next();
        }
        else{
            System.out.println("Enter hotel address");
            tt.hotel=sc2.next();
            System.out.println("Enter location to go");
            tt.location=sc2.next();
        }
        System.out.println("Thank you for the payment");
    }

}
