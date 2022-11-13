# Exceptons and file handling

# 1. Exception vs Error

1. An exception is caused by our program whreas an error is not caused by our program (System error).

2. Exceptions are recoverable whereas errors are not recoverable.

3. Exceptions are classified as Checked/CompileTimeException(IntruptedException, IOException, SQLException, ClassNotFoundException) or Unchecked/RunTimeException type(ArithmeticException, NullPointerException) whereas errors are only unchecked(StackOverflow, VirtualMachineError, OutOfMemory) type in java.

# CompileTimeException

---> The exceptions which are checked by compiler at runtime.
---> Checked exceptions are commonly occured exception so, the compiler takes very much care about these exception.
---> example program:-

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompileTimeExceptionProgram {
public static void main(String[] args) {
readFile("myFile.txt");
}

    private static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("hey that file doesn't exit");
        }
    }

}

# RunTimeException

---> The exception which are not checked by the compiler, but directly taken care by JVM.

---> Unchecked exception are rarely occured exception so, the compiler doesn't take very much about these exception.

---> Example program:-

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunTimeExceptionProgram02 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try {
System.out.println("enter first num:-");
int a = sc.nextInt();
System.out.println("enter second num:-");
int b = sc.nextInt();
int c = (b / a);
} catch (ArithmeticException e) {
System.out.println("please give first valid num");
} catch (InputMismatchException e) {
System.out.println("please enter only integers ");
} finally {
System.out.println("program terminates");
}
}
}
