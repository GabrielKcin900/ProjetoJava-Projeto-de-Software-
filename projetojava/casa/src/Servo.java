import java.util.Scanner;
import java.util.Random;

public class Servo {

    public static String retornaString() {

        Scanner teclado = new Scanner(System.in);
        String a = teclado.nextLine();
        return a;
    }

    public static int retornaInteiro() {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        teclado.nextLine();
        return a;
    }

    public static int retornaInteiroIntervalo(int min, int max) {
        Scanner teclado = new Scanner(System.in);
        int resultado = -999; // VALOR ALEATÓRIO SÓ PARA TER MESMO
        boolean serInteiro = true, primeiroLoop = true;
        do {

            if ( (!primeiroLoop) && serInteiro) { // SÓ MOSTRAR ESSE 'PRINT ABAIXO' QUANDO ESTIVER NA SEGUNDA ITERAÇÃO
                System.out.print("\n\nO número " + resultado
                        + " é uma escolha inexistente, por favor digite um inteiro entre " + min
                        + " a " + max + "(incluindo os limites): ");
            }

            serInteiro = true;

            try {
                String a = teclado.nextLine();
                resultado = Integer.parseInt(a);
            } catch (NumberFormatException e) { //SÓ VAI ACONTECER SE O "Integer.parseInt(a)" não for um inteiro
                serInteiro = false;
                System.out.print("\n\nIsso que você digitou não é uma escolha.\n\nDigite um número entre " + min + " e "
                        + max + "(incluindo os limites): ");
            }
            primeiroLoop = false;

        } while (!(resultado >= min && resultado <= max));

        return resultado;
    }

}