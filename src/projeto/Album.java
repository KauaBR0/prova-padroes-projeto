package projeto;

public class Album {

	private String gravadora;
	private String estudio;
	private String autor;
	private int duracao;
	private String titulo;
	private int ano;
	private int numeroPaginas;
	private double avaliacao;
	private String comentario;

	public Album(String titulo, String artista, int anoLancamento, String comentario, String gravadora, String estudioGravacao, double avaliacao) {
        this.titulo = titulo;
        this.autor = artista;
        this.ano = anoLancamento;
        this.comentario = comentario;
        this.gravadora = gravadora;
        this.estudio = estudioGravacao;
        this.avaliacao = avaliacao;
    }

    public Album(String titulo, String artista, int anoLancamento, String gravadora, String estudioGravacao, double avaliacao) {
        this.titulo = titulo;
        this.autor = artista;
        this.ano = anoLancamento;
        this.gravadora = gravadora;
        this.estudio = estudioGravacao;
        this.avaliacao = avaliacao;
    }
	
	
	
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public double getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public String getEstudio() {
		return estudio;
	}
	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	
}
