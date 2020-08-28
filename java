// * @author Jonathan Gerardo Cañon Forero 
//   Code: 261217202 
import java.util.*;
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i,menor,mayor=1;
 
			System.out.print ("Recuerda que el numero que debes digitar debe ser positivo entero 0>=");
			System.out.print ("Introduce el numero menor del rango: ");
			menor = sc.nextInt();
			System.out.print ("Introduce el numero mayor del rango: ");
			mayor =sc.nextInt();
			//System.out.print("Los numeros de Fibonacci entre" + menor  + " y " + mayor +"son:");

			fibo1=1;
			fibo2=1;
			
		
			System.out.print(fibo1 + " ");
			for(i=2;i<=numero;i++){
				fibo2 = fibo1 + fibo2;
				fibo1 = fibo2 - fibo1;
             //System.out.print(fibo2 + " ");
            
			} 
        
    }

}
 
