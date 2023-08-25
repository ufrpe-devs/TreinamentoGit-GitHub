/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author notedj
 */
public class Calculadora {
    private double resultado;

    public Calculadora() {
        this.resultado = resultado;
        resultado =0;
    }
    
    public double somarDoisNumeros(double a ,double b){
        resultado = a+b;
    return resultado;
}
    public double subtrairDoisNumeros(double a, double b){
        
        resultado = a-b;
        
        return resultado;
                
    }
    
    public boolean ePar(int a){
        return a % 2 == 0;
    }
    
    public boolean eImpar(int a){
        return a % 2 !=0 ;
    }



    
    
}