import java.util.ArrayList;
import java.util.List;

public class Teste_resultado_idadeVoto {
    public static void main(String[] args) {
        List<Integer> idades = getIdades();
        List<String> resultadosEsperdos = getResultadosEsperados();
        List<String> testes = new ArrayList<>();
      List<String> testesFalhos = new ArrayList<>();
      int contadorSucesso = 0;

        for (int i = 0; i < idades.size(); i++) {
            testes.add((Atv3_ex1.verificarIdade(idades.get(i)).equals(resultadosEsperdos.get(i)) ? "Sucesso" : "Falha"));

            if (testes.get(i).equals("Sucesso")){
            contadorSucesso++;
            } else {
                testesFalhos.add("Teste " + (i+1) + " - Resultado : " + Atv3_ex1.verificarIdade(idades.get(i))
                        + " - Correto: " + resultadosEsperdos.get(i));
            }
            System.out.printf("Teste %d : %s.%n", i+1, testes.get(i));
        }
        if (contadorSucesso == idades.size()){
            System.out.println("Testes executados com sucesso!");
        }else{
            System.out.println("Algum(ns) teste(s) executado(s) com falha(s).");
            for (String testeFalho: testesFalhos) {
                System.out.println(testeFalho);
            }


        }

    }
    private static List<String> getResultadosEsperados() {
        List <String> resultadosEsperdos = List.of("Voto obrigatório.", "Voto obrigatório.", "Voto obrigatório.",
                "Sem direito a votar.", "Sem direito a votar.", "Sem direito a votar.", "Voto facultativo.",
                "Voto facultativo.", "Voto facultativo.");
        return resultadosEsperdos;
    }
    private static List<Integer> getIdades() {
        List<Integer> idades = List.of(18, 70, 25, 15, 10, 1, 16, 17, 71);
        return idades;
    }
}
