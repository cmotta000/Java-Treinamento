import java.util.Scanner;
public class SomaMenores {
    public static void main(String[]args){
      Scanner leitor=new Scanner(System.in);
        int num1=0;
        int num2=0;
        int num3=0;
        int somadosdois=0;

        System.out.println("Digite o num1");
        num1=leitor.nextInt();

        System.out.println("Digite o num2");
        num2=leitor.nextInt();

        System.out.println("Digite o num3");
        num3=leitor.nextInt();

        if((num1>num2) && (num1>num3)){
            somadosdois= (num2+num3);
        
        }
        else if ((num2>num1) && (num2>num3)) {
            somadosdois= (num1+num2);

            
        }
        
        else {
            somadosdois=(num1+num2);
        }
        
      System.out.println("Soma dos menores é "+somadosdois);

        
    }
}
