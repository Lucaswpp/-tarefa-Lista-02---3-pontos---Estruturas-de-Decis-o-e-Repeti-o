/* Nome do Aluno: José Lucas Soares Cardoso
* RA:1352312348
* Nome do Programa: Ex19
* Data: 21/05/2023
*/


import java.util.Scanner;

public class Ex19
{
    public static void main(String[] args)
    {
        int volume = new Scanner(System.in).nextInt();
        for (int i=0;true;i++)
        {
            if (volume > 1000)
            {
                System.out.println(i+" segundos");
                break;
            }

            volume *= 2;
        }
    }    
}