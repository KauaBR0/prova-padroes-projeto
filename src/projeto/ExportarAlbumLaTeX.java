package projeto;

public class ExportarAlbumLaTeX implements ExportStrategy {
    @Override
    public String exportar(Livro livro) {
        throw new UnsupportedOperationException("Não é possível exportar um livro como álbum em LaTeX");
    }

    @Override
    public String exportar(Album album) {
		return null;
    }
}
