/* Nome do Aluno: José Lucas Soares Cardoso
* RA:1352312348
* Nome do Programa:Ex2
* Data:21/05/2023
*/


import java.util.Scanner;

public class Ex2
{

    static String ordem_crescente(int a, int b, int c)
    {

        String resul = "";

        if (a > b && a > c)
        {
            resul = b > c ? c+" "+b+" "+a:b+" "+c+" "+a;
        }

        else if  (b > a && b > c)
        {
            resul = a > c ? c+" "+a+" "+b:a+" "+c+" "+b;
        }

        else if  (c > a && c > b)
        {
            resul = a > b ? c+" "+c+" "+a:a+" "+b+" "+c;
        }


        return resul;
    }


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva três numeros: ");

        int a,b,c;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        System.out.println(ordem_crescente(a, b, c));
    }
}