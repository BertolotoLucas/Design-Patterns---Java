package br.com.lucasbertoloto.builder;

public class ClassWithBuilder {

    private boolean attr1;
    private boolean attr2;
    private boolean attr3;
    private boolean attr4;

    public static class Builder {
        //Required
        private final boolean attr1;

        //Optional
        private boolean attr2 = false;
        private boolean attr3 = false;
        private boolean attr4 = false;

        public Builder(boolean attr1) {
            this.attr1 = attr1;
        }

        //return the Builder whit Attr2 set!
        //the same occurs with the others attributes
        public Builder setAttr2(boolean attr2) {
            this.attr2 = attr2;
            return this;
        }

        public Builder setAttr3(boolean attr3) {
            this.attr3 = attr3;
            return this;
        }

        public Builder setAttr4(boolean attr4) {
            this.attr4 = attr4;
            return this;
        }

        //if the client is satisfied with its object, build this to the class model
        public ClassWithBuilder build() {
            return new ClassWithBuilder(this);
        }
    }

    private ClassWithBuilder(Builder builder) {
        this.attr1 = builder.attr1;
        this.attr2 = builder.attr2;
        this.attr3 = builder.attr3;
        this.attr4 = builder.attr4;
    }
}
