package agustin.tenny.accesslab02;
import java.util.Scanner;

/**
 * Created by Tenny on 2/2/16.
 */
public class WaxManager {
    static Scanner scanner = new Scanner(System.in);


    public static Wax pickWax(String x, int y) {

        return Wax.chooseWax(x,y);
    }

    public static void main(String[] args) {
        System.out.println("Enter temperature: ");
        int tempInput = scanner.nextInt();
        scanner.nextLine(); //if you enter .nextInt(), it sees a whitespace so follow with nextLine()
                            //nextInt takes the Int out with \n but still sees the line with \n

        System.out.println("Enter snow condition: ");
        String snowInput = scanner.nextLine();

        Wax wax1 = pickWax(snowInput, tempInput); //assigning reference

        System.out.println(wax1.getColor() + wax1.getType());

    }
}

