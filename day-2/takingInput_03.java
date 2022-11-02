import java.util.Scanner;//importing the class Scanner that
//helps to take the input from the user.

class takingInput_03 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        // System.out.println("Enter the first value: ");
        // float a = sn.nextFloat();
        // System.out.println("Enter the second value: ");
        // float b = sn.nextFloat();
        // float sum = a + b;
        // System.out.println("The sum of the two numbers given is: ");
        // System.out.println(sum);
        // System.out.println("Enter any value to test hehe: ");
        // boolean bl = sn.hasNextInt();
        // System.out.println(bl);
        System.out.println("Type a striing");
        // String str = sn.next(); // it doesn't count the string after the space(counts
        // single string)
        String str = sn.nextLine();// it copies the whole string given by the user.
        System.out.println(str);
    }
}