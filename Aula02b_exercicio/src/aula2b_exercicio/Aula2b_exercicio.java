package aula2b_exercicio;

public class Aula2b_exercicio {

    public static void main(String[] args) {
        Garrafa garrafaDeVictor = new Garrafa();
        garrafaDeVictor.capacidade = 500;
        garrafaDeVictor.cor = "Azul";
        garrafaDeVictor.marca = "Tupperware";
        garrafaDeVictor.modelo = "Esportivo";
        garrafaDeVictor.nivelDeAgua = 0.2f;
        garrafaDeVictor.tampada = true;
        
        garrafaDeVictor.status();
        System.out.println();
        garrafaDeVictor.destampar();
        garrafaDeVictor.encher();
        garrafaDeVictor.status();
                
    }
    
}
