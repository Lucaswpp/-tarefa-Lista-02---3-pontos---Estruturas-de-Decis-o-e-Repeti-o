/* Nome do Aluno: José Lucas Soares Cardoso
* RA:1352312348
* Nome do Programa:Ex1
* Data:21/05/2023
*/



import java.util.Scanner;

public class Ex1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Escreva um numero: ");
        int num_a = input.nextInt();

        System.out.print("Escreva um outro numero: ");
        int num_b = input.nextInt();

        int resposta = num_a > num_b ? num_a:num_b;

        System.out.println(resposta);
    }
}