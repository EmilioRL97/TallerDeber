/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fundamentos;

/**
 *
 * @author Emilio
 */
public class Triangulo {
    public double lado1 = 1.0;
    public double lado2 = 1.0;
    public double lado3 = 1.0;
    
    //Constructor por defecto
    public Triangulo (){
        
    }
    //Constructor con argumentos
     public Triangulo (double Tlado1, double Tlado2, double Tlado3){
         this.lado1 = Tlado1;
         this.lado2 = Tlado2;
         this.lado3 = Tlado3;
     }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
     
    public void getArea (){
        //Existe una manera de obtener el área sólo con los lados.
        //Utilizando la fórmula de Herón:
        //Área: Raiz de [p(p-a)(p-b)(p-c)]
        //En donde p = a la suma de los 3 lados del triángulo dividido para 2
        //Entonces tendríamos:
        double p;
        double q;
        double area;
        p = lado1 + lado2 + lado2;
        //No sé por qué aquí no me calculaba bien si le ponía directo: lado1+lado2+lado3 / 2 no me salía 1.5 xD
        //Entonces por esa razón primero sumé y luego dividí para 2 
        p = p/2;
        q = (p-lado1)*(p-lado2)*(p-lado3); 
        area = Math.sqrt(p*q);
        System.out.println ("El área de este triángulo es de:" +area);
    }
    public void getPerimetro (){
        //Este método retornará el Perimetro del Triángulo
        //El perimetro = a la suma de sus 3 lados 
        double perimetro = lado1 + lado2 + lado3;
        System.out.println("El perimetro de este triángulo es:" + perimetro);
    }
    
    public static void main (String [] args){
        Triangulo trg = new Triangulo(2,3,4);
        Triangulo tri = new Triangulo ();
        tri.getPerimetro();
        trg.getPerimetro();
        tri.getArea();
    }
}
