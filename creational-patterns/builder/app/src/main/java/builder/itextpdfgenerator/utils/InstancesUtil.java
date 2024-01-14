package builder.itextpdfgenerator.utils;

import builder.itextpdfgenerator.factories.components.Component;
import builder.itextpdfgenerator.factories.components.impl.ParagraphComponent;
import builder.itextpdfgenerator.factories.components.impl.TableComponent;
import builder.itextpdfgenerator.factories.styles.PdfStyle;
import builder.itextpdfgenerator.factories.styles.impl.FontLetter;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InstancesUtil {
    private InstancesUtil() {
    }

    public static final class Components {
        private static final Map<String, Component> components = new HashMap<>();

        static {
            components.put("paragraph", new ParagraphComponent());
            components.put("table", new TableComponent());
        }

        public static Component getComponent(String component) {
            return Optional.ofNullable(components.get(component))
                    .orElseThrow(() -> new RuntimeException("component " + component + " is not supported."));
        }
    }

    public static final class Styles {
        private static final Map<String, PdfStyle> styles = new HashMap<>();

        static {
            styles.put("fontLetter", new FontLetter());
        }

        public static PdfStyle getStyle(String style) {
            return Optional.ofNullable(styles.get(style))
                    .orElseThrow(() -> new RuntimeException("style " + style + " is not supported."));
        }

    }

}
