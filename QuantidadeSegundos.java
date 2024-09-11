
import java.util.Scanner;
public class QuantidadeSegundos { 
    public static void main(String[]args) 
{ 
    //DECLARAÇÃO DE VARIÁVEIS
    Scanner leitor= new Scanner(System.in); 
    int horas=0; int minutos=0; 
    int segundos=0; 
    int quantidadetotalsegundos=0; 
    //ENTRADA DE DADOS 
    System.out.println("Digite a quantidade de horas:"); 
    horas=leitor.nextInt(); 
    System.out.println("Digite a quantidade de minutos:");
    minutos=leitor.nextInt(); 
    System.out.println("Digite a quantidade de segundos:"); 
    segundos=leitor.nextInt(); 
    leitor.close(); 
    //PROCESSAMENTO 
    quantidadetotalsegundos = ((horas*3600)+ (minutos*60)+ (segundos*1)); 
    //SAÍDA DE DADOS
    System.out.println("A quantidade total de segundos é:"+ quantidadetotalsegundos); 
    

}
}
    