package builder.itextpdfgenerator.builder.components;

import builder.itextpdfgenerator.factories.components.factory.ComponentsFactory;
import builder.itextpdfgenerator.factories.components.impl.TableComponent;
import builder.itextpdfgenerator.factories.styles.factory.StylesFactory;
import com.itextpdf.layout.element.Table;

public class TableBuilder {

    private final Table table;

    public TableBuilder(Builder builder) {
        this.table = builder.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Table getTable() {
        return table;
    }

    public static class Builder {

        private StylesFactory stylesFactory;
        private Table table;

        public Builder() {}

        public Builder table(int rows) {
            ComponentsFactory componentsFactory = () -> "table";
            TableComponent tableComponent = (TableComponent) componentsFactory.getComponent();
            this.table = tableComponent.get(rows);
            return this;
        }

    }
}
