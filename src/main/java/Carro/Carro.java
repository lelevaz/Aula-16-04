/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carro;

/**
 *
 * @author 824118152
 */
public class Carro {
    int capacidade;
    double combustivel;
    
  Carro(int capacidade){
    if (capacidade >= 40) {
        this.capacidade = capacidade;
    }   else {
        this.capacidade = 40;
    } 
    combustivel = this.capacidade - 2;
}    
    public int getCapacidade(){
        return capacidade;
}
    public double getCombustivel(){
        return combustivel;
    }

    public void setCombustivel(double combustivel){
        if(combustivel <= capacidade){
            this.combustivel = combustivel;
        }
    } 
    public boolean tanqueCheio(){
        if (combustivel == capacidade){
            System.out.println("O tanque está cheio");
        }
        return combustivel == capacidade;
    }
}
    
        
        
