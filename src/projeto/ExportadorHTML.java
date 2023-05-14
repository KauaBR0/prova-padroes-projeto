package projeto;

public class ExportadorHTML implements Exportador {
    private ExportStrategy strategy;

    public ExportadorHTML(ExportStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public String exportar(Livro livro) {
        return strategy.exportar(livro);
    }

    @Override
    public String exportar(Album album) {
        return strategy.exportar(album);
    }
}
