/* Nome do Aluno: José Lucas Soares Cardoso
* RA:1352312348
* Nome do Programa: Ex14
* Data: 21/05/2023
*/


public class Ex14
{
    public static void main(String[] args)
    {
        int[] array_num = new int[50];
        
        for(int i=0;i < 50;i++)
        {
            array_num[i] = 0;
        }

        int cont = 0;
        for (int i : array_num)
        {
            cont += 1;
            System.out.println(cont+"° - "+i);
        }
    }
}