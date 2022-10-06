import java.text.DecimalFormat;

public class ParkingTicket {
    private ParkedCar car;
    private PoliceOfficer police;
    private double minutes;
    private double fine;
    public final double FIRSTMINUTE = 25.0;
    public final double SUBSEQUENTMINUTES = 10.0;

    // set the car details and the police details and calculate the fine
    public ParkingTicket(ParkedCar c, PoliceOfficer p, double m) {
        car = new ParkedCar(c);
        police = new PoliceOfficer(p);
        minutes = m;
        // call the calculateFine method
        calculateFine();
    }

    // this constructor also sets the car details, police details and the fine,
    // while accepting only one object argument
    // thus it is the construcor that is called when a car is illegally parked
    public ParkingTicket(ParkingTicket ticket2) {
        car = new ParkedCar(ticket2.car);
        police = new PoliceOfficer(ticket2.police);
        fine = ticket2.fine;
    }

    // calculating the fine
    public void calculateFine() {
        double hours = minutes / 60;
        int hoursAsInt = (int) hours;
        if ((hours - hoursAsInt) > 0)
            hours++;
        fine = FIRSTMINUTE;
        fine += (SUBSEQUENTMINUTES * hoursAsInt);
    }

    // defining individual mutators
    public void setCar(ParkedCar c) {
        car = new ParkedCar(c);
    }

    public void setPoliceOfficer(PoliceOfficer p) {
        police = new PoliceOfficer(p);
    }

    // defining individual accessors
    public ParkedCar getCar() {
        return new ParkedCar(car);
    }

    public PoliceOfficer getPoliceOfficer() {
        return new PoliceOfficer(police);
    }

    // get the fine
    public double getFine() {
        return fine;
    }

    public String toString() {
        // Create a DecimalFormat object for formatting.
        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        // Build a state string.
        String str = "Car Data:\n" + car +
                "\nOfficer Data:\n" + police +
                "\nMinutes Illegally Parked: " + minutes +
                "\nFine: $" + dollar.format(fine);

        // Return the string.
        return str;
    }
}