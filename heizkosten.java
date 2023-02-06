import java.util.Scanner;
public class heizkosten {
    public static void main (String[]ARGS)
    {int months;
    String heating_type;
    double kWh;
    double area;

    double öl = 1.20;
    double gas = 2.40;
    double holz = 0.99;

    Scanner month_scanner = new Scanner(System.in);
    System.out.println("Bitte geben sie die Anzahl der Monate an");
    months = month_scanner.nextInt();
    System.out.println(months);

    System.out.println("Bitte geben sie die Fläche des Gebäudes in qm an");
    Scanner area_scanner = new Scanner(System.in);
    area = area_scanner.nextDouble();
    System.out.println(area);

    System.out.println("Bitte geben sie den Heizungstyp an");
    Scanner heating_type_scanner =new Scanner(System.in);
    heating_type=heating_type_scanner.nextLine();
    System.out.println(heating_type);
}}
