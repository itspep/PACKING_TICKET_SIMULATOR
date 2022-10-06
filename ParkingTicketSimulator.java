public class ParkingTicketSimulator {
    public static void main(String[] args) {
        // an object for the parked car
        ParkedCar Car = new ParkedCar("Bugatti", "2022", "Black", "HR1234", 125);
        // an object for the parking meter
        ParkingMeter Meter = new ParkingMeter(60);
        // an object for the police officer
        PoliceOfficer Police = new PoliceOfficer("James Scott", "PO1234");
        // parking ticket, patrol object for comparison
        ParkingTicket ticket = Police.patrol(Car, Meter);
        if (ticket != null)
            System.out.println(ticket);
        else
            System.out.println("No crime committed");
    }

}
