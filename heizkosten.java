import java.util.Scanner;
public class Main {
    public static void main (String[]ARGS)
    {int months;
        String heating_type;
        double kWh = 130.0;
        double area;

        double öl_preis = 1.20;                               //preise der heizarten
        double gas_preis = 2.40;
        double pellets_preis = 0.99;

        double kosten;
        double öl_abgas = 0.28;          //abgase pro kwH der unterschiedlichen heizarten
        double gas_abgas = 0.22;
        double pellets_abgas = 1.00;
        double abgas;             //abgase für den output

        Scanner month_scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie die Anzahl der Monate an");
        months = month_scanner.nextInt();

        System.out.println("Bitte geben sie die Fläche des Gebäudes in qm an");
        Scanner area_scanner = new Scanner(System.in);
        area = area_scanner.nextDouble();

        System.out.println("Bitte geben sie den Heizungstyp an");
        Scanner heating_type_scanner =new Scanner(System.in);
        heating_type=heating_type_scanner.nextLine();


        if (heating_type.contains("ÖL")||heating_type.contains("öl")||heating_type.contains("Öl"))
        {System.out.println("ölheizung");
            kosten=öl_preis*area*kWh*(months*30.5*24);
            abgas=öl_abgas*kWh*(months*30.5*24);
            output(kosten,abgas,months);}

        if(heating_type.contains("Gas")||heating_type.contains("gas")||heating_type.contains("GAS"))
        {System.out.println("Rechnung für Gasheizung");
            kosten=gas_preis*area*kWh*(months*30.5*24);
            abgas=gas_abgas*kWh*(months*30.5*24);
            output(kosten,abgas,months);}

        if(heating_type.contains("Holz")||heating_type.contains("holz")||heating_type.contains("HOLZ"))
        {System.out.println("Rechnung für heizen mit Holz");
            kosten=pellets_preis*area*kWh*(months*30.5*24);
            abgas=pellets_abgas*kWh*(months*30.5*24);
            output(kosten,abgas,months);}
    }
    public static void output(double kosten, double CO2, int monate)
    {if(monate==1)
    {System.out.println("Es kostet: " + kosten + " € zu heizen und es wird dabei " + CO2 + " Kg CO2 Freigesetzt innerhalb eines Monats");}
    else
    {System.out.println("Es kostet: " + kosten + " € zu heizen und es wird dabei " + CO2 + " Kg CO2 Freigesetzt innerhalb " + monate + " Monaten");}

    }

}
