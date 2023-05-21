/* Nome do Aluno: José Lucas Soares Cardoso
* RA:1352312348
* Nome do Programa: Ex15
* Data: 21/05/2023
*/


public class Ex15
{
    public static void main(String[] args)
    {
        int[][] num_array_2d = new int[10][10];

        for (int linha=0;linha < 10;linha++)
        {
            for (int coluna=0;coluna < 10;coluna++)
            {
                num_array_2d[linha][coluna] = 0;
            }
        }

        for (int[] num_array_1d : num_array_2d)
        {
            System.out.println();
            for (int num : num_array_1d) {
                System.out.print(num+" ");
            }
        }
    }
}