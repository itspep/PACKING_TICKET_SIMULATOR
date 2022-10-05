public class ParkingMeter{
    //this class only function is to know the number of parking limits purchased
    private int minutesPurchased;
    public ParkingMeter(int purchased){
        minutesPurchased=purchased;
    }
    public int getminutesPurchased(){
        return minutesPurchased;
    }
}