
import java.util.Scanner;
public class lawtechlab {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please insert your greeting:");
        String greeting = in.next();
        for (int i=0; i<greeting.length();i++)
        {   System.out.println(greeting.charAt(i));
        }

        


    }
}
