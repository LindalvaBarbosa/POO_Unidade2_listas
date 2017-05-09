package QuestoesTeoricas;

public class Teoricas {

	public static void main(String[] args) {
		System.out.println("Lista- Coleções"+"\n"+"Respostas:");
		System.out.println("1 - lista é uma coleção de elementos arrumados numa ordem linear, isto é, onde cada elemento"
				+ "tem um antecessor (exceto o primeiro) e um sucessor (exceto o último).Normalmente implementada como: Array, Listas encadeadas");
        System.out.println("2 - conjunto é uma coleção que não possui elementos duplicados.Pode ser ordenado ou não.");
	    System.out.println("3 - Mapas(map) é um objeto que mapeia valores para chaves, ou seja, através da chave consegue ser acessado o valor configurado, sendo que a chave "
	    		+ "não pode ser repetida ao contrário do valor, mas se caso tiver uma chave repetida é sobrescrito pela última chamada. ");
	    System.out.println("4- São filas com regras especiais (não respeitam o FIFO ao pé da letra)");
	    System.out.println("5- remove(E): Remove uma única instância do elemento especificado desta lista, se estiver presente (operação opcional). Mais formalmente, remove um "
	    		+ "elemento e tal que (o == null? E == null: o.equals (e)), se a lista contiver um ou mais desses elementos. Retorna true se a lista continha o elemento especificado (ou equivalentemente, se a lista foi alterada como resultado da chamada)."
	    		+"\n"+"IndexOf(Object): Retorna o índice da primeira ocorrência do elemento especificado nesta lista ou -1 se esta lista não contém o elemento. Mais formalmente, retorna o menor índice i tal que (o == null? Get (i) == null: o.equals (get (i))), "
	    		+ "ou -1 se não houver esse índice."+"\n"+"contains(Object): Retorna true se esta coleção contém o elemento especificado."+"\n"
	    		+"Requer a implemtação do equals");
	    System.out.println("6- Não é correto remover um elemento da lista usando através de um forou um for-each, Se tentarmos remover um item de uma lista enquanto estivermos iterando sobre a mesma utilizando o foreach, uma exceção será lançada,"
	    		+ "pois estamos removendo um item da coleção enquanto estamos iterando sobre a mesma.Devemos fazer a remoção usando o Iterator.");
	    System.out.println("7 - TreeSet é classificada, ou seja sua propria lista tenta ordenar seus objetos de uma forma natural ou não."+"\n"+"HashSet, não é classificada nem ordenada, veja que ao adicionar seus elementos, não tem como você saber onde esta um determinado item."
	    		+"Set é uma interface, implementada tanto por HashSet quanto por TreeSet, entre outros. Assim como List é uma interface que é implementada por ArrayList, Vector, LinkedList, etc");
	    System.out.println("8- LinkedHashSet é uma versão ordenada do HashSet que mantém uma Lista duplamente vinculada entre todos os elementos.HashSet a ordem é imprevisível, enquanto um LinkedHashSet permite iterar através dos elementos na ordem em que foram inseridos. E o ");
	    System.out.println("10- Quando utilizamos o treeSet devemos implementar o metodo compareTo. Para manter a ordem em sua estrutura.");
	    System.out.println("11- HashMap é mais rápido do que Hashtable, pois Hashtable é sincronizado.TreeMap usa o método compareTo, da interface Comparator, para saber onde guardar o par chave-valor. Logo, TreeMap não usa hash, e tende a ser mais lento do que as implementações "
	    		+"que usam hash. LinkedHashMap gasta mais memória (cada nó tem 2 ponteiros, anterior e sucessor), mas de modo geral, os tempos são semelhantes. ");
	}

}
