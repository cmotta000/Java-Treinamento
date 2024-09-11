import java.util.Scanner;
public class Poligono{
    public static void main(String[]args){
        Scanner leitor= new Scanner(System.in);
        int quantidadeLados=0;
        double tamanhoLado=0;
        double perimetro=0;
        double area=0;

        System.out.println("Informe a quantidade de lados:");
         quantidadeLados= leitor.nextInt();


        System.out.println("Informe o tamanho do lado");
        tamanhoLado=leitor.nextDouble();

        leitor.close();


        perimetro=(quantidadeLados*tamanhoLado);
        switch (quantidadeLados) {
            case 3:
            area=((Math.pow(tamanhoLado, 2)*Math.sqrt(3))/4);
                
          break;
           case 4:
           area=(Math.pow(tamanhoLado, 2));
           break;
           case 5:
           area=(5*Math.pow(tamanhoLado, 2))/(4*Math.tan(36));
           break;
           case 6:
           area=(3*Math.pow(tamanhoLado, 2)*Math.sqrt(3)/2);
           break;
           case 7:
           area=(7/4)*Math.pow(tamanhoLado, 2) *(1/Math.tan(51.4285714));
            default:
                break;
        }
      
        System.out.println("Perimetro do polígono:"+ perimetro);

        System.out.println("Área total do polígono:"+area);


    }

}
