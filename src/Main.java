import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        rechnen(scanner);
    }

    public static void restart(Scanner scanner) {
        System.out.println("Drücke b zum Beenden oder r zum Restart");
        String benutzereingabe = scanner.nextLine();
        switch (benutzereingabe) {
            case "b":
                System.exit(0);
                break;
            case "r":
                rechnen(scanner);
                break;
            default:
                System.out.println("Falsche Eingabe!!!");
                restart(scanner);
        }

    }

    public static void rechnen(Scanner scanner) {
        System.out.println("Tuten Gat was möchtest du rechnen?");
        System.out.println("Gib die erste Zahl zum berechnen ein und bestätige mit enter.");
        String answer1 = scanner.nextLine();
        Float a = Float.parseFloat(answer1);
        System.out.println("Gib das rechensymbol für die Rechnung an.(/,*,-,+)");
        String mathesymbol = scanner.nextLine();
        System.out.println("Gib die 2te Zahl zum berechnen ein.");
        String answer2 = scanner.nextLine();
        Float b = Float.parseFloat(answer2);
        Rechner rechner = new Rechner(a, b);
        Float ergebnis= rechner.rechne(mathesymbol);
        System.out.println(String.format("Ergebnis: %s %s %s = %s", answer1,mathesymbol,answer2,ergebnis));
        restart(scanner);
    }
}


