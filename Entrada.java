import java.util.Scanner;

public class Entrada {
    static Scanner scanner;
    public static int Opcao(){
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static String Info(){
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
