package builder.itextpdfgenerator.factories.styles.dtos;

import com.itextpdf.kernel.colors.Color;

public class StyleDTO {

    private final String letterType;
    private final int fontSize;
    private final Color color;

    private StyleDTO(Builder builder) {
        this.letterType = builder.letterType;
        this.fontSize = builder.fontSize;
        this.color = builder.color;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getLetterType() {
        return letterType;
    }

    public int getFontSize() {
        return fontSize;
    }

    public Color getColor() {
        return color;
    }

    public static class Builder {

        private String letterType;
        private int fontSize;
        private Color color;

        public Builder() {}

        public static Builder newInstance() {
            return new Builder();
        }

        public Builder letterType(String letterType) {
            this.letterType = letterType;
            return this;
        }

        public Builder fontSize(int fontSize) {
            this.fontSize = fontSize;
            return this;
        }

        public Builder color(Color color) {
            this.color = color;
            return this;
        }

        public StyleDTO build() {
            return new StyleDTO(this);
        }

    }

}
