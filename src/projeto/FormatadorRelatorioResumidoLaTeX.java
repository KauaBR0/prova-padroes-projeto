package projeto;

public class FormatadorRelatorioResumidoLaTeX implements FormatadorRelatorio {
    private Exportador exportador;

    public FormatadorRelatorioResumidoLaTeX() {
        this.setExportador(new ExportadorLaTeX(new ExportarLivroLaTeX()));
    }

    @Override
    public String formatar(Livro livro) {
        return String.format("%% %s\n\\textbf{%s}\n\\emph{%s (%d)}\n",
                livro.getComentario(), livro.getTitulo(), livro.getAutor(), livro.getAno());
    }

    @Override
    public String formatar(Album album) {
        return String.format("%% %s\n\\textbf{%s}\n\\emph{%s (%d)}\n",
                album.getComentario(), album.getTitulo(), album.getAutor(), album.getAno());
    }

	public Exportador getExportador() {
		return exportador;
	}

	public void setExportador(Exportador exportador) {
		this.exportador = exportador;
	}
}
