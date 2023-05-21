/* Nome do Aluno: José Lucas Soares Cardoso
* RA:1352312348
* Nome do Programa:Ex8
* Data:21/05/2023
*/

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.text.MessageFormat;
public class Ex8
{

    static String calc_estacao(int mes)
    {
        String resposta = "";

        if (mes >= 3 && mes <= 6) {resposta = "Outono";}

        else if (mes >= 6 && mes <= 9) {resposta = "Inverno";}

        else if (mes >= 9 && mes <= 12) {resposta = "Primavera";}

        else
        {
            resposta = "Verão";
        }


        return resposta;


    }
    public static void main(String[] args) 
    {
        String[] meses = new String[]{"janeiro",
        "fevereiro","março","abril","maio","junho","julho","agosto",
        "setembro","outubro","novembro","dezembro"};

        Map<Integer,String> data = new HashMap<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0;i < 10;i++)
        {
            data.put(i+1, meses[i]);
        }

        System.out.println("Digite o mês do ano: ");
        int mes = input.nextInt();

        String res_msg = MessageFormat.format("mês {0}: Mês: {1} Estação: {2}",mes,data.get(mes),calc_estacao(mes));

        System.out.println(res_msg);
    }
}