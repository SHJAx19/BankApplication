import java.util.Scanner;

public class BankApplication {

    public static void main(String[] argg) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your full Name and CustomerId to Access Your account: ");
        String Name = sc.nextLine();
        String CustomerId = sc.next();

        Account obj1 = new Account(Name, CustomerId);
        obj1.menu();

    }
}
