package composite.impl;

import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import composite.component.DocumentComponent;

public class ParagraphComponent implements DocumentComponent {

    private final String paragraph;

    public ParagraphComponent(String paragraph) {
        this.paragraph = paragraph;
    }

    @Override
    public void add(Document document) {
        document.add(new Paragraph(paragraph));
    }

}
