package projeto;

public class FormatadorRelatorioResumidoHTML implements FormatadorRelatorio {
    private Exportador exportador;

    public FormatadorRelatorioResumidoHTML() {
        this.setExportador(new ExportadorHTML(new ExportarLivroHTML()));
    }

    @Override
    public String formatar(Livro livro) {
        return String.format("<!-- %s -->\n<bold>%s</bold>\n<italic>%s (%d)</italic>\n",
                livro.getComentario(), livro.getTitulo(), livro.getAutor(), livro.getAno());
    }

    @Override
    public String formatar(Album album) {
        return String.format("<!-- %s -->\n<bold>%s</bold>\n<italic>%s (%d)</italic>\n",
                album.getComentario(), album.getTitulo(), album.getAutor(), album.getAno());
    }

	public Exportador getExportador() {
		return exportador;
	}

	public void setExportador(Exportador exportador) {
		this.exportador = exportador;
	}
}
