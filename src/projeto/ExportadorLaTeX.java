package projeto;

public class ExportadorLaTeX implements Exportador {
    private ExportStrategy strategy;

    public ExportadorLaTeX(ExportStrategy strategy) {
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
