public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesParked;

    // create a constructor to set the values for the various fields
    // this will represent the general car properties
    public ParkedCar(String ma, String mod, String col, String license, int minutes) {
        make = ma;
        model = mod;
        color = col;
        licenseNumber = license;
        minutesParked = minutes;
    }

    // this will represent the specific care properties like the illegally parked
    // car
    public ParkedCar(ParkedCar pc) {
        make = pc.make;
        model = pc.model;
        color = pc.color;
        licenseNumber = pc.licenseNumber;
        minutesParked = pc.minutesParked;
    }

    public void setMake(String ma) {
        make = ma;
    }

    public void setModel(String mod) {
        model = mod;
    }

    public void setColor(String col) {
        color = col;
    }

    public void setLicense(String license) {
        licenseNumber = license;
    }

    public void setMinutesParked(int minutes) {
        minutesParked = minutes;
    }

    // creating the getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getLicense() {
        return licenseNumber;
    }

    public int getminutesParked() {
        return minutesParked;
    }

    public String toString() {
        String str = "Car details:\n" +
                "car make " + make +
                "\ncar model " + model +
                "\ncolor" + color +
                "\nlicense number " + licenseNumber;
        return str;
    }
}