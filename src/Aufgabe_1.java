import java.util.Scanner;

public class Aufgabe_1 {
    public static void main(String[] args) {
        // Scanner zum Einlesen von Benutzereingaben
        Scanner input = new Scanner(System.in);
        boolean beenden = false; // Steuert die Hauptschleife

        do {
            int portnummer;

            // Schleife, um sicherzustellen, dass die Eingabe gültig ist
            while (true) {
                System.out.println("Geben Sie eine Portnummer ein (zwischen 0 und 65535):");
                portnummer = input.nextInt(); // Portnummer vom Benutzer einlesen
                if (portnummer >= 0 && portnummer <= 65535) {
                    break; // Schleife verlassen, wenn Eingabe gültig
                } else {
                    // Fehlernachricht bei ungültiger Eingabe
                    System.out.println("Ungültige Eingabe. Bitte geben Sie eine Portnummer im Bereich 0 bis 65535 ein.");
                }
            }

            // Überprüfung der Portkategorie
            if (portnummer <= 1023) {
                // Well-known Ports
                switch (portnummer) {
                    case 21 : System.out.println("Port 21: FTP (File Transfer Protocol, Übertragung von Dateien)");
                    break;
                    case 23 : System.out.println("Port 23: Telnet (Einloggen in entfernte Rechner)");
                    break;
                    case 25 : System.out.println("Port 25: SMTP (Simple Mail Transfer Protocol, Mailversand)");
                    break;
                    case 80 : System.out.println("Port 80: HTTP (HyperText Transfer Protocol, Zugriff auf Web-Server)");
                    break;
                    case 143 : System.out.println("Port 143: IMAP (Internet Message Access Protocol, Zugriff auf Mail-Server)");
                    break;
                    default : System.out.println("Sonstiger Dienst im Well-known-Bereich.");
                }
            } else if (portnummer <= 49151) {
                // Registered Ports
                System.out.println("Der Port ist ein 'registered Port'.");
            } else {
                // Dynamische Ports
                System.out.println("Der Port ist ein 'dynamic Port'.");
            }

            // Benutzer fragen, ob er fortfahren möchte
            System.out.println("Möchten Sie fortfahren? (1 für Ja/2 für Nein)");
            int antwort = input.nextInt();
            if (antwort == 2) {
                beenden = true; // Hauptschleife beenden, wenn Benutzer Nein wählt
            }

        } while (!beenden); // Schleife läuft, solange der Benutzer fortfahren möchte

        // Programmende
        System.out.println("Programm beendet.");
    }
}
