package conta.model;

public class Filme extends ProducaoAudioVisual{
	private int duracao;

	public Filme(String titulo, String genero, int status, int classificacao, int duracao) {
		super(titulo, genero, status, classificacao);
		this.duracao = duracao;
	}

	public Filme() {
	}


	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}


	/*public void visualizar() {
		//System.out.println("------ Filme --------"+ 
							"\nTitulo: "+ this.getTitulo()+
							"\nClassificação: "+ this.getClassificacao());  
	}*/
	
	
	
}
