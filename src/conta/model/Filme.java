package conta.model;

public class Filme extends ProducaoAudioVisual {
	private int duracao;

	public Filme(String titulo, String genero, int duracao, int status, int classificacao) {
		super(titulo, genero,duracao, status, classificacao);
		this.duracao = duracao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public void visualizar() {

		super.visualizar();

		System.out.println("Duração do filme (em minutos): " + this.duracao);
	}

}
