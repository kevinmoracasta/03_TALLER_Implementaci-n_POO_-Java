package Salud;

import javax.xml.validation.Validator;

public class Empleado extends Persona{
    private float cargo;
    private float valorhora;
    private float horastrabajadas;
    private float departamento;

    
    public Empleado(String tipoDoc, int documento, String nombre, String apellido, int peso, int estatura, int edad, String sexo,float cargo,float valorhora,float horastrabajadas,float departamento){
        super(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo);
        this.cargo=cargo;
        this.valorhora=valorhora;
        this.horastrabajadas=horastrabajadas;
        this.departamento=departamento;
    }
    public Empleado(String tipoDoc, int documento, String nombre, String apellido, int peso, int estatura, int edad,
            String sexo, String cargo2, int valorhora2, int horastrabajadas2, String departamento2) {
    }
    public void mostarEmpleado() {
        System.out.println("TIPO DE DOCUMENTO: "+getTipoDoc()+"\nDOCUMENTO: "+getDocumento()+"\nNOMBRE: "+getNombre()+"\nAPELLIDO: "+getApellido()+"\nPESO: "+getPeso()+"\nESTATURA: "+getEstatura()+"\nEDAD: "+getEdad()+"\nSEXO: "+getSexo()+"\n CARGO: "+cargo+"\nVALOR DE LA HORA: "+valorhora+"\nHORAS DE TRABAJO"+horastrabajadas+"DEPARTAMENTO"+departamento);
        
        

    }
    public float getCargo() {
        return cargo;
    }
    public void setCargo(float cargo) {
        this.cargo = cargo;
    }
    public float getValorhora() {
        return valorhora;
    }
    public void setValorhora(float valorhora) {
        this.valorhora = valorhora;
    }
    public float getHorastrabajadas() {
        return horastrabajadas;
    }
    public void setHorastrabajadas(float horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }
    public float getDepartamento() {
        return departamento;
    }
    public void setDepartamento(float departamento) {
        this.departamento = departamento;

        
    }
}
