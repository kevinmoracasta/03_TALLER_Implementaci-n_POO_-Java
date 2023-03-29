package FiguraGeometrica;



public class Rectangulo extends Figura {

    float base1 ,altura1,area;

    public Rectangulo(float base1, float altura1) {
        this.base1 = base1;
        this.altura1 = altura1;
    }

    public float getBase() {
        return base1;
    }

    public void setBase(float base) {
        this.base1 = base;
    }

    public float getAltura() {
        return altura1;
    

    }

public void calculArarea(){
}
public void calcularArea() {
 float area;
    area=base1*altura1;
        System.out.println("La altura es de"+altura1+" y la base es"+base1+" asi que su area es "+area);

}

}