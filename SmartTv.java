public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 28;
    boolean wifiConectado= true;
    String apps = "Escolha seu canal";
    String app1 = "YOUTUBE";
    String app2 = "NETFLIX";
    String app3 = "AMAZON";
    String app4 = "SPOTIFY";
    double resolução = 1.5;
    

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;

    }

    public void diminuirVolume() {
        volume--;

    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;

    }

    public void aumentarCanal() {
        canal++;

    }

    public void diminuirCanal() {
        canal--;
    }

    public void escolherApp() {
        apps = app1;

    }

    public void aumentarResolução() {
        resolução++;
    }

    public void diminuirResolução() {
        resolução--;
    }

    public void conectarWifi(){

    }

}


