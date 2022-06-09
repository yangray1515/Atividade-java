import java.util.Scanner;

public class Atividade {
    public static void main(String[] args){
      
            int nota1, nota2 ;
            Scanner valor = new Scanner (System.in);
            System.out.println("Numero: ");
            nota1 = valor.nextInt();
    
            System.out.println("Numero inteiro: ");
            nota2 = valor.nextInt();

            
            int media = (nota1+nota2);

            System.out.println("Sua nota foi de " + media);
            
            System.out.println
            ("========================================");

            System.out.println("Escreva em metros");
            double metros = valor.nextDouble();
            double mult = metros*100;
            System.out.println("Centimetros sao " + mult);
            
            System.out.println
            ("========================================");

        //3
        System.out.println("Escreva um numero");
        int numero = valor.nextInt();
        

        if(numero %2 == 0){
            System.out.println("Seu  " + numero + " e par" );
        }else{
            System.out.println("Seu " + numero + " e impar");
        }

        //4

        System.out.println("Escreva uma velocidade");
        int velocidade = valor.nextInt();

        if(velocidade >= 80){
            int multa = (velocidade - 80)*5;
            System.out.println("Sua multa R$" + multa);
        }else{
            System.out.println("Sua velocidade e de " + velocidade + " esta dentro do padrao");
        }
        }
    }

    
    