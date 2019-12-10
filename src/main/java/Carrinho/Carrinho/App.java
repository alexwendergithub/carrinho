package Carrinho.Carrinho;

public class App 
{
    public static void main( String[] args )
    {
    	ListadeCompras Lista = new ListadeCompras();
    	Lista.adcionarLista("Alpha");
    	Lista.adcionarLista("Beta");
    	Lista.adcionarLista("Gama");
    	Lista.visualizarLista();
    }
}
