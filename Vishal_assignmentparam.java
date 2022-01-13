import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Vishal_assignmentparam {
    public static void ShowDetails(String name) {

        Random random = new Random();
        int id = random.nextInt(100000);

        String timeStamp = new SimpleDateFormat("yyyy:MM:dd  HH:mm:ss").format(Calendar.getInstance().getTime());

        System.out.println("************** Details ******************");
        System.out.println("Id          :   " + id);
        System.out.println("Name        :   " + name);
        System.out.println("Date & Time :   " + timeStamp);

    }

    public static void main(String args[]) {
        System.out.println("Enter the name : ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();

        ShowDetails(name);
    }
}