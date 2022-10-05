public class ParkingTicket {
    ParkedCar pc = new ParkedCar();
    ParkingMeter pm = new ParkingMeter();
        //determining legal car parked
        if(pm.getminutesPurchased() < pc.getminutesParked)
        System.out.println("legal car parked");
        //determining illegal car
       else if(pm.getminutesPurchased>pc.getminutesParked){
           if(pm.getminutesPurchased()>60 && pc.getminutesParked()<=120){
            System.out.println("Your fine is $25.00");
        }
    }
        int fine=10;
        int i=120;
         while( i<=1440){
         if(pm.getminutesPurchased()>i){
            System.out.println("Your fine is $"+fine);
            }
            fine+=10;
            i+=60;
        }
        String toString(){
            String str;
            str="Car illegally parked care datails: \n"+pc.toString()+""
        }
    }