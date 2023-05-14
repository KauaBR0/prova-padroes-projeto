package projeto;

public class FormatadorRelatorioCompletoLaTeX implements FormatadorRelatorio {
    private Exportador exportador;

    public FormatadorRelatorioCompletoLaTeX() {
        this.exportador = new ExportadorLaTeX(new ExportarLivroLaTeX());
    }

    @Override
    public String formatar(Livro livro) {
        String livroFormatado = exportador.exportar(livro);
        return String.format("%s\nEditora: %s\nNumero de Páginas: %d\nAvaliação: %.1f\n",
                livroFormatado, livro.getEditora(), livro.getNumeroPaginas(), livro.getAvaliacao());
    }

    @Override
    public String formatar(Album album) {
        String albumFormatado = exportador.exportar(album);
        return String.format("%s\nGravadora: %s\nEstúdio: %s\nAvaliação: %.1f\n",
                albumFormatado, album.getGravadora(), album.getEstudio(), album.getAvaliacao());
    }
}
