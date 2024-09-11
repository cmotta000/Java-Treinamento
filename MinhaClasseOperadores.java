public class MinhaClasseOperadores {
    public static void main (String [] args) {

        String nomeCompleto= "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao="?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);


        concatenacao =1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao ="1" +1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
    
        
    
     //OPERADORES UNITÁRIOS-(++)
     int idade1=90;
     idade1++;
     System.out.println(idade1);
    //(--)
     int idade2=90;
     idade2--;
     System.out.println(idade2);
     //(-)
    int numero=8;
     numero= -9;
     System.out.println(numero);
     //(+)
     numero=+10;
     System.out.println(numero);

     int m=9;
     m=m+8;
     System.out.println(m);
     //(!)
     boolean variavel=false;
     System.out.println(!variavel);

     variavel=!variavel;
     System.out.println(variavel);

     //OPERADOR TERNÁRIO
     int a=5;
     int b=6;
     String resultado="";
  
     if(a==b)
     System.out.println("Veradeiro");
     else
     System.out.println("Falso");

    //OPERADORES RELACIONAIS
    int numero1=1;
    int numero2=2;
     boolean simNao= numero1==numero2;

     System.out.println("numeroUm é maior que numeroDois?"+simNao);

     if(numero1 < numero2)
     System.out.println("A nossa condição é verdadeira");

     String nome1="Luís";
     String nome2="Luís";
    
     System.out.println(nome1.equals(nome2));

     //OPERADORES LÓGICOS(&&-e ||-ou)
     Boolean cond1=true;
     Boolean cond2=true;

     if(cond1 && cond2 )
     System.out.println("as duas condições são verdadeiras");

     System.out.println("fim");
     if(cond1 || cond2);
     System.out.println("Uma das condições são verdadeiras");





     


}
}
