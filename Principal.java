package FiguraGeometrica;

import java.util.Scanner;



public class Principal {
    
    public static void main(String[] args) {
      float base1,base,altura,altura1,RADIO, pi=0;
        Scanner lec=new Scanner(System.in);

        System.out.println("Digite para sabe rel area de: \n1.rectangulo \n2.triangulo \n3.circulo");
        int selesccion=lec.nextInt();


        
        if (selesccion==1) {

            System.out.println("Digite base del rectangulo");
        base1=lec.nextInt();
System.out.println("Digite altura del rectangulo");
        altura1=lec.nextInt();
        Rectangulo R1=new Rectangulo(base1, altura1);
        R1.calculArarea();

        }
        else if (selesccion==2) {
            System.out.println("Digite altura del triangulo");
        altura=lec.nextInt();
        System.out.println("Digite base del triangulo");
        base=lec.nextInt(); 
               Triangulo T1=new Triangulo(base, altura, selesccion);
        T1.calculArarea();

        }
       
        else if (selesccion==3) {
             System.out.println("Digite radio del circulo");
        RADIO=lec.nextInt();
        System.out.println("Digite pi del circulo");
        pi=lec.nextInt();
                Circulo C2=new Circulo(pi, RADIO);
        C2.calculArarea();

        }

        lec.close();
        
    }
}
