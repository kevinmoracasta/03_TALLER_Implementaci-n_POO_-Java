package Principal;

import java.util.Scanner;

import Salud.Empleado;
import Salud.Persona;

public class INICIO {
    public static void main(String[] args) {
        String nombre,apellido;
        int estatura;
        //reto3
        int post=0;
        double tot=0,RETEICA=0.966;
       
        Scanner lec=new Scanner(System.in);
        Persona nomper =new Persona();   

        System.out.println("Digite el cargo");    
        String cargo =lec.next();

        System.out.println("Digite el valor por hora");  
        int valorhora =lec.nextInt();

        System.out.println("Digite horas trabajadas");    
        int horastrabajadas =lec.nextInt();

        System.out.println("Digite departamento");    
        String departamento =lec.next();

        post=horastrabajadas*valorhora;
        tot=post-RETEICA;


       /*  
        //nombre clase+nombre objeto=palabra reservada+metodo constructor

       // nomper.pedirDatos();
       System.out.println("Digite nombre");
        nombre=lec.next();
        System.out.println("Digite apellido"); 
         apellido=lec.next();
       nomper.setNombre(nombre);
       nomper.setApellido(apellido);
       
      
         //nomper.pedirDatos( nombre, apellido );
        nomper.mostrarPersona();
        nomper.mayorEdad();  
        //parte reto 2             
        System.out.print("digite su estatura: \n");

        
        estatura=lec.nextInt();
        nomper.calcularImc(estatura);
        */

        //reto3
        nomper.pedirDatos();
        Empleado emple=new Empleado(nomper.getTipoDoc(),nomper.getDocumento(),nomper.getNombre(),nomper.getApellido(),nomper.getPeso(),nomper.getEstatura(),nomper.getEdad(),nomper.getSexo(),cargo,valorhora,horastrabajadas,departamento);
        emple.pedirDatos();
        System.out.println("y se le debe pagar "+tot);
        lec.close();
    } 
}


//declarar instanciar y solicitar