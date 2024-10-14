/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosfuncionesprocedimientos;

import java.util.Scanner;

/**
 *
 * @author elvis
 */
public class EjerciciosFuncionesProcedimientos {

    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
                
        String negro = "\033[30m";
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String amarillo = "\033[33m";
        String azul = "\033[34m";
        String magenta = "\033[35m";
        String blanco = "\033[37m";
        String cyan = "\033[36m";
        String reset = "\u001B[0m";
                
        Scanner teclado = new Scanner(System.in);

        // ***   ******   ***   Ejercicio 1 Funciones   ***   ******   ***
        // *** Crear una función que devuelva la cantidad de vocales de una palabra ***
        
        System.out.println(amarillo+"*.- Ejercicio 1 Funciones -.*\u001B[0m");
        System.out.print("Por favor ingrese una palabra: ");
        String cadena = teclado.next(); 
        
        int vocalesContador = cantidadVocales(cadena);        
        System.out.println(blanco + "La palabra" +verde+" \"" + cadena + "\"\u001B[0m contiene" +verde+" \"" + vocalesContador + "\"\u001B[0m vocales");   
        
        // ******   Ejercicio 2 Funciones  ******
        // *** Crear una función que indique si un número es múltiplo de 3 ***
        
        System.out.println(amarillo+"\n*.- Ejercicio 2 Funciones -.*\u001B[0m");
        System.out.print("Por favor ingrese un número a verificar si el mismo es multiplo de 3: ");
        int numero = teclado.nextInt();
        System.out.println(verde+ "El número " + numero + " = " + blanco + multiploDeTres(numero));
        
        // ******   Ejercicio 3 Funciones  ******
        // *** Crear una función que aplique %50 de premio si el ingreso es de más de 35.000 ***
        
        System.out.println(amarillo+"\n*.- Ejercicio 3 Funciones -.*\u001B[0m");
        System.out.println("Función que aplica %50 de premio si el ingreso es de más de 35.000");
        System.out.print("Por favor ingrese el importe: ");
        float monto = teclado.nextFloat(); 
        
        float premio = calcularPremio(monto);        
        System.out.println(verde+"\n*.- Saludos! El premio calculado es: \u001B[0m$" +blanco+ premio);
        
        
        // ***   ******   ***   Ejercicio 1 Procedimientos   ***   ******   ***
        // *** Crear un procedimiento que calcule el área del triángulo y lo informe por pantalla ***
        
        System.out.println(cyan+"\n*.- Ejercicio 1 Procedimientos -.*\u001B[0m");
        System.out.print("Ingrese la base del triángulo: ");
        float base = teclado.nextFloat();
        System.out.print("Ingrese la altura del triángulo: ");
        float altura = teclado.nextFloat();
        
        calcularAreaTriangulo(base, altura);
        
        // ******   Ejercicio 2  Procedimientos ******
        /*
        Crear un procedimiento que muestre por pantalla el valor del IVA de un producto ingresado como parámetro
        */
        System.out.println(cyan+"\n*.- Ejercicio 2 Procedimientos -.*\u001B[0m");
        System.out.println(blanco+"*.- Calcular el IVA -.*\u001B[0m");
        System.out.print("Ingrese el precio del producto: $ ");
        double precio = teclado.nextDouble();
        
        calcularIVA(precio);
        
        // ****** Ejercicio 3 Procedimientos ******
        /*
        Crear un procedimiento que muestre por pantalla la cantidad de números impares que ingresa el usuario y lo informe por pantalla
        */
        System.out.println(cyan+"\n*.- Ejercicio 3 Procedimientos -.*\u001B[0m");
        System.out.println("*.- Procedimiento que muestra por pantalla la cantidad de números impares -.*");
        System.out.print("Ingrese la cantidad de números enteros a verificar: ");
        int cantidadNumeros = teclado.nextInt();
        
        contarNumerosImpares(cantidadNumeros);
        
        // ****** Ejercicio 4 Funciones/Procedimientos ******
        /*
        Crear un programa que reciba 3 parámetros y calcule la suma, resta, multiplicación, división y
        el resto de dos números con decimales. Las consignas para lograrlo son:
        * Debe crear un procedimiento, que reciba los 3 parámetros: 2 números con
        decimales y el carácter de operación.
        * Debe crear las funciones de las operaciones que retornen un número con decimales.
        * Debe mostrar por consola un mensaje que indique el resultado y la operación realizada
        */        
        System.out.println(magenta+"\n*.- Ejercicio 4 Funciones/Procedimientos -.*\u001B[0m");
        System.out.print("Ingrese el primer número decimal: ");
        double num1 = teclado.nextDouble();
        System.out.print("Ingrese el segundo número decimal: ");
        double num2 = teclado.nextDouble();
        
        System.out.println("*.- M E N U -.* ");
        System.out.println("Seleccione la Operación a realizar");
        System.out.println("A - Suma");
        System.out.println("S - Resta");
        System.out.println("M - Multiplicación");
        System.out.println("D - División");
        System.out.println("R - Resto/Modulo");

        char operacion = teclado.next().toUpperCase().charAt(0);
//        // *** Validar Opcion ***
//        while(operacion != 'a' || operacion != 's' || operacion != 'm' || operacion != 'd' || operacion != 'r'){ 
//            // *** Opción Invalida ***
//            System.out.println("\nError...! Opcion I N V A L I D A.");                                        System.out.print("\nIngrese una letra u opción valida: ");
//            operacion = teclado.next().toUpperCase().charAt(0);        
//        }
        

        switch(operacion){
            case 'A','a': System.out.println("Resultado: " + sumar(num1, num2)); break;
            case 'S','s': System.out.println("Resulatdo: " + restar(num1, num2)); break;
            case 'M','m': System.out.println("Resultado: " + multiplicar(num1, num2)); break;
            case 'D','d': System.out.println("Resultado: " + dividir(num1, num2)); break;
            case 'R','r': System.out.println("Resultado: " + resto(num1, num2)); break;
            default: System.out.println("ERROR..! Opción INVALIDA.");
        }        
        
    } // *** Cierre del main ***
    
    
    // *** Función Ejercicio 1 ***
    public static int cantidadVocales(String palabra){
        
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
           if ((Character.toLowerCase(palabra.charAt(i))=='a') ||
               (Character.toLowerCase(palabra.charAt(i))=='e') || 
               (Character.toLowerCase(palabra.charAt(i))=='i') || 
               (Character.toLowerCase(palabra.charAt(i))=='o') || 
               (Character.toLowerCase(palabra.charAt(i))=='u')){
               contador++;
            }           
        }
        return contador;    
    } 
    
    // *** Función Ejercicio 2 ***
    public static boolean multiploDeTres(int numero){
        
        return numero%3 == 0;
    }
    
    // *** Función Ejercicio 3 ***
    public static float calcularPremio(float ingreso){
        
        float premio = 50f;
        if(ingreso > 35000){
            premio = ingreso + (ingreso * premio)/100;
       }else{
            premio = 0;
        }
        return premio;    
    }
    
    // *** Procedimientos Ejericicio 1 ***
    public static void calcularAreaTriangulo(float base, float altura){
        float area = (base * altura) / 2;
        System.out.println("El área del triangulo es: " + area);
    }
    
    // *** Procedimientos Ejericicio 2 ***
    public static void calcularIVA(double precio){
        double iva = (precio * 21)/100;
        System.out.println("El precio del prodcuto es: " + precio);
        System.out.println("IVA: $" + iva);
        System.out.println("TOTAL: $ " + (precio + iva));    
    }
    
    // *** Procedimientos Ejericicio 3 ***
    public static void contarNumerosImpares(int cantidadNumeros){
        
        Scanner sc = new Scanner(System.in);
        int contadorImpares = 0;
        int numero;

        System.out.println("Ingrese " + cantidadNumeros + " números enteros:");
        for (int i = 0; i < cantidadNumeros; i++) {
            numero = sc.nextInt();
            
            if (numero % 2 != 0) {
                contadorImpares++;
            }
        }

        System.out.println("\nCantidad de números ingresados: " + cantidadNumeros);
        System.out.println("Cantidad de números impares encontrados: " + contadorImpares);
    }
    
    // *** Funciones Ejericicio 4 ***
    public static double sumar(double num1, double num2){
        return num1 + num2;
    }
    public static double restar(double num1, double num2){
        return num1 - num2;
    }
    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }
    public static double dividir(double num1, double num2){
        if(num2 == 0){
            System.out.println("No se puede dividir por 0");
        }
        return num1 / num2;
    }
    public static double resto(double num1, double num2){
        return num1 % num2;
    }
    
    
} // *** Cierre de la clase ***
