package aula04b;

public class Aula04b {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", 0.7f);
        //c1.setModelo("BIC");
        //c1.setPonta(0.5f);
        c1.status();
        
        System.out.println("Tenho uma caneta do modelo " + c1.getModelo() + " e ponta de tamanho " + c1.getPonta() + ".");
    }
    
}
