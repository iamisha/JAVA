import java.util.Scanner;//importing the class Scanner that
//helps to take the input from the user.

class takingInput_03 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        float a = sn.nextFloat();
        System.out.println("Enter the second value: ");
        float b = sn.nextFloat();
        float sum = a + b;
        System.out.println("The sum of the two numbers given is: ");
        System.out.println(sum);
    }
}