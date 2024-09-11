import java.util.Scanner;

public class CalculoDesconto {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);

        double valorProduto=0;
        int quantidadeCompra=0;

        double desconto=0;
         double valorTotal=0;

         System.out.println("Digite o valor do produto:");
         valorProduto=leitor.nextDouble();

         System.out.println("Digite a quantidade do produto:");
         quantidadeCompra=leitor.nextInt();

         leitor.close();

         if(quantidadeCompra>=100){
         desconto=0.5;

         }
         else if(quantidadeCompra>=50){
            desconto=0.4;
         }
        else if (quantidadeCompra>=20) {
          desconto=0.3;

        }
        else if(quantidadeCompra>=10){
            desconto=0.1;

        }
        else {
            desconto=0;
        }
        valorTotal=(quantidadeCompra*valorProduto *(1-desconto));

        System.out.println("Valor total da compra:"+ valorTotal);

         }

    }

