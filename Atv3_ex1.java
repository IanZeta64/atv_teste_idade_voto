import java.util.InputMismatchException;
import java.util.Scanner;

public class Atv3_ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer idade;
        String s;
       try {
            do {
                System.out.println("Digite a idade do eleitor: ");
                idade = sc.nextInt();
                if (idade < 0) {
                    System.err.println("valor da idade invalido!");
                }
            } while (idade < 0);

          s=  verificarIdade(idade);
           System.out.println(s);
       }catch(InputMismatchException e) {
           System.err.println("Erro de entrada de dados. Reinicie o programa.");
       }
       sc.close();
    }

    public static String verificarIdade(Integer idade) {
        String s;
        if (idade >= 18 && idade <= 70) {
            s = "Voto obrigatório.";
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            s = "Voto facultativo.";
        } else {
           s = "Sem direito a votar.";
        }
        return s;
    }
}
