package builder.itextpdfgenerator.builder.components;

import builder.itextpdfgenerator.factories.components.factory.ComponentsFactory;
import builder.itextpdfgenerator.factories.components.impl.ParagraphComponent;
import builder.itextpdfgenerator.factories.styles.factory.StylesFactory;
import com.itextpdf.layout.element.Paragraph;

public class TitleBuilder {
    private final Paragraph paragraph;

    private TitleBuilder(Builder builder) {
        this.paragraph = builder.paragraph;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Paragraph getParagraph() {
        return paragraph;
    }

    public static class Builder {
        private StylesFactory stylesFactory;
        private Paragraph paragraph;

        public Builder() {}

        public Builder paragraph(String title) {
            ComponentsFactory componentsFactory = () -> "paragraph";
            ParagraphComponent component = (ParagraphComponent) componentsFactory.getComponent();
            this.paragraph = component.get(title);
            return this;
        }

        public TitleBuilder build() {
            return new TitleBuilder(this);
        }

    }

}
