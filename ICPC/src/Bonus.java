import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream("D:\\bonus.out"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Scanner s = new Scanner(System.in);
        int n, k, m;String input[];
        while (s.hasNextLine()) {
            input=s.nextLine().split(" ");
            if(input[0].equals(""))break;
//            System.err.println(input.length);
            n = Integer.parseInt(input[0]);
            k = Integer.parseInt(input[1]);
            m = Integer.parseInt(input[2]);
            System.out.println(f(n).substring(k, k + m));
        }
    }

    static String f(int a) {
        if (a == 0)
            return "";
        if (a == 1)
            return "()";
        StringBuilder sb = new StringBuilder();
        String temp = "";
        for (int i = a - 1; i > 0; i--) {
            sb.append(f(a - i));
        }
        sb.insert(0, '(');
        sb.append(')');
        return sb.toString();
    }
}
