public class PoliceOfficer {
    private String poName;// to store police officer name
    private String poNumber;// to store police officer badge number
    // creating a constructor

    PoliceOfficer(String name, String num) {
        poName = name;
        poNumber = num;
    }

    PoliceOfficer(PoliceOfficer officer2) {
        poName = officer2.poName;
        poNumber = officer2.poNumber;
    }

    // setting the mutators
    public void setName(String n) {
        poName = n;
    }

    public void setnumber(String num) {
        poNumber = num;
    }

    // setting the accessors
    public String getName() {
        return poName;
    }

    public String getNumber() {
        return poNumber;
    }

    /**
     * The patrol method looks at the number of
     * minutes a car has been parked and the number
     * of minutes purchased. If the minutes parked
     * is greater than the minutes purchased, a
     * ParkingTicket object is returned. Otherwise
     * the method returns null.
     * 
     * @param car   A ParkedCar object.
     * @param meter A ParkingMeter object.
     * @return A ParkingTicket object if a violation
     *         occurred, null otherwise.
     */
    public ParkingTicket patrol(ParkedCar car, ParkingMeter meter) {
        ParkingTicket ticket = null;
        // get the illegal minutes
        int illegalMinutes = car.getminutesParked() - meter.getminutesPurchased();
        if (illegalMinutes > 0) {
            ticket = new ParkingTicket(car, this, illegalMinutes);
        }
        return ticket;

    }

    /**
     * toString method
     * 
     * @return A string stating the officer's name
     *         and badge number.
     */

    public String toString() {
        // Build a state string.
        String str = "Name: " + poName +
                "\nBadgeNumber: " + poNumber;

        // Return the String.
        return str;
    }
}