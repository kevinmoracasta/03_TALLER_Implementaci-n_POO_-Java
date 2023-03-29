package Salud;

import java.util.Scanner;

public class Persona {
    

    //ATRIBUTOS privados
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private int peso;
    private int estatura;
    private int edad;
    private String sexo;

//sobrecaega es cuando tiene el mismo nombre  misma cantidad de parametros y un  tipo de dato diferente tambien cuando tiene diferente cantidad de parametros

        //metodo constructor siempre publico y no tiene valor retorno y se llama igual que la clase
//metodo constructor vacio:
//public persona(){
//}
//metodo constructor con parametros

 public Persona() {
    }

public Persona(String tipoDoc2) {
}

public Persona(String tipoDoc2, int documento2, String nombre2, String apellido2, int peso2, int estatura2, int edad2,
        String sexo2) {
}

public void pedirDatos(String tipoDoc, int documento, String nombre, String apellido, int peso, int estatura, int edad, String sexo) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
            }

    //METODOS publicos

                //set asignar o registrar datos
    //get para consultar


    
    public void pedirDatos(){

        Scanner lec=new Scanner(System.in);

        System.out.println("Digite su tipo de documento: ");
        tipoDoc =lec.next();
        System.out.println("Digite su documento: ");
        documento =lec.nextInt();
        System.out.println("Digite su nombre: ");
        nombre =lec.next();
        System.out.println("Digite su apellido: ");
        apellido =lec.next();
        System.out.println("Digite su peso: ");
        peso =lec.nextInt();
        System.out.println("Digite su edad: ");
        edad =lec.nextInt();
        System.out.println("Digite su sexo: ");
        sexo =lec.next();
        
        
       //reto_3 principios de encapsulamiento
    }
        
    
        public String getTipoDoc() {
        return tipoDoc;
    }


    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }


    public int getDocumento() {
        return documento;
    }


    public void setDocumento(int documento) {
        this.documento = documento;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int getPeso() {
        return peso;
    }


    public void setPeso(int peso) {
        this.peso = peso;
    }


    public int getEstatura() {
        return estatura;
    }


    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


        public void mostrarPersona(){

            System.out.println("Los datos registrados son: ");
            System.out.println("TIPO DE DOCUMENTO: "+tipoDoc+"\nDOCUMENTO: "+documento+"\nNOMBRE: "+nombre+"\nAPELLIDO: "+apellido+"\nPESO: "+peso+"\nESTATURA: "+estatura+"\nEDAD: "+edad+"\nSEXO: "+sexo);
        
        

    }
  
    public void mayorEdad(){
        if (edad>60) {

            System.out.println("Y usted es mayor de edad");

        }else 
        System.out.println("Y usted no es mayor de edad");
    }
    public void pedirDatos(String nombre, String apellido){
        System.out.println("El nombre ingresado y el apellido son"+nombre + apellido);
    }
      //parte reto 2
        //metodo con parametros
        //modificador de acceso + valor de retorno +nombre metodo+ parametros
  public int calcularImc(int estatura){
    int post=0,total;
    post =(estatura*2);
    total=post/peso;
    System.out.println("El peso del animal es"+total);


        if (total<20) {
            System.out.println("Su peso es menor o igual a 20, significa que su peso está por debajo de lo ideal");
        }
            else if (total>=20 && total<=25) {
                 System.out.println("Su peso esta entre 20 y 25,significa que su peso es el peso es ideal");
            }
           else if (total>25) {
            System.out.println("Su peso es mayor a 25 significa que tiene sobrepes");
           }
            else {
            System.out.println("se calculo mal el peso");
            
        }
            return total;  
  
           }
           
           
        }
    
    
    
        

