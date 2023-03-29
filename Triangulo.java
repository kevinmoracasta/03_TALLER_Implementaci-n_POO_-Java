package FiguraGeometrica;

public class Triangulo extends Figura{
    //atributos
float base,altura,area,total;
//abstracto
public Triangulo(float base, float altura, float total) {
    this.base = base;
    this.altura = altura;
    this.total = total;
    //metodosaccesores
}

public float getBase() {
    return base;
}

public void setBase(float base) {
    this.base = base;
}

public float getAltura() {
    return altura;
}

public void setAltura(float altura) {
    this.altura = altura;
}

public float getTotal() {
    return total;
}

public void setTotal(float total) {
    this.total = total;
}
//metodo propio de la subclase 
public void calculArarea(){
    

}


public void calcularArea() {
float area;
area=base*altura;
total=area/2;
        System.out.println("La altura es de"+altura+" y la base es"+base+" asi que su area es "+total);
}
}
