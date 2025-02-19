import java.util.Scanner;

/*
 * Clase para calcular el area y volumen de un circulo
 */
public class Circulo{

    /*
     * Metodo principal
     * 
     * @param args
     */
	public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite el número del radio: ");
        double radio = in.nextDouble();

		Circulo uno = new Circulo();

        in.close();

		System.out.println("Area: " + uno.AreaCirculo(radio));
        System.out.println("Volumen: " + uno.VolumenCirculo(radio));

	}
	
    /*
     * Calcula el Area de un circulo despues de introducirle el radio
     * 
     * @param radio                         valor del radio de un circulo
     * @return Math.PI*Math.pow(radio,2)    area de un circulo
     */
	public double AreaCirculo (double radio){

		return Math.PI*Math.pow(radio,2);
	}

    /*
     * Calcula el Volumen de un circulo despues de introducirle el radio
     * 
     * @param radio                             valor del radio de un circulo
     * @return (4/3)*Math.PI*Math.pow(radio,3)  volumen de un ciruclo 
     */
    public double VolumenCirculo (double radio){

        return (4/3)*Math.PI*Math.pow(radio,3);

    }
}