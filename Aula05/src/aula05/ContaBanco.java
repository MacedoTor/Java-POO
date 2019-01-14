package aula05;

public class ContaBanco {
    private int contadorPoupanca = 1;
    private int contadorCorrente = 1;
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private float saldo;
    private boolean statusConta;
    
    //Contrutor da Classe: Sempre que uma conta for criada ela deve estar fechada (statusConta = false) e o saldo deve ser zero (0)
    public ContaBanco(){
        this.statusConta = false;
        this.saldo = 0;
        //this.contadorCorrente = 1;
        //this.contadorPoupanca = 1;
    }
    
    public void infoConta(){
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
    
    public void abrirConta(String tipoConta, String nomeDonoConta){
        if(this.statusConta == false){
            setStatusConta(true);
            setTipoConta(tipoConta);
            setDonoConta(nomeDonoConta);
            if("cc".equals(this.tipoConta)){
                this.numConta = getContadorCorrente();
                attContadorCorrente();
                setSaldo(50f);
                System.out.println("Conta corrente aberta com sucesso!");
            }
            else if("cp".equals(this.tipoConta)){
                this.numConta = getContadorPoupanca();
                contadorPoupanca++; //attContadorPoupanca();
                setSaldo(150f);
                System.out.println("Conta poupança aberta com sucesso!");
            }
        }
        else{
            System.out.println("Conta já existe.");
        }
    }
    
    public void fecharConta(){
        this.statusConta = false;
    }
    
    public void depositar(float valor){
        if(this.statusConta){
            this.saldo = getSaldo() + valor;
            System.out.println("Depósito efetuado com sucesso!");
        }
        else{
            System.out.println("Conta fechada. Por favor, abra a conta primeiro.");
        }
    }
    
    public int getContadorPoupanca(){
        return contadorPoupanca;
    }
    
    public void attContadorPoupanca(){
        this.contadorPoupanca++;
    }
    
    public int getContadorCorrente(){
        return contadorCorrente;
    }
    
    public void attContadorCorrente(){
        this.contadorCorrente = getContadorCorrente() + 1;
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
