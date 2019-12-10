package Carrinho.Carrinho;
import java.util.Arrays;

public class ListadeCompras {
	String[] Lista = new String[1];
	
	void adcionarLista(String produto) {
		int aux = Lista.length;
		if(Lista.length == 1&&Lista[0]==null) {
			this.Lista[0] = produto;
		}else {
		this.Lista = Arrays.copyOf(this.Lista, Lista.length + 1);
		this.Lista[aux] = produto;
		}
	}
	void visualizarLista() {
		for(int i = 0;i<this.Lista.length;i++) {
			System.out.println(Lista[i]);
		}
	}
}
