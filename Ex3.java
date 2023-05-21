/* Nome do Aluno: José Lucas Soares Cardoso
* RA:1352312348
* Nome do Programa:Ex3
* Data:21/05/2023
*/



import java.util.Scanner;

public class Ex3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a,b =0;

        System.out.println("Escreva um numero: ");
        a = input.nextInt();

        System.out.println("Escreva outro numero:  ");
        b = input.nextInt();

        int resul = (a > b) ? b/a : a/b;


        if (resul == 0)
        {
            System.out.println("São numeros múltiplos ");
        }

        else
        {
            System.out.println("Não são numeros múltiplos");
        }

    } 
}
