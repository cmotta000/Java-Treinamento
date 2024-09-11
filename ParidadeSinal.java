import java.util.Scanner;
public class ParidadeSinal {
    public static void main(String[]args){

        Scanner leitor= new Scanner(System.in);

        int numero=0;
        String sinal="";
        String paridade="";

        System.out.println("Digite um número");
        numero=leitor.nextInt();
        leitor.close();

        if ((numero %2 )==0){
         paridade= "PAR";

    }
    else{
        paridade= "IMPAR";
    }

    if (numero>0) {
        System.out.println("Positivo");

        
    }
    else if (numero<0){
        System.out.println("NEGATIVO");
    }
     else {
        sinal="ZERO";
     }   
       
     System.out.println("PARIDADE DO NÚMERO:"+ paridade);

     System.out.println("Sinal do número:" + sinal);





    }
    
}
