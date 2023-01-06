/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class TestTema9 {
    public static void main(String [] args){
       
        Cliente cliente = new Cliente();
        cliente.setNombre("David");
        cliente.setEdad(23);
        cliente.setTelefono("5655447733");
        cliente.setCredito(12500);
        System.out.println("Cliente: " + cliente.getNombre() + "\nEdad: " + cliente.getEdad() + "\nTelefono: " + cliente.getTelefono()
                            + "\nCredito: " + cliente.getCredito());
        
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Pablo");
        trabajador.setEdad(25);
        trabajador.setTelefono("5577223344");
        trabajador.setSalario(15600);
        System.out.println("\nTrabajador: " + trabajador.getNombre() + "\nEdad: " + trabajador.getEdad() + "\nTelefono: " + trabajador.getTelefono() 
                            + "\nSalario: " + trabajador.getSalario());
        
    }   
}

class Persona{
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
    
    class Cliente extends Persona{
            private double credito;
            
            public void setCredito(double credito){
                this.credito = credito;
            }
            
            public double getCredito(){
                return credito;
            }
        }
        
    class Trabajador extends Persona{
            private double salario;

            public double getSalario() {
                return salario;
            }

            public void setSalario(double salario) {
                this.salario = salario;
            }
            
            
        }
