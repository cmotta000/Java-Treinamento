

import java.util.Scanner;

public class calculoImc {
public static void main(String[]args){
//DECLARAÇÃO DE VARIÁVEIS
 Scanner leitor= new Scanner(System.in);
 
 double peso=0;
 double altura=0;
 double imc=0;

 //ENTRADA DE DADOS
System.out.println("Digite seu peso:");
peso= leitor.nextDouble();

System.out.println("Digite sua altura");
altura=leitor.nextDouble();

leitor.close();

// PROCESSAMENTO

imc= (peso/Math.pow(altura/2));

//SAÍDA DE DADOS

System.out.println("Seu imc é:"+ imc);

 
}
}

