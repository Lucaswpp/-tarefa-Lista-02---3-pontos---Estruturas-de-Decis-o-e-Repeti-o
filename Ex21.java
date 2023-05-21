/**Escreva um programa que, dado um número positivo digitado
pelo o usuário mostre a tabuada de todos os números de 1 até o
número digitado. (utilize for) */

/* Nome do Aluno: José Lucas Soares Cardoso
* RA:1352312348
* Nome do Programa:Ex21
* Data:21/05/2023
*/

import java.util.Scanner;
public class Ex21
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for (int i1=1;i1 < num + 1;i1++)
        {
            for (int i2 = 1;i2 < 11;i2++)
            {
                System.out.println(i1+" X "+i2+" = "+i1*i2);
            }

            System.out.println();
        }
    }
}