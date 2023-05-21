/* Nome do Aluno: José Lucas Soares Cardoso
* RA:1352312348
* Nome do Programa:Ex5
* Data:21/05/2023
*/

import java.util.Scanner;

public class Ex5
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual é o seu Nome: ");
        String nome = input.nextLine();
        System.out.print("Qual é o seu Sobrenome: ");
        String sobre_nome = input.nextLine();
        System.out.print("Qual é a sua idade: ");
        int idade = input.nextInt();
        System.out.print("Em qual cidade você nasceu: ");
        String naturalidade = input.nextLine();

        System.out.println("");

        while (true)
        {
            System.out.println("Você desejar ver a suas informações (S/N) ?");
            String res = input.nextLine().toUpperCase();

            if (res.equals("S")) 
            {
                System.out.println("Nome: "+nome+" "+sobre_nome);
                System.out.println("Idade: "+idade);
                System.out.println("naturalidade: "+naturalidade);
                System.out.println("");
            }

            else if (res.equals("N")) 
            {
                System.out.println("Nome: "+nome+" "+sobre_nome);
                System.out.println("Idade: "+idade);
                System.out.println();
            }

            else
            {
                System.out.println("Resposta invalida!!!");
                System.out.println();
            }
        }
    }
}

