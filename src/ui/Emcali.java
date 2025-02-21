import java.util.Scanner;

/*
 * Clase que permite saber el valor de una llamada dependiendo de el tiempo,jornada y zona
 */
public class Emcali{

	/*
	 * Metodo principal
	 * 
	 * <br>pre:<br>
	 * Verificación de lo digitado: time sea mayor a 0, jornada sea 1 o 2 y zona sea entre 1 y 5 incluyendolos
	 * 
	 * <br>post:<br>
	 * Da el costo de la llamada
	 * 
	 * @param args
	 */
	public static void main (String[] args){

	Scanner in = new Scanner(System.in);

	System.out.println("Digite el tiempo de la llamada en minutos: ");
	int time = in.nextInt();

	System.out.println("");

	System.out.println("Digite el número de la jornada en la que se realizo: ");
	System.out.println("1. Diurno");
	System.out.println("2. Noctruno");
	int jornada = in.nextInt();

	System.out.println("");

	System.out.println("Digite el número de la zona de la ciudad:");
	System.out.println("1. Zona Norte");
	System.out.println("2. Zona Sur");
	System.out.println("3. Zona Oriente");
	System.out.println("4. Zona Occidente");
	System.out.println("5. Zona Centro");
	int zona = in.nextInt();

	Emcali test = new Emcali();

	if (jornada == 1){
        System.out.println("El valor total de la llamada fue de: " + test.tarifaDia(time,zona));
	} else {
        System.out.println("El valor total de la llamada fue de: " + test.tarifaNoche(time,zona));
	}

	in.close();
	}

	/*
	 * Metodo que permite saber el costo de la llamada en jornada diurna
	 * 
	 * <br>pre:<br>
	 * El tiempo tiene que ser mayor a 0 y la zona tiene que ser entre 1 y 5 incluyendolos
	 * 
	 * <br>post:<br>
	 * Retorna el costo total de la llamada
	 * 
	 * @param a			duración de la llamada en minutos
	 * @param b			zona de la ciudad en la que se realizo la llamada
	 * @return valor	el costo total de la llamada en jornada diurna
	 */
	public int tarifaDia (int a, int b){
		int valor = 0;
		if (b == 1){
		valor = a*80;
		} else if (b == 2){
		valor = a*70;
		} else if (b == 3){
		valor = a*100;
		} else if (b == 4){
		valor = a*60;
		} else {
		valor = a*75; // zona centro
		}
		return valor;
	}

	/*
	 * Metodo que permite saber el costo de la llamada en jornada nocturna
	 * 
	 * <br>pre:<br> 
	 * el tiempo tiene que ser mayor a 0 y la zona tiene que ser entre 1 y 5 incluyendolos
	 * 
	 * <br>post:<br> 
	 * retorna el costo total de la llamada
	 * 
	 * @param a 		duración de la llamada en minutos
	 * @param b			zona de la ciudad en la que se realizo la llamada
	 * @return valor	el costo total de la llamada en jornada nocturna
	 */
	public int tarifaNoche (int a, int b){
		int valor = 0;
		if (b == 1){
		valor = a*65;
		} else if (b == 2){
		valor = a*60;
		} else if (b == 3){
		valor = a*80;
		} else if (b == 4){
		valor = a*55;
		} else {
		valor = a*68; // zona centro
		}
		return valor;
	}
}