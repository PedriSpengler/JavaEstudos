import java.util.ArrayList;
import java.util.Iterator;

public class IteratorJava {
    public static void main(String[] args) {
        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it2 = numbers.iterator();
        while(it2.hasNext()) {
            Integer i = it2.next();
            if(i < 10) {
                it2.remove();
            }
        }
        System.out.println(numbers);
    }
}

/*
Por que utilizar?

    Economia drástica de memória (Lazy Evaluation): Esta é a maior vantagem. Em vez de carregar um milhão de registros na memória RAM de uma só vez, o iterador carrega apenas o elemento que está sendo processado naquele exato milésimo de segundo.

    Abstração (Esconde a complexidade): Você usa o mesmo laço de repetição (como um for..in) para ler uma lista simples, um arquivo de texto gigante ou os nós de uma árvore binária. Quem consome os dados não precisa saber como eles estão armazenados.

    Segurança e Prevenção de Erros: Elimina os clássicos erros de "índice fora dos limites" (Index Out of Bounds) que acontecem quando gerenciamos contadores manuais (i = 0; i < tamanho; i++).

    Processamento Infinito: Permite representar sequências que não têm fim (como fluxos de dados de sensores, números primos ou conexões de rede), gerando o próximo valor apenas sob demanda.

Quando utilizar?

Você deve optar por iteradores (e geradores) nas seguintes situações:

    Lendo arquivos grandes: Se você precisa processar um arquivo de log de 10 GB, ler tudo para uma variável vai travar o sistema. Um iterador lê uma linha, processa, descarta e pega a próxima.

    Consultas pesadas em Banco de Dados: Ao invés de trazer 500.000 usuários do banco para uma lista (Array) de uma vez, um iterador traz pequenos lotes (chunks) sob demanda.

    Estruturas de Dados Complexas: Se você criou uma estrutura em Grafo ou Árvore, criar um iterador permite que outros programadores naveguem pelos seus dados usando um simples for, sem precisar entender sua lógica de nós e ponteiros.

    Consumo de APIs com Paginação: Quando uma API retorna dados página por página, um iterador pode mascarar essa paginação, fazendo parecer que você está consumindo uma lista única e contínua.

    Resumo: Se a coleção cabe inteira na memória com folga e você precisa acessar elementos em posições aleatórias (ex: pegar o 5º, depois o 20º), use listas/arrays normais. Se os dados são massivos, complexos ou lineares, use iteradores.
*/