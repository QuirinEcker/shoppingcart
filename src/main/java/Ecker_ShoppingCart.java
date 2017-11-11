/*----------------------------------------------------------
 *                 HTL-Leonding / Klasse: 1xHITM
 * ----------------------------------------------------------
 * Übungsnr.:   --
 * Übungstitel: ShoppingCart
 * Autoren:     Vorname Nachname
 * Version:     1.0
 * Datum:       11.11.2017
 * ----------------------------------------------------------
 * Kurzbeschreibung:
 * berechnung der mehrwertsteuer.
 *
 * ----------------------------------------------------------
 * Beschreibung der grundlegenden Lösungsidee:
 * berechnung eines Preises mit allen Komponenten durch if.
 *
 * ----------------------------------------------------------
*/

import java.util.Scanner;

public class Ecker_ShoppingCart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nettostueckpreis;
        int stuecktzahl;
        String geschenkoption;
        String lieferort;
        double gesamtpreis;
        double mwst = 0;
        double geschenkoptionkosten;
        double gesamtpreismitmwst = 0;
        int mwstsatz = 0;

        System.out.println("Shopping Cart");
        System.out.println("=============");
        System.out.println();

        System.out.print("Netto-Stückpreis: ");
        nettostueckpreis = scanner.nextDouble();
        System.out.print("Stückzahl: ");
        stuecktzahl = scanner.nextInt();
        System.out.print("Geschenkoption (ja / nein): ");
        geschenkoption = scanner.next();
        System.out.print("Lieferort (at / de): ");
        lieferort = scanner.next();

        if (geschenkoption.equals("ja")){
            geschenkoptionkosten = 2.5;
        }

        else if (geschenkoption.equals("nein")){
            geschenkoptionkosten = 0;
        }

        else {
            System.out.println("Bitte nur mit ja oder ein antworten");
            return;
        }

        if (lieferort.equals("de")){
            gesamtpreis = stuecktzahl * (nettostueckpreis + geschenkoptionkosten);
            mwst = gesamtpreis / 100 * 19;
            gesamtpreismitmwst = gesamtpreis + mwst;
            mwstsatz = 19;
        }

        else if (lieferort.equals("at")){
            gesamtpreis = stuecktzahl * (nettostueckpreis + geschenkoptionkosten);
            mwst = gesamtpreis / 100 * 20;
            gesamtpreismitmwst = gesamtpreis + mwst;
            mwstsatz = 20;
        }

        else {
            System.out.println("Diese Region ist nicht vorhanden. Falsche Eingabe: " + lieferort);
            return;
        }

        System.out.println();
        System.out.printf("Gesmmtpreis: Eur %.2f \n" , gesamtpreismitmwst);
        System.out.printf("Darin enthalten sind %d %% Mwst = EUR %.2f", mwstsatz, mwst);


    }
}
