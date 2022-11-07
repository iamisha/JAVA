
public class CGPA {
    float java = 55;
    float malp = 66;
    float sef = 77;
    float pqt = 88;
    float math = 90;
    float dsa = 66;
    float total = java + malp + sef + pqt + math + dsa;
    float per = (total / 600) * 100;
    float cgpa = (float) (per / 9.5);

    void fun() {
        System.out.println("Your final cgpa is: " + cgpa);
    }

    public static void main(String[] args) {
        CGPA ref = new CGPA();
        ref.fun();
    }
}
