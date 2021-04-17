package edu.upc.eetac.dsa.OO;

import edu.upc.eetac.dsa.OO.figuras.Figura;
import edu.upc.eetac.dsa.OO.figuras.circulo;
import edu.upc.eetac.dsa.OO.figuras.cuadrado;
import edu.upc.eetac.dsa.OO.figuras.rectangulo;
import java.util.Arrays;




public class gestorfiguritas {
    public static void sort (Figura[] vectorFiguras){}
    public static double suma ( Figura[] vectorFiguras){
        double ret=0;
        for (Figura figura:vectorFiguras){
            ret+= figura.area();
        }
        return ret;
    }

    public static void main(String[] args){
        Figura[] vector = new Figura[3];

        vector[0]=new rectangulo(5,5);
        vector[1]=new circulo(6);
        vector[2]=new cuadrado(4);

        double resultado=gestorfiguritas.suma(vector);
        System.out.println(resultado);
        System.out.println(Arrays.asList(vector));
        gestorfiguritas.sort(vector);
        System.out.println(Arrays.asList(vector));

    }
}
