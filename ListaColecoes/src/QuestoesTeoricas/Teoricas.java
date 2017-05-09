package QuestoesTeoricas;

public class Teoricas {

	public static void main(String[] args) {
		System.out.println("Lista- Cole��es"+"\n"+"Respostas:");
		System.out.println("1 - lista � uma cole��o de elementos arrumados numa ordem linear, isto �, onde cada elemento"
				+ "tem um antecessor (exceto o primeiro) e um sucessor (exceto o �ltimo).Normalmente implementada como: Array, Listas encadeadas");
        System.out.println("2 - conjunto � uma cole��o que n�o possui elementos duplicados.Pode ser ordenado ou n�o.");
	    System.out.println("3 - Mapas(map) � um objeto que mapeia valores para chaves, ou seja, atrav�s da chave consegue ser acessado o valor configurado, sendo que a chave "
	    		+ "n�o pode ser repetida ao contr�rio do valor, mas se caso tiver uma chave repetida � sobrescrito pela �ltima chamada. ");
	    System.out.println("4- S�o filas com regras especiais (n�o respeitam o FIFO ao p� da letra)");
	    System.out.println("5- remove(E): Remove uma �nica inst�ncia do elemento especificado desta lista, se estiver presente (opera��o opcional). Mais formalmente, remove um "
	    		+ "elemento e tal que (o == null? E == null: o.equals (e)), se a lista contiver um ou mais desses elementos. Retorna true se a lista continha o elemento especificado (ou equivalentemente, se a lista foi alterada como resultado da chamada)."
	    		+"\n"+"IndexOf(Object): Retorna o �ndice da primeira ocorr�ncia do elemento especificado nesta lista ou -1 se esta lista n�o cont�m o elemento. Mais formalmente, retorna o menor �ndice i tal que (o == null? Get (i) == null: o.equals (get (i))), "
	    		+ "ou -1 se n�o houver esse �ndice."+"\n"+"contains(Object): Retorna true se esta cole��o cont�m o elemento especificado."+"\n"
	    		+"Requer a implemta��o do equals");
	    System.out.println("6- N�o � correto remover um elemento da lista usando atrav�s de um forou um for-each, Se tentarmos remover um item de uma lista enquanto estivermos iterando sobre a mesma utilizando o foreach, uma exce��o ser� lan�ada,"
	    		+ "pois estamos removendo um item da cole��o enquanto estamos iterando sobre a mesma.Devemos fazer a remo��o usando o Iterator.");
	    System.out.println("7 - TreeSet � classificada, ou seja sua propria lista tenta ordenar seus objetos de uma forma natural ou n�o."+"\n"+"HashSet, n�o � classificada nem ordenada, veja que ao adicionar seus elementos, n�o tem como voc� saber onde esta um determinado item."
	    		+"Set � uma interface, implementada tanto por HashSet quanto por TreeSet, entre outros. Assim como List � uma interface que � implementada por ArrayList, Vector, LinkedList, etc");
	    System.out.println("8- LinkedHashSet � uma vers�o ordenada do HashSet que mant�m uma Lista duplamente vinculada entre todos os elementos.HashSet a ordem � imprevis�vel, enquanto um LinkedHashSet permite iterar atrav�s dos elementos na ordem em que foram inseridos. E o ");
	    System.out.println("10- Quando utilizamos o treeSet devemos implementar o metodo compareTo. Para manter a ordem em sua estrutura.");
	    System.out.println("11- HashMap � mais r�pido do que Hashtable, pois Hashtable � sincronizado.TreeMap usa o m�todo compareTo, da interface Comparator, para saber onde guardar o par chave-valor. Logo, TreeMap n�o usa hash, e tende a ser mais lento do que as implementa��es "
	    		+"que usam hash. LinkedHashMap gasta mais mem�ria (cada n� tem 2 ponteiros, anterior e sucessor), mas de modo geral, os tempos s�o semelhantes. ");
	}

}
