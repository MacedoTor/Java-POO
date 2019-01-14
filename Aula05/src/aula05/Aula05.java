package aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();
        //conta.infoConta();
        conta.abrirConta("cp", "João Victor Macedo Braga");
        //System.out.println("");
        conta.infoConta();
        
        ContaBanco c1 = new ContaBanco();
        c1.abrirConta("cp", "oi");
        c1.infoConta();
    }
    
}
