/* Nome do Aluno: José Lucas Soares Cardoso
* RA:1352312348
* Nome do Programa:Ex9
* Data:21/05/2023
*/

import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex9
{

    static double calc_produto(double num,int decisao)
    {
        double tot_valor = 0;

        switch(decisao)
        {
            case 1:
                tot_valor = num - (num * (10/100));
                break;
            
            case 2:
                tot_valor = num - (num * (5/100));
                break;
            
            case 3:
                tot_valor = num;
                break;
            
            case 4:
                tot_valor = num + (num * (5/100));
                break;
            
            
            case 5:
                tot_valor = num - (num * (8/100));
                break;
            
            case 6:
                tot_valor = num - (num * (8/100)); 
        }

        return tot_valor;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat dt = new DecimalFormat("#.##");

        System.out.println("[0] Venda a Vista - desconto de 10%");
        System.out.println("[1] Venda a Prazo 30 dias - desconto de 5%");
        System.out.println("[2] Venda a Prazo 60 dias - mesmo preço");
        System.out.println("[3] Venda a Prazo 90 dias - acréscimo de 5%");
        System.out.println("[4] Venda com cartão de débito - desconto de 8%");
        System.out.println("[5] Venda com cartão de crédito - desconto de 7%");
        System.out.println();

        System.out.print("Selecione o tipo de pagamento: ");
        int decisao = input.nextInt();
        System.out.println();
        
        System.out.println("Digite o valor da venda: ");
        double num = input.nextDouble();

        System.out.println("Valor total: "+dt.format(calc_produto(num, decisao))+"R$");
    }
}