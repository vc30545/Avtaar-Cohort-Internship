import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

        System.out.print("Enter your name  : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        String time = new SimpleDateFormat("DD/MM/YYYY   hh:mm:ss").format(Calendar.getInstance().getTime());
        // System.out.println(time);

        Random random = new Random();
        int id = random.nextInt(10000000);
        // System.out.println(id);

        System.out.println("**********Details**********");
        System.out.println("Name        : " + name);
        System.out.println("ID          : " + id);
        System.out.println("Date & Time : " + time);

    }
}
