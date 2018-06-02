package exemplopraticoguanabara;
public class Banco {
    private int numConta = 0;
    private String tipo = "";
    private String dono = "";
    private float saldo = 0f;
    private boolean status = false; 
    
    //Sacar
    private float sacar = 0f;
    
    public void status() {
        System.out.println("-------------------------------------");
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
        System.out.println("-------------------------------------");
        System.out.println("\n");
    }
    
    public void Error() {
        this.setNumConta(0);
        this.setTipo("Error!");
        this.setDono("Error!");
        this.setSaldo(0);
        this.setStatus(false);
        System.out.println("\n");
    }
    
    public String CriandoConta(String v) {
        this.setTipo(v);
        this.getConta();
        this.setStatus(true);
        String ContaTipo;
        ContaTipo = this.getTipo();
        if(null == ContaTipo) {
            Error();
        } else switch (ContaTipo) {
            case "cp":
                this.setSaldo(50);
                break;
            case "cc":
                this.setSaldo(150);
                break;
            default:
                Error();
                break;
        }
        return null;
    }
    
    public boolean FecharConta() {
        if(this.getSaldo() == 0) {
            this.setStatus(false);
            System.out.println("Conta finalizada");
        } else {
            System.out.println("Conta ainda possui dinheiro\nImpossivel de fecher\nRetire o dinheiro\nTem: " + this.getSaldo());
        }
        return false;
    }
    
    public float SacarConta(float v) {
        this.setSacar(v);
        if(this.getSaldo() >= this.getSacar()) {
            this.setSaldo(this.getSaldo() - this.getSacar());
        } else {
            System.out.println("Sacando mais que a sua conta!impossivel");
        }
        return 0;
    }
    
    public float Deposito(float v) {
        this.setDeposito(v);
        if(this.getStatus() == false) {
            System.out.println("A conta não existe");
        } else {
            this.setSaldo(this.getSaldo() + this.getDeposito());
        }
        return 0;
    }
    
    public int setConta(int v) { 
        this.numConta = v;
        return 0;
    }
    
    public int getConta() {
        return this.numConta;
    }
    
    private float deposito = 0f;
    
    public float setDeposito(float v) {
        this.deposito = v;
        return 0;
    }
    
    public float getDeposito() {
        return this.deposito;
    }
    
    public float setSacar(float saca) {
        this.sacar = saca;
        return 0;
    }
    
    public float getSacar() {
        return this.sacar;
    }
       
    public float setSaldo(float v) {
        this.saldo = v;
        return 0;
    }
    
    public float getSaldo() {
        return this.saldo;
    }
    
    public String setTipo(String v) {
        this.tipo = v;
        return null;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public boolean setStatus(boolean c) {
        this.status = c;
        return false;
    }
    
    public boolean getStatus() {
        return this.status;
    }
    
    public int setNumConta(int v) {
        this.numConta = v;
        return 0;
    }
    
    public int getNumConta() {
        return this.numConta;
    }
    
    public String setDono(String v) {
        this.dono = v;
        return null;
    }
    
    public String getDono() {
        return this.dono;
    }
}