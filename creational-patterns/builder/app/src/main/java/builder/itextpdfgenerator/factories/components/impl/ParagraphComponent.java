package builder.itextpdfgenerator.factories.components.impl;

import builder.itextpdfgenerator.factories.components.Component;
import com.itextpdf.layout.element.Paragraph;

public class ParagraphComponent implements Component<String> {
    @Override
    public Paragraph get(String text) {
        return new Paragraph(text);
    }
}
