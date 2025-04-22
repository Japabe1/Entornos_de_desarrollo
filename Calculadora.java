//Modificacion para github
//Esto es un prueba
import java.util.Scanner;

public class Calculadora {
    static Scanner teclado = new Scanner(System.in);
    //Declaracion de función void para mostrar mensaje con opciones calculadora 
    public static void opciones(){
        System.out.println();
            System.out.println("\nAquí tienes las distintas operaciones: ");
            System.out.println("Pulsa 1 para sumar:");
            System.out.println("Pulsa 2 para restar:");
            System.out.println("Pulsa 3 para multiplicar:");
            System.out.println("Pulsa 4 para dividir:");
            System.out.println("Pulsa 5 para el módulo:");
            System.out.println("Pulsa 6 para salir de la calculadora:");
            System.out.println("Pulsa 7 para salir de la calculadora");
    }
    //Función para entrada del primer dato double
    public static double dato1(){
        double numero;
        System.out.println("Introduce el primer número por consola: ");
        numero = teclado.nextDouble();
        return numero;
    }
    //Función para la entrada del segundo dato double
    public static double dato2(){
        double numero;
        System.out.println("Introduce el segundo número por consola: ");
        numero = teclado.nextDouble();
        return numero;
    }
    //Función para realizar la suma de dos ndouble
    public static double sumar(double num1, double num2){

        double resultado = num1 + num2 ;
        System.out.println("\nEl resultado de la suma es: "+resultado);
        return resultado;
    }
    //Función para realiza la resta de dos double
    public static double restar(double num1, double num2){

        double resultado = num1 - num2 ;
        System.out.println("\nEl resultado de la resta es: "+resultado);
        return resultado;
    }
    //Función para realizar el producto de dos double
    public static double producto(double num1, double num2){
        
        double resultado = num1 * num2;
        System.out.println("\nEl resultado de la multiplicación es: "+resultado);
        return resultado;
    }
    //Función para realizar la división entre dos double
    public static double division(double num1, double num2){
        
        double resultado = num1 / num2 ;
        System.out.println("\nEl resultado de la división es: "+resultado);
        return resultado;
    }
    //Función que devuelve el resto entre dos double
    public static double resto(double num1, double num2){

        double resultado = num1 % num2 ;
        System.out.println("\nEl resultado del modulo es : "+resultado);
        return resultado;
    }

    //Fución void para mostrar mensaje de cierre de calculadora
    public static void fin(){
        System.out.println("#####################################");
        System.out.println("\nSE CIERRA LA CALCULADORA\n");
        System.out.println("#####################################");

    }
    //Función void para mensaje de bienvenida
    public static void bienvenida(){
        
        System.out.println("#####################################");
        System.out.println("\nBienvenido a tu calculadora\n");
        System.out.println("#####################################\n");
    }
    
    public static void main(String[] args) throws Exception {
       
        bienvenida();
        //Declaración de variables
        double numero1, numero2, resultado;
        int operacion;
        
        //Entrada de datos
        numero1 = dato1();
        numero2 = dato2();

        //Calculo y salida de datos
        do{    
        opciones();

         operacion = teclado.nextInt();

        //Calculos y Salida de datos
        
            switch (operacion) {
                case 1:
                    resultado = sumar(numero1, numero2);
                    break;
                case 2:
                    resultado =  restar(numero1, numero2);
                     break;
                case 3:
                     producto(numero1, numero2);
                     break;
                case 4:
                    division(numero1, numero2);
                    break;
                case 5:
                    resto(numero1, numero2);
                    break; 
                case 6:
                    numero1 =dato1();
                    numero2 = dato2();
                    break;
                       
                default:
                    fin();
                    break;
            }   
        }while(operacion >=1 && operacion<=6);
    }
}


