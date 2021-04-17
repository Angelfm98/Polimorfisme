package edu.upc.eetac.dsa.OO.figuras;

public class rectangulo extends Figura{

    private double c1;
    private double c2;

    public rectangulo(double c1, double c2){
        this.c1=c1;
        this.c2=c2;

    }

    public double area(){return this.c1 * this.c2; }

    @Override
    public String toString(){return "rectangulo c1:" + this.c1 + "c2:" + this.c2 + "area: (("+this.area()+"))";}

}
