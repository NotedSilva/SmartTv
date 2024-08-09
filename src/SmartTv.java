public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void Ligar() {
        ligada = true;
    }

    public void Desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuendo o volume para: " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

}
