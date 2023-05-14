package projeto;

public interface ExportStrategy {
    String exportar(Livro livro);
    String exportar(Album album);
}
