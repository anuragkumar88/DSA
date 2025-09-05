package oops;

public class CallingCar{
    public static void main(String[] args) {
   CarProperty car = new CarProperty("blue" , "BMW" ,"Petrol", 142.00);
        System.out.println(car.color);
        System.out.println(car.company);
        System.out.println(car.fuelType);
        System.out.println(car.speed);
    }
    public CallingCar(){

    }
}
