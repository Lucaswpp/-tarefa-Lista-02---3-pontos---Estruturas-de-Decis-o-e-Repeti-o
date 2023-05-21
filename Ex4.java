/* Nome do Aluno: José Lucas Soares Cardoso
* RA:1352312348
* Nome do Programa:Ex4
* Data:21/05/2023
*/


import java.util.Scanner;

public class Ex4
{

    static String par_or_impar(int a)
    {
        String resul = "impar";
        if (a % 2 == 0) {resul = "par";};

        return resul;
    }

    static String neg_or_pos(int a)
    {
       String resul = "Negativo";
       if (a > 0) {resul = "Positivo";}; 

       return resul;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int a = input.nextInt();


        System.out.println("Numero "+neg_or_pos(a)+" e "+par_or_impar(a));
    } 
}
