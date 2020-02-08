import java.util.Scanner;

public final class Utilities {
    private static final Scanner STRING = new Scanner(System.in);
    private static final Scanner INTEGER = new Scanner(System.in);

    public static String enterString(String str) {
        System.out.print(str);
        return STRING.nextLine();
    }

    public static int enterInteger(String str) {
        System.out.print(str);
        return INTEGER.nextInt();
    }

    public static void clearConsole() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }
}