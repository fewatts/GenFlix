package conta.model;

public class Filme extends ProducaoAudioVisual{
	private int duracao;

	public Filme(String titulo, String genero, int duracao, int status, int classificacao) {
		super(titulo, genero,duracao, status, classificacao);
		this.duracao = duracao;
	}

	public Filme() {
	}


	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getDuracao() {
		return duracao;
	}


	/*public void visualizar() {
		//System.out.println("------ Filme --------"+ 
							"\nTitulo: "+ this.getTitulo()+
							"\nClassificação: "+ this.getClassificacao());  
	}*/
	
	
	
}
