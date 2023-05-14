package projeto;

public class App {
	
	public static void main(String[] args) {
	
	Livro livro = new Livro("1984", "George Orwell", 1949, "Comentário sobre 1984", "Editora Abril", 328, 4.5);
	Album album = new Album("Dark Side of the Moon", "Pink Floyd", 1973, "Comentário sobre Dark Side of the Moon", "EMI", "Abbey Road", 4.9);

	FormatadorRelatorio resumidoHTML = new FormatadorRelatorioResumidoHTML();
	System.out.println(resumidoHTML.formatar(livro));
	System.out.println(resumidoHTML.formatar(album));

	FormatadorRelatorio completoHTML = new FormatadorRelatorioCompletoHTML();
	System.out.println(completoHTML.formatar(livro));
	System.out.println(completoHTML.formatar(album));

	FormatadorRelatorio resumidoLaTeX = new FormatadorRelatorioResumidoLaTeX();
	System.out.println(resumidoLaTeX.formatar(livro));
	System.out.println(resumidoLaTeX.formatar(album));

	FormatadorRelatorio completoLaTeX = new FormatadorRelatorioCompletoLaTeX();
	System.out.println(completoLaTeX.formatar(livro));
	System.out.println(completoLaTeX.formatar(album));
	
	}


}
