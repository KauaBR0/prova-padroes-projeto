package projeto;

public class ExportarLivroHTML implements ExportStrategy {
    @Override
    public String exportar(Livro livro) {
		return null;
    }

    @Override
    public String exportar(Album album) {
        throw new UnsupportedOperationException("Não é possível exportar um álbum como livro em HTML");
    }
}
