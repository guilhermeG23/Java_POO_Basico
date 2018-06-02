package controle;
public class Controle {
    public static void main(String[] args) {
        ControleComponente c1 = new ControleComponente();
        
        c1.ligar();
        c1.maisVolume();
        c1.maisVolume();
        c1.play();
        c1.ligarMudo();
        c1.abrirMenu();
    }    
}
