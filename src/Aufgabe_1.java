import java.util.Scanner;

public class Aufgabe_1 {
    public static void main(String[] args) {
        // Array of port numbers
        int[] portNumbers = {21, 23, 25, 80, 143};
        // Array of corresponding descriptions
        String[] portDescriptions = {
                "FTP (File Transfer Protocol, Übertragung von Dateien)",
                "Telnet (Einloggen in entfernte Rechner)",
                "SMTP (Simple Mail Transfer Protocol, Mailversand)",
                "HTTP (HyperText Transfer Protocol, Zugriff auf Web-Server)",
                "IMAP (Internet Message Access Protocol, Zugriff auf Mail-Server)"
        };
        Scanner input = new Scanner(System.in);
        boolean Beenden = false;

        do {
            int portnummer;

            // Keep asking for a valid port number
            while (true) {
                System.out.println("Geben Sie eine Portnummer ein (zwischen 0 und 65535):");
                portnummer = input.nextInt();
                if (portnummer >= 0 && portnummer <= 65535) {
                    break; // Exit the loop if input is valid
                } else {
                    System.out.println("Ungültige Eingabe. Bitte geben Sie eine Portnummer im Bereich 0 bis 65535 ein.");
                }
            }


           
            if (portnummer >= 0 && portnummer <= 65535) {  // check if the input is within valid range
                if (portnummer >= 0 && portnummer <= 1023) {
                    boolean found = false;
                    for (int i = 0; i < portNumbers.length; i++) {
                        if (portNumbers[i] == portnummer) {
                            System.out.println("das ist ein well known Port bzw " + "Port " + portnummer + ": " + portDescriptions[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Sonstiger Dienst.");
                    }

                } else if (portnummer >= 1024 && portnummer <= 49151) {
                    System.out.println("Der Port ist ein 'registered Port'.");
                } else {
                    System.out.println("Der Port ist ein 'dynamic Port'.");
                }
            } else {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine Portnummer im Bereich 0 bis 65535 ein.");
            }

            // Ask if the user wants to continue
            System.out.println("Möchten Sie fortfahren? (1 für Ja/2 für Nein)");
            int antwort = input.nextInt();
            if (antwort == 2) {
                Beenden = true;
            }

        } while (!Beenden);

        System.out.println("Programm beendet.");
    }
}
