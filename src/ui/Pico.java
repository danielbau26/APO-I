import java.util.Scanner;

/*
 * Clase en cual se da a saber si el día en el que estas tienes pico y placa.
 */
public class Pico{

    /*
     * Metodo principal.
     * 
     * <br>pre:<br>
     * El numero sea un entero mayor o igual a 0.
     * El dia sea un numero mayor a 0 y menor a la cantidad de dias del mes.
     * 
     * <br>post:<br>
     * Se imprime en pantalla si el usuario tiene pico y placa o no.
     * 
     * @param args
     */
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite el ultimo número de su cedula: ");
        int numero = in.nextInt();
        System.out.println("Digite el número del día: ");
        int dia = in.nextInt();

        Pico ad = new Pico();
        
        int mirar = ad.modulo(numero);
        int residuo = ad.modulo(dia);

        if (mirar==1){
            if (residuo==1){
                System.out.println("El día de hoy " + dia + ", tienes Pico y Placa");
            } else {
                System.out.println("El día de hoy " + dia + ", no tienes Pico y Placa");
            }
        } else {
            if (residuo==0){
                System.out.println("El día de hoy " + dia + ", tienes Pico y Placa");
            } else {
                System.out.println("El día de hoy " + dia + ", no tienes Pico y Placa");
            }
            }

        in.close();
    }

    /*
     * Metodo el cual te permite calcular el modulo de un número.
     * 
     * <br>pre:<br>
     * El numero sea un entero mayor o igual a 0.
     * 
     * <br>post:<br>
     * Retorna el residuo de dividir el numero entre 2
     * 
     * @param número entero mayor a 0.
     * @return el residuo de la divisón de un a/2.
     */
    public int modulo (int a){
        int residuo = a%2;
        return residuo;
    }

}