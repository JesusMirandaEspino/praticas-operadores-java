import java.util.*;

public class expresiones{

    public static void main( String[] args ){

        Integer num1, num2, resultadoM, resultadoS;


            System.out.println( "Ingrese los numero para sumar  y multiplicar \n" );

            System.out.println( "Ingrese el primer numero \n" );
            Scanner valor1 = new Scanner(System.in); 
            num1 = Integer.parseInt( valor1.nextLine() );

            System.out.println( "Ingrese el segundo numero \n" );
            Scanner valor2 = new Scanner(System.in); 
            num2 = Integer.parseInt( valor2.nextLine() );


            resultadoM = num1 * num2;
            System.out.println( "El resultado de la multiplicacion de los numeroes es "  + resultadoM  +  " \n " );

            resultadoS = num1 + num2;
            System.out.println( "El resultado de la suma de los numeroes es "  + resultadoS  +  " \n " );

    }

}