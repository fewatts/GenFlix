package conta.util;

public class Conta {
	private String usuario;
	private String senha;
	private ListaFilme filmes = new ListaFilme();
	private ListaSerie series = new ListaSerie();
	public Conta(String usuario, String senha, ListaFilme filmes, ListaSerie series) {
		this.usuario = usuario;
		this.senha = senha;
		this.filmes = filmes;
		this.series = series;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public ListaFilme getFilmes() {
		return filmes;
	}
	public void setFilmes(ListaFilme filmes) {
		this.filmes = filmes;
	}
	public ListaSerie getSeries() {
		return series;
	}
	public void setSeries(ListaSerie series) {
		this.series = series;
	}
}
