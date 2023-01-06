/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class TestTema4 {
    public static void main(String [] args){
        //If
        int numeroIf = -5;
        if (numeroIf > 0){
            System.out.println("El numero es mayor a 0");
        } else if (numeroIf == 0){
            System.out.println("El numero es igual a 0");
        } else {
            System.out.println("El numero es menor a 0");
        }
        
        //While
        int numeroWhile = -5;
        
        while (numeroWhile < 3){
            System.out.println("El valor del numero es: " +numeroWhile);
            numeroWhile++;
        }
        
        numeroWhile =1;
        do {
            System.out.println("el valor del numero es: " + numeroWhile);
        } while(numeroWhile != 1);
        
        //For
        int numeroFor = 0;
        for (numeroFor = 0;numeroFor <=3;numeroFor++){
            System.out.println("El numeroFor es: " + numeroFor);
        }
        
        String estacion = "Verano";
        
        switch (estacion) {
            case "Verano":
                System.out.println("La estacion es verano");
                break;
            case "Invierno":
                System.out.println("La estacion es invierno");
            case "Otoño":
                System.out.println("La estacion es otono");
            case "Primavera":
                System.out.println("La estacion es primavera");
            default:
                System.out.println("El valor no corresponde a ninguna estacion");
        }
        
    }
}
