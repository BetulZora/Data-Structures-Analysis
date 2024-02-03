package developerReviews.week_01;

public class CarTest {
    public static void main(String[] args) {


        Car car = new Car("BMW", 2022);
        System.out.println(car);

        String a = "BMW";
        System.out.println(a==car.make);


    }
}
