import java.util.Scanner;
public class heizkosten {
    public static void main (String[]ARGS)
    {int months;
    String heating_type;
    double kWh = 130.0;
    double area;

    double öl = 1.20;                               //preise der heizarten
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

    if (heating_type.contains("ÖL")||heating_type.contains("öl")||heating_type.contains("Öl"))
    {System.out.println("Rechnung für ölheizung");
    output(12.0,20.0,months);}
    if(heating_type.contains("Gas")||heating_type.contains("gas")||heating_type.contains("GAS"))
    {System.out.println("Rechnung für Gasheizung");}

    if(heating_type.contains("Holz")||heating_type.contains("holz")||heating_type.contains("HOLZ"))
    {System.out.println("Rechnung für heizen mit Holz");}
    }
    public static void output(double kosten, double CO2, int monate)
    {if(monate==1)
    {System.out.println("Es kostet: " + kosten + " zu heizen und es wird dabei " + CO2 + " Kg CO2 Freigesetzt innerhalb eines Monats");}
    else
    {System.out.println("Es kostet: " + kosten + " zu heizen und es wird dabei " + CO2 + " Kg CO2 Freigesetzt innerhalb " + monate + "Monaten");}

}

}
