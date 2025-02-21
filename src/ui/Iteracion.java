import java.util.Scanner;

/*
 * Clase 
 */
public class Iteracion {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite un número como base: ");
        double base = in.nextDouble();
        System.out.println("Digite un número como exponente");
        int exponente = in.nextInt();

        Iteracion test = new Iteracion();

        System.out.println(test.operacion(base,exponente));
        in.close();
    }

    public double operacion(double a, int b){

        double c = 1;
        for(int i = 0; i < b; i++){
            c = c* a;
        }
        return c;
    }
}