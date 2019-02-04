package aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDonoConta("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(300);
        p1.infoConta();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDonoConta("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.infoConta();
    }
    
}
