package conta.model;

public class Filme extends ProducaoAudioVisual {
	private int duracao;

	public Filme(String titulo, String genero, int duracao, int status, int classificacao) {
		super(titulo, genero,duracao, status, classificacao);
		this.duracao = duracao;
	}

<<<<<<< HEAD
	public int getDuracao() {
		return duracao;
	}
=======
	public Filme() {
	}

>>>>>>> Luan_listaFilmes

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

<<<<<<< HEAD
	@Override
	public void visualizar() {

		super.visualizar();

		System.out.println("Duração do filme (em minutos): " + this.duracao);
	}

	/*
	 * public void visualizar() { //System.out.println("------ Filme --------"+
	 * "\nTitulo: "+ this.getTitulo()+ "\nClassificação: "+
	 * this.getClassificacao()); }
	 */
=======
	public int getDuracao() {
		return duracao;
	}

>>>>>>> Luan_listaFilmes

}
