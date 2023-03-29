package FiguraGeometrica;

import java.util.Random;
import java.util.Scanner;

public class Piedrapapeltijera implements Juego{

Scanner lec=new Scanner(System.in);

private String nombre;
private int selecionar;
private int mano;

    public void iniciar() {
        System.out.print("Digite su nombre:\n");
        nombre = lec.next();

    }
   
    public void jugar() {
        System.out.print("Selecione: \n 1_piedra\n 2_papel\n 3_tijera\n");
        selecionar= lec.nextInt();
        Random aleatorio=new Random();
        mano=aleatorio.nextInt(3)+1;
        System.out.println("La maquina sacado"+mano);

    }
    
    public void finalizar() {
        if (selecionar==mano) {
            System.out.println("Es empate");    
        }
        
        else if (selecionar==1 && mano==3) {
            System.out.println("La maquina escogio tijera y tu escogiste piedra asi que gana "+nombre);
        }
        
        else if (selecionar==2 && mano==1) {
            System.out.println("La maquina escogio piedra y tu escogiste papel asi que gana "+nombre);
        }
        else if (selecionar==3 && mano==2) {
            System.out.println("La maquina escogio papel y tu escogiste tijera asi que gana "+nombre);
        }
        
        else{
            System.out.println("Perdiste");
        }
        
    }


    
}
