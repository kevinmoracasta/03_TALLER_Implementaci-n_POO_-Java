package FiguraGeometrica;

public class Circulo extends Figura {

private double pi;
private double RADIO;


public Circulo(double pi, double rADIO) {
    this.pi = pi;
    RADIO = rADIO;
}


public double getPi() {
    return pi;
}


public void setPi(double pi) {
    this.pi = pi;
}


public double getRADIO() {
    return RADIO;
}


public void setRADIO(double rADIO) {
    RADIO = rADIO;
}

public void calcularArea() {
    double area;
    area=pi*(RADIO*2);

    System.out.print("El radio es de "+RADIO+" asi que su area es "+area);
}



public void calculArarea() {
    
    
}
}