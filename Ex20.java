/* Nome do Aluno: José Lucas Soares Cardoso
* RA:1352312348
* Nome do Programa: Ex20
* Data: 21/05/2023
*/


import java.util.Scanner;

public class Ex20
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a carga máxima do elevador: ");
        int carga_maxima = input.nextInt();
        double tot_peso = 0;

        while (tot_peso < carga_maxima)
        {
            System.out.print("Digte seu peso(Kg): ");
            tot_peso += input.nextInt();
            System.out.println();
        }
        System.out.println("Desculpe, não é permitido a entrada de mais pessos nesse elevador.");
    }    
}
