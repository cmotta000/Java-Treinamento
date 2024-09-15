public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual "+smartTv.volume);
    
        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? "+ smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada? "+ smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo  volume -> " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("System.out.priNovo volume -> "+ smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo volume -> "+ smartTv.volume);

         System.out.println("Canal atual:" + smartTv.canal);
          smartTv.mudarCanal(12);
          System.out.println("Canal atual"+ smartTv.canal);
         
          smartTv.aumentarCanal();
         System.out.println("Novo canal---> "+ smartTv.canal);
         smartTv.aumentarCanal();
         System.out.println("Novo canal---> "+ smartTv.canal);
         
    smartTv.escolherApp();
    System.out.println("App->"+ smartTv.app1);
    smartTv.aumentarResolução();
    System.out.println("RESOLUÇÃO ATUAL-->" + smartTv.resolução);  
}
    
    

}


    



}
}
