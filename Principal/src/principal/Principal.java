package principal;
public class Principal {
    public static void main(String[] args) {
        //Criando a chamada a outra classe do pacote
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
        
        //Setando estados ao objeto c1 com a classe Caneta
        c1.cor = "Vermelha";
        c1.carga = 90;
        c1.modelo = "Bic";
        c1.tampada = true;
        c1.ponta = 1.5f;
        
        //Criando um segundo objeto
        c2.cor = "azul";
        c2.carga = 0;
        c2.modelo = "Fabercastel";
        c2.tampada = false;
        c2.ponta = 0.5f;
        
        //Chamada de métodos
        c1.status();
        c2.status();
        
        c2.tampar();
        c2.status();
        
        c1.destampar();
        c1.status();
    }    
}
