package builder.itextpdfgenerator.factories.components.impl;

import builder.itextpdfgenerator.factories.components.Component;
import com.itextpdf.layout.element.Table;

public class TableComponent implements Component<Integer> {
    @Override
    public Table get(Integer rows) {
        return new Table(rows);
    }
}
