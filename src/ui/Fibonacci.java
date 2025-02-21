import java.util.Scanner;

/*
 * Clase para hallar el número de la sucesión de Fibonacci
 */
public class Fibonacci{

    /*
     * Metodo principal
     * 
     * <br>pre:<br>
     * n debe ser mayor o igual a 0
     * 
     * <br>post:<br>
     * se imprime en pantalla el resultado según la serie de Fibonacci y el número digitado
     * 
     * @param args
     */
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite un número: ");
        int n = in.nextInt();

	Fibonacci ad = new Fibonacci();

	System.out.println("El número de la posición " + n + " de la serie de Fibonnaci es: " + ad.prueba(n));

        in.close();
    }

    /*
     * Este metodo permite hallar el número que corresponde a la posición de la sucesión de Fibonacci.
     * 
     * <br>pre:<br>
     * n debe ser mayor o igual a 0.
     * 
     * <br>post:<br>
     * El número al que corresponde la posición n.
     * 
     * @param n     un número entero mayor o igual a 0
     * 
     * return resultado     El número al que corresponde a la posición m.
     */
    public int prueba (int n){

        int resultado = 0;
        if (n==0){
            resultado=0;
        }
        else if (n==1){
            resultado=1;
        }
        else{
        int a=1,b=0;
        for (int i = 2; i <= n; i++){
            resultado = a + b;
            a = b;
            b = resultado;
        }
        }
	return resultado;
    }
}