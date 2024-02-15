package composite.impl;

import com.itextpdf.layout.Document;
import composite.component.DocumentComponent;

import java.util.ArrayList;
import java.util.List;

public class SectionComponent implements DocumentComponent {

    private List<DocumentComponent> components = new ArrayList<>();

    public void addComponent(DocumentComponent component) {
        components.add(component);
    }

    @Override
    public void add(Document document) {
        for (DocumentComponent component : components) {
            component.add(document);
        }
    }
}
