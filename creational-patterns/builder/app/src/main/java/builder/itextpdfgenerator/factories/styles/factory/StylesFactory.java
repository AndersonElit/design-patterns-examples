package builder.itextpdfgenerator.factories.styles.factory;

import builder.itextpdfgenerator.factories.styles.PdfStyle;
import builder.itextpdfgenerator.utils.InstancesUtil;

@FunctionalInterface
public interface StylesFactory {
    String get();
    default PdfStyle getStyle(String style) {
        return InstancesUtil.Styles.getStyle(style);
    }
}
