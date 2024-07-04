public class SmartTv{
    //estado inicial da tv
    boolean ligada=false; //a tv começa desligada
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }


    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);

    }


    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Agora está no canal: " + canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Agora está no canal: " + canal);
    }

}