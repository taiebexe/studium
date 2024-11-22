import java.util.Scanner;

public class Aufgabe_1 {
    public static void main(String[] args) {
        // Array mit bekannten Portnummern
        int[] portNumbers = {21, 23, 25, 80, 143};
        // Array mit den Beschreibungen zu den bekannten Ports
        String[] portDescriptions = {
                "FTP (File Transfer Protocol, Übertragung von Dateien)",
                "Telnet (Einloggen in entfernte Rechner)",
                "SMTP (Simple Mail Transfer Protocol, Mailversand)",
                "HTTP (HyperText Transfer Protocol, Zugriff auf Web-Server)",
                "IMAP (Internet Message Access Protocol, Zugriff auf Mail-Server)"
        };

        // Scanner zum Einlesen von Benutzereingaben
        Scanner input = new Scanner(System.in);
        boolean Beenden = false; // Steuert die Hauptschleife

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

            // Überprüfung, in welchem Bereich sich die Portnummer befindet
            if (portnummer >= 0 && portnummer <= 1023) {
                boolean found = false; // Flag, um zu überprüfen, ob der Port bekannt ist
                for (int i = 0; i < portNumbers.length; i++) {
                    if (portNumbers[i] == portnummer) {
                        // Ausgabe der Beschreibung, wenn der Port bekannt ist
                        System.out.println("Das ist ein well-known Port bzw. " + "Port " + portnummer + ": " + portDescriptions[i]);
                        found = true; // Port wurde gefunden
                        break;
                    }
                }
                if (!found) {
                    // Nachricht, wenn der Port nicht in der Liste ist
                    System.out.println("Sonstiger Dienst.");
                }

            } else if (portnummer >= 1024 && portnummer <= 49151) {
                // Nachricht für registered Ports
                System.out.println("Der Port ist ein 'registered Port'.");
            } else {
                // Nachricht für dynamische Ports
                System.out.println("Der Port ist ein 'dynamic Port'.");
            }

            // Benutzer fragen, ob er fortfahren möchte
            System.out.println("Möchten Sie fortfahren? (1 für Ja/2 für Nein)");
            int antwort = input.nextInt(); // Antwort vom Benutzer einlesen
            if (antwort == 2) {
                Beenden = true; // Hauptschleife beenden, wenn Benutzer Nein wählt
            }

        } while (!Beenden); // Schleife läuft, solange der Benutzer fortfahren möchte

        // Programmende
        System.out.println("Programm beendet.");
    }
}
