import java.util.Scanner;

public class Ejercicio20Boletin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAsteriscos;
        String asterisco = "*";
        String space = " ";
        int sumaAst = 0;

        System.out.print("Introduce el numero de asteriscos: ");
        numeroAsteriscos = sc.nextInt();

        for (int i = 1; i <= numeroAsteriscos; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print(asterisco);
            }
            System.out.println(space);
        }

        System.out.println("\n");

        for (int i = 1; i <= numeroAsteriscos; i++) {
            for (int j = 1; j <= numeroAsteriscos - i; j++) {
                System.out.print(space);
            }
            for (int x = 1; x <= i; x++) {
                System.out.print(asterisco);
                for(int v = 1; v < x; v++){
                    System.out.print(asterisco);
                }
            }
            System.out.println(space);
        }
    }
}
