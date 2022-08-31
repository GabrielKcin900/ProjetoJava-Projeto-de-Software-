import java.util.Scanner;

public class Servo
{
    public static String retornaString()
    {
        Scanner teclado = new Scanner(System.in);
        String a = teclado.nextLine();
        return a;
    }

    public static int retornaInteiro()
    {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        teclado.nextLine();
        return a;
    }
}