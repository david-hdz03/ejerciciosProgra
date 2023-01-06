/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author David
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(suma(2,5,8));
        Coche coche = new Coche();
        coche.aumentarPuertas();
        System.out.println(coche.puertas);
    }
    
    public static int suma(int num1,int num2,int num3){
        return num1 + num2 + num3;
    }
    
    public static class Coche{
        int puertas;
        
        public void aumentarPuertas(){
            this.puertas++;
            
        }
    }
}