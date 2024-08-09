public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(8);
        System.out.println("Canal atual: " + smartTv.canal);


        smartTv.Ligar();
        System.out.println("A TV está ligada? " + smartTv.ligada);

        smartTv.Desligar();
        System.out.println("A TV está ligada? " + smartTv.ligada);

    }
}
