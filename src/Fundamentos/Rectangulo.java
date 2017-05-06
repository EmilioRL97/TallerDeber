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
public class Rectangulo {
    double ancho= 1;
    double altura= 1;

    public Rectangulo() {
    }
    
    public Rectangulo(double Rancho, double Raltura) {
        //La R es de rectangulo xD
        this.ancho= Rancho;
        this.altura = Raltura;
    }
    
    public void getArea(double base) {
    //Base por Altura
        double area_rectangulo;
        area_rectangulo = base * altura;
        System.out.println("El área del Rectangulo con base:" 
        + base + " y altura:" + altura + " es: " + area_rectangulo);   
    }
    public void getPerimetro (){
     //Para sacar el Perimetro de un rectángulo se debe multiplicar la suma del ancho y la altura x 2
       //Entonces:
       double perimetro;
       perimetro = 2 * (ancho + altura);
       
       System.out.println("El perimetro de este rectángulo es:" + perimetro);
    }
   
   public static void main (String[] args){
       Rectangulo rect = new Rectangulo();
       rect.getPerimetro();
       rect.getArea(10);
       /*rect.getArea(10, 20);
       rect.getPerimetro(30, 50);*/
   }
}
