package builder.itextpdfgenerator.builder.pdf;

import builder.itextpdfgenerator.builder.components.TableBuilder;
import builder.itextpdfgenerator.builder.components.TextBuilder;
import builder.itextpdfgenerator.builder.components.TitleBuilder;

public class PdfBuilder {

    private final TitleBuilder titleBuilder;
    private final TextBuilder textBuilder;
    private final TableBuilder tableBuilder;

    public PdfBuilder(Builder builder) {
        this.titleBuilder = builder.titleBuilder;
        this.textBuilder = builder.textBuilder;
        this.tableBuilder = builder.tableBuilder;
    }

    public TitleBuilder getTitleBuilder() {
        return titleBuilder;
    }

    public TextBuilder getTextBuilder() {
        return textBuilder;
    }

    public TableBuilder getTableBuilder() {
        return tableBuilder;
    }

    public static class Builder {

        private TitleBuilder titleBuilder;
        private TextBuilder textBuilder;
        private TableBuilder tableBuilder;
    }

}
