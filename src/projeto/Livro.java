package projeto;

public class Livro {
	
	private String editora;
	private String idioma;
	private String autor;
	private String comentario;
	private String titulo;
	private int ano;
	private int numeroPaginas;
	private double avaliacao;
	
	public Livro(String titulo, String autor, int anoPublicacao, String comentario, String editora, int numPaginas, double avaliacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = anoPublicacao;
        this.comentario = comentario;
        this.editora = editora;
        this.numeroPaginas = numPaginas;
        this.avaliacao = avaliacao;
    }

    public Livro(String titulo, String autor, int anoPublicacao, String editora, int numPaginas, double avaliacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = anoPublicacao;
        this.editora = editora;
        this.numeroPaginas = numPaginas;
        this.avaliacao = avaliacao;
    }

	
	public double getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
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
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
	

}
