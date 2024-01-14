package builder.itextpdfgenerator.factories.components;

import com.itextpdf.layout.element.BlockElement;

public interface Component<T> {
    BlockElement get(T input);
}
