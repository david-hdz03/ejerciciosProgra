/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class TestTema8 {
    public static void main(String [] args){
       Persona persona = new Persona();
       persona.setNombre("David");
       persona.setEdad(23);
       persona.setTelefono("5677445566");
       
        System.out.println("Nombre: " + persona.getNombre() + "\nEdad: " + persona.getEdad() + "\nTelefono: " +persona.getTelefono());
       
        
    }
    
    public static class Persona{
        private String nombre;
        private int edad;
        private String telefono;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
        
        
    }
}
