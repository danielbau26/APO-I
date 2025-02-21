import java.util.ArrayList;
import java.util.Scanner;

public class Iteracion3 {
    
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        int numero;
        do{
            System.out.println("Digite un número: ");
            numero = in.nextInt();
            if(numero==0){

            }else{
                numeros.add(numero);
            }
       
        }while(numero != 0);

        int suma = 0;

        for(int i = 0; i < numeros.size(); i++){

            suma += numeros.get(i);
        }

        double media;

        if(numeros.size()==0){
            media = 0;
        }else{
            media = suma/numeros.size();
        }


        System.out.println("La suma de todos los números digitados es de: " + suma);
        System.out.println("La media de todos los números digitados es de: " + media);

        in.close();
    }
}