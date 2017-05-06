/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fundamentos;

import java.util.Date;

/**
 *
 * @author Emilio
 */
public class Cuenta {
    private int id;
    private double saldo;
    private double interesAnual;
    private Date fecha;
    
    public Cuenta() {        
    }
    
    public Cuenta (int idCuenta, double cuentaSaldo) {
        this.id = idCuenta;
        this.saldo = cuentaSaldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    

    public void getInteresMensual (){
    
    }
    
    public void Retiro(double saldo){
        this.saldo -= saldo; 
        System.out.println("Usted ha retirado " + saldo);
        System.out.println("Saldo Disponible: " +  this.saldo);
    }
    
    public void Depositar (double saldo) {
        //Este método se encargará de agregar un valor al saldo de la cuenta.
        this.saldo += saldo;
        
    }
    
    public static void main (String [] args){
        Cuenta cta1 = new Cuenta();
        cta1.Depositar(2.0);
        cta1.Depositar(3.0);
        cta1.Depositar(50.00);
        cta1.Retiro(5.00);
    }
}


