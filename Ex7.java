/* Nome do Aluno: José Lucas Soares Cardoso
* RA:1352312348
* Nome do Programa:Ex7
* Data:21/05/2023
*/

import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex7
{

    static double calc_hospedagem(int num_diaria)
    {
        double calc_valor = 0;

        if (num_diaria > 15){calc_valor = (60.00 + 5.50) * num_diaria;}

        else if (num_diaria == 15){calc_valor = (60.00 + 6.00) * num_diaria;}

        else if (num_diaria < 15){calc_valor = (60.00 + 8.00) * num_diaria;}

        return calc_valor;

    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat dt = new DecimalFormat("#.##");

        System.out.println("Digite o numero de diárias: ");
        int diarias = input.nextInt();

        System.out.println("O valor total da hospedagem é "+dt.format(calc_hospedagem(diarias))+"R$");

    }
}