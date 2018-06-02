package controle;
public class ControleComponente implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleComponente() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    //Volume
    public int setVolume(int v) {
        this.volume = v;
        return 0;
    }
    public int getVolume() {
        return this.volume;
    }
    //Ligado
    public boolean setLigado(boolean v) {
        this.ligado = v;
        return false;
    }
    public boolean getLigado() {
        return this.ligado;
    }
    
    //Tocando
    public boolean setTocando(boolean v) {
        this.tocando = v;
        return false;
    }
    public boolean getTocando() {
        return this.tocando;
    }
    
    //Metodos abstratos

    //@override = Escrever por cima do que já existe
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i+= 10) {
            System.out.print("|");
        } 
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando o menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() == true) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("TV desligada!");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() == true) {
            this.setVolume(this.getVolume() -5);
        } else {
            System.out.println("TV desligada!");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() == true && this.getVolume() >= 1) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() == true && this.getVolume() == 0) {
            this.setVolume(50); 
        }
    }

    @Override
    public void play() {
        if(this.getLigado() == true && this.getTocando() == false) {
            this.setTocando(    true);
        } 
    }

    @Override
    public void pause() {
        if(this.getLigado() == true){
            if(this.getTocando() == true) {
                this.setTocando(false);
            } else {
                System.out.println("TV não esta tocando!");
            } 
        } else {
            System.out.println("TV desligada!");
        }
    }
}
    
