/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenbitwarejuliovillegas;
import java.util.Scanner;
/**
 *
 * @author Villegas
 */
public class ExamenBitWareJulioVillegas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner Leer= new Scanner(System.in);
        Persona Julio= new Persona();
        
        //Pide por formulario el nombre, la edad, sexo, peso y altura.
        System.out.println("Dame el nombre");
        String nombre=Leer.next();
        System.out.println("Dame el sexo");
        char sexo=(Leer.next()).charAt(0);
        System.out.println("Dame el peso");
        int peso=Integer.parseInt(Leer.next());
        System.out.println("Dame la altura");
        int altura=Integer.parseInt(Leer.next());
        System.out.println("Dame la edad");
        int edad=Integer.parseInt(Leer.next());
        Julio.llenar(nombre, sexo,peso, altura, edad);
        
        //Deberá comprobar si está en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
        switch(Julio.calcularIMC()){
            case -1:
                System.out.println("Falta de peso");
                break;
            case 0:
                System.out.println("Peso normal");
                break;
            case 1:
                System.out.println("Sobrepeso");
                break;
        }
        
        //Indicar si es mayor de edad.
        if(Julio.esMayorDeEdad()){
            System.out.println("Es mayor de edad");
        }else{  
            System.out.println("Es menor de edad");
        }
        
        //Por último, mostrar toda la información ingresada.
        System.out.println(Julio.toString());
    }
    
}
