
import java.util.Scanner;

public class Iteracion2 {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite un número: ");
        int m = in.nextInt();
        System.out.println("Digite otro número: ");
        int n = in.nextInt();

        Iteracion2 test = new Iteracion2();

        System.out.println("La suma de los números divisibles entre 3 es de: " + test.operacion(m, n));

        in.close();
    }

    public int operacion(int m, int n){

        int modul = 0;
        int suma = 0;
        for(int i = m; i<=n; i++ ){

            modul = i%3;
            if(modul==0){
                suma +=i;
            }else {

            }
        }
        return suma;
    }
}
