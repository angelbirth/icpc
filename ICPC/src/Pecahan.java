import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pecahan {

    public static void main(String[] args) {
        // TODO: remove when submitting
        if (args.length > 0) {
            // try {
            // System.setIn(new FileInputStream(args[0]));
            // } catch (FileNotFoundException e) {
            // System.err.println(e.getMessage());
            // }
        }
        Scanner s = new Scanner(System.in);
        String[] input;
        int num, den, gcd;
        while (s.hasNextLine()) {
            input = s.nextLine().split("/");
            num = Integer.parseInt(input[0]);
            if (input.length == 1) {
                System.out.println(num);
                continue;
            }
            den = Integer.parseInt(input[1]);
            if (num == den) {
                System.out.println(1);
            } else if (num == 0) {
                System.out.println(0);
            } else {
                // System.out.println(num + "/" + den);
                gcd = gcd(num, den);
                num /= gcd;
                den /= gcd;
                if ((num / den) >= 1 || -(num / den) >= 1) {
                    System.out.printf("%d %d/%d%n", num / den,
                            num % den > 0 ? num % den : -num % den,
                            den > 0 ? den : -den);
                    // num/den, Math.abs(num%den),Math.abs(den)
                } else {
                    System.out.printf("%d/%d%n", num, den);
                }
            }
        }
        s.close();
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
