package calculadora_simples;

import java.util.Scanner;

public class CalculadoraPrincipal {

   public static void main(String[] args) {
     
        Scanner dados = new Scanner(System.in);
        double valor1,valor2;

        System.err.printf("1-Soma %n2-Subtração%n3-Multiplicação%n4-Divisão%n5-Sair%n");
        System.out.println("Escolha a opção:");
        int op=dados.nextInt();

        switch (op) {
            case 1:
                System.out.println("Digite o primeiro valor:");
                valor1=dados.nextDouble();

                System.out.println("Digite o segundo valor:");
                valor2=dados.nextDouble();

                Calculadora resultado = new Calculadora(valor1, valor2);
                System.out.println("A soma de "+ valor1 + " + "+ valor2 + " é : "+resultado.soma());
            break;
            
            case 2:
                System.out.println("Digite o primeiro valor:");
                valor1=dados.nextDouble();

                System.out.println("Digite o segundo valor:");
                valor2=dados.nextDouble();

                Calculadora resultado2 = new Calculadora(valor1, valor2);
                System.out.println("A subtração de "+ valor1 + " - "+ valor2 + " é : "+resultado2.subtracao());
            break;
            case 3:
                System.out.println("Digite o primeiro valor:");
                valor1=dados.nextDouble();

                System.out.println("Digite o segundo valor:");
                valor2=dados.nextDouble();

                Calculadora resultado3 = new Calculadora(valor1, valor2);
                System.out.println("A multiplicação de "+ valor1 + " * "+ valor2 + " é : "+resultado3.multipliacacao());
            break;
            case 4:
                System.out.println("Digite o primeiro valor:");
                valor1=dados.nextDouble();

                System.out.println("Digite o segundo valor:");
                valor2=dados.nextDouble();

                Calculadora resultado4 = new Calculadora(valor1, valor2);
                System.out.println("A divisão de "+ valor1 + " / "+ valor2 + " é : "+resultado4.divisao());
            break;
           
            default:
            break;
        }

        dados.close();
   }
}

