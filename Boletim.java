import java.util.Scanner;
public class Boletim {
    public static void main(String[]args){
        int nota=0;
        int nota2=0;
        int mediaFinal=0;
        
        Scanner leitor=new Scanner(System.in);

        System.out.println("Digite a sua nota:");
        nota=leitor.nextInt();

        System.out.println("Digite a nota 2:");
        nota2=leitor.nextInt();
        
       mediaFinal=((nota+nota2)/2);
      if(mediaFinal<6){
       System.out.println("Você foi reprovado");
      }
       else if( mediaFinal ==6){
       System.out.println("Prova de Segunda chamada");
    }
        else{
        System.out.println("Aprovado");
    }




    }


    
}
