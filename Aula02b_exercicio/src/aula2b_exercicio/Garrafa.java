package aula2b_exercicio;

public class Garrafa {
    String marca;
    String modelo;
    String cor;
    boolean tampada;
    int capacidade;
    float nivelDeAgua;
    
    void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        if(tampada){
            System.out.println("Tampa: Fechada");
        }
        else{
            System.out.println("Tampa: Aberta");
        }
        System.out.println("Capacidade: " + this.capacidade + " ml");
        System.out.println("Nível de Água: " + this.capacidade*this.nivelDeAgua + " ml");
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
    
    void encher(){
        if(this.nivelDeAgua < 1){
            this.nivelDeAgua = 1;
            System.out.println("A garrafa está cheia.");
        }
        else{
            System.out.println("A garrafa já está cheia.");
        }
    }
    
    void esvaziar(){
        if(this.nivelDeAgua > 0){
            this.nivelDeAgua = 0;
            System.out.println("A garrafa está vazia.");
        }
        else{
            System.out.println("A garrafa já está vazia.");
        }
    }
    
}
