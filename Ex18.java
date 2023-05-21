/* Nome do Aluno: José Lucas Soares Cardoso
* RA:1352312348
* Nome do Programa: Ex18
* Data: 21/05/2023
*/


import java.util.Scanner;

public class Ex18
{
    static int calc_fat(int num)
    {
        if (num != 0)
        {
            int tot_fat=1;

            for(int i=1;num+1 > i;i++)
            {
                tot_fat *= i;
                System.out.println(tot_fat);
            }

            return tot_fat;
        }

        return num+1;
    }

    public static void main(String[] args)
    {
        int num = new Scanner(System.in).nextInt();

        int resul_num = calc_fat(num);

        System.out.println("O fatorial do numero é "+resul_num);
    }
}
