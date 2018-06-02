package principal;
public class Caneta {
    //Variaveis
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    int contador = 0;
    
    //Métodos
    void status() {
        System.out.println("Cor caneta: " + this.cor);
        System.out.println("Carga caneta: " + this.carga);
        System.out.println("Modelo caneta: " + this.modelo);
        System.out.println("Ponta caneta: " + this.ponta);
        System.out.println("Tampada? caneta: " + this.tampada);
        System.out.print("\n");
    }
    
    void rabiscar() {
        if(this.tampada == true) {
            System.out.println("Não é possivel\nA caneta está tampada");
        } else {
            System.out.println("Rabiscando");
        }
    }
    
    void tampar() {
        if(this.tampada == true) {
            System.out.println("Já está tampada");
        } else {
            System.out.println("Tampando");
            this.tampada = true;
        }
    }
    
    void destampar() {
        if(this.tampada == false) {
            System.out.println("Já está destampada");
        } else {
            System.out.println("destampando");
            this.tampada = false;
        }
    }
}
