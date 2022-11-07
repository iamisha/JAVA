import java.util.Scanner;

public class KMtoMiles {
    public static void main(String[] args) {
        float km, miles;
        float ratio = (float) 1.609;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter km to convert it into the miles: ");
        km = sc.nextFloat();
        miles = (float) ((Float) km / 1.609);
        System.out.println(km + " km = " + miles + " miles ");

    }
}
