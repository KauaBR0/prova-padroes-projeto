package projeto;

public class ExportarAlbumHTML implements ExportStrategy {
    @Override
    public String exportar(Livro livro) {
        throw new UnsupportedOperationException("Não é possível exportar um livro como álbum em HTML");
    }

    @Override
    public String exportar(Album album) {
		return null;
    }
}
