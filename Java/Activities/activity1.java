public class activity1 {

    public static void main(String[] args) {
        car tata = new car();
        tata.make = 2023;
        tata.color = "Blue";
        tata.transmission = "Manual";

        //Using Car class method
        tata.displayCharacterstics();
        tata.accelerate();
        tata.brake();
    }

}