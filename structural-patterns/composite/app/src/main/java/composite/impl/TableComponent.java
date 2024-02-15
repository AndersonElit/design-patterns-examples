package composite.impl;

import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Table;
import composite.component.DocumentComponent;

public class TableComponent implements DocumentComponent {

    private final Table table;

    public TableComponent() {
        this.table = new Table(3);
    }

    @Override
    public void add(Document document) {
        document.add(table);
    }
}
