package aula05;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private float saldo;
    private boolean statusConta;
    
    
    
    public void infoConta(){
        System.out.println("------------------------------");
        System.out.println("Número da Conta: " + getNumConta());
        System.out.println("Tipo de Conta: " + getTipoConta());
        System.out.println("Dono da Conta: " + getDonoConta());
        System.out.println("Saldo da Conta: " + getSaldo());
        if(isStatusConta()){
            System.out.println("Conta aberta.");
        }
        else{
            System.out.println("Conta fechada.");
        }
    }
    
    //Métodos Específicos
    public void abrirConta(String t){
        this.setTipoConta(t);
        this.setStatusConta(true);
        if(t.equals("CC")){
            this.setSaldo(50);
        }
        else if(t.equals("CP")){
            this.setSaldo(150);
        }
    }
    
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        }
        else if(this.getSaldo() < 0){
            System.out.println("Conta em débito");
        }
        else{
            this.setStatusConta(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float valor){
        if(this.isStatusConta() == true){
            this.setSaldo(this.getSaldo() + valor);
            //System.out.println("Depósito efetuado com sucesso!");
        }
        else{
            System.out.println("Impossível depositar. Conta fechada.");
        }
    }
    
    public void sacar(float valor){
        if(this.isStatusConta() == true){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
            }
            else{
                System.out.println("Saldo Insuficiente.");
            }
        }
        else{
            System.out.println("Impossível Operar.");
        }
    }
    
    public void pagarMensalidade(){
        float valor = 0; //Valor que será cobrado a mensalidade pelo tipo de conta
        String tipo = this.getTipoConta();
        if(tipo.equals("CC")){
            valor = 12;
        }
        else if(tipo.equals("CP")){
            valor = 20;
        } 
        this.sacar(valor);
    }
    
    //Metódos Especiais
    //Contrutor da Classe: Sempre que uma conta for criada ela deve estar fechada (statusConta = false) e o saldo deve ser zero (0)
    public ContaBanco(){
        this.statusConta = false;
        this.saldo = 0;
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
    
    
}
