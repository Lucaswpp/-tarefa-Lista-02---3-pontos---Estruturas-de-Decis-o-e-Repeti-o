/* Nome do Aluno: José Lucas Soares Cardoso
* RA:1352312348
* Nome do Programa:Ex6
* Data:21/05/2023
*/

import java.util.Scanner;

public class Ex6
{

    static String check_conceito(int nota)
    {
        String res = "";

        if (nota >= 0 && nota <= 49) {res = "Insuficiente";}

        else if (nota >= 50 && nota <= 64) {res = "Regular";}

        else if (nota >= 65 && nota <= 84) {res = "Bom";}

        else if (nota >= 85 && nota <= 100) {res = "Ótimo";}


        return res;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        int res = input.nextInt();

        System.out.println("O aluno é "+check_conceito(res));
    }
}