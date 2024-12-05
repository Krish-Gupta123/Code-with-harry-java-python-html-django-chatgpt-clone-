import java.util.*;

public class practice {
    public static void Mul(int num) {
        System.out.print(num + " ");
        Mul(num - 1);
    }

    public static void main(String args[]) {

        Mul(10);
    }
}
