package Repositorio;
import ClasseBasica.Clube;

public class RepositorioClubeArray implements RepositorioClube{
	
	private Clube[] listaClubes;
	private int index; 
	private final static int tamanho = 20; 
	
	public RepositorioClubeArray() {
		this.listaClubes = new Clube[tamanho]; 
		this.index = 0; 
	}

	@Override
	public void inserirClube(Clube clube) {
		// TODO Auto-generated method stub
		
		this.listaClubes[index] = clube; 
		this.index += 1; 
		
	}

	@Override
	public void atualizaClube(Clube clube) {
		// TODO Auto-generated method stub
		
		for(int a=0; a<index; a++) {
			if(listaClubes[a].getNumeroRegistro() == clube.getNumeroRegistro()) {
				listaClubes[a] = clube; 
			}
		}
		
	}

	@Override
	public Clube buscaClube(int numeroregistro) {
		// TODO Auto-generated method stub
		
		Clube clube = null; 
		
		for(int a = 0; a<index; a++) {
			if(listaClubes[a].getNumeroRegistro() == numeroregistro) {
				clube = listaClubes[a];
			}
		}
		
		return clube;
	}

	@Override
	public void removeClube(int numeroregistro) {
		// TODO Auto-generated method stub
		
		for(int a = 0; a<index; a++) {
			if(listaClubes[a].getNumeroRegistro() == numeroregistro) {
				listaClubes[a] = listaClubes[index-1]; 
				this.index -= 1; 
			}
		}
		
		
	}

	@Override
	public void listar(RepositorioClubeArray repositorio) {
		// TODO Auto-generated method stub
		for(int a = 0; a<index; a++) {
			System.out.println("Nome: "+ listaClubes[a].getNome());
		}
		
		
	}

}
