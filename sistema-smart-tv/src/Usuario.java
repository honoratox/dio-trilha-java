public class Usuario {
    public static void main(String[]args) throws Exception{

        SmartTv smartTv = new SmartTv(); //cria uma nova SmartTv, pra ilustrar a interação entre métodos e atributos

        smartTv.diminuirVolume(); // sei que por padrão o volume começa em 25, então já alterei antes de apresentar o 'volume atual'
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        System.out.println ("Canal Atual: " + smartTv.canal); //verifica o canal quando liga
        smartTv.mudarCanal(13);// busca o método de mudar canal e fala qual o novo
        System.out.println ("Canal Atual: " + smartTv.canal); // fala qual o novo canal

        System.out.println ("Volume Atual: " + smartTv.volume); //informa o volume após todas as trocas


        System.out.println ("TV Ligada? " + smartTv.ligada);

        smartTv.ligar();// chamo o método 'ligar' pra ser usado na minha smartTv
        System.out.println ("Novo Status -> TV Ligada? " + smartTv.ligada);
    
        smartTv.desligar();
        System.out.println ("Novo Status -> TV Ligada? " + smartTv.ligada);
    
    }
}