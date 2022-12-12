class CustomExceptionTest extends Exception {
    String message;

    public CustomExceptionTest(String str) {
        message = str;
    }

    public String toString() {
        return ("our exception occured" + message);

    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            throw new CustomExceptionTest("you custom here");
        } catch (CustomExceptionTest e) {
            System.out.println(e);
        }
    }
}