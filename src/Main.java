import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez un nombre");
        int nombre= sc.nextInt();

        System.out.println("Saisissez un nombre réel");
        float nombrereel= sc.nextFloat();

        System.out.println("Saisissez un nombre réel double");
        double nombrereel2= sc.nextDouble();

        System.out.println(nombre);
        System.out.println(nombrereel);
        System.out.println(nombrereel2);
    }
}