package Programas;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
    int num;
    String Periodo="";
    Scanner lectura=new Scanner(System.in);
    //Entrada de dato
    System.out.print("Ingresar un numero de (1,2,3,4,6,12) : ");
    num=lectura.nextInt();
    // proceso de datos
    switch (num){
        case 1: Periodo= "Mensual";break;
        case 2: Periodo= "Bimestral";break;
        case 3: Periodo= "Bimestral";break;
        case 4: Periodo= "Cuatrimestral";break;
        case 6: Periodo= "Semestral";break;
        case 12: Periodo= "Anual";break;
              }
    //salida de datos
       System.out.println("El nombre del periodo es: "+ Periodo);
}    
}