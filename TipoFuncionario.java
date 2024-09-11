import java.util.Scanner;
public class TipoFuncionario {
    public static void main(String[]args){
        Scanner leitor=new Scanner(System.in);
       
        double salarioInicial=0;
        int typefuncionario=0;
        double salarioFinal=0;

        System.out.println("Digiete seu salario");
        salarioInicial=leitor.nextDouble();

        System.out.println("Digite o tipo de funcionário");
        typefuncionario=leitor.nextInt();


        if(typefuncionario==2){
            salarioFinal= (salarioInicial*120/100);

        }

        else if (typefuncionario==1){
            salarioFinal=(salarioInicial*110/100);
        
        }
        else {
            salarioFinal=(salarioInicial*150/100);
    
        }
        System.out.println("Salário atual: R$"+salarioFinal);
}
}

