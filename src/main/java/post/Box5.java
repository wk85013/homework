package post;

public class Box5 extends Box {
    static float length = 39.5f, width = 27.5f, height = 23f;

    public Box5() {
        super();
    }

    @Override
    public boolean validate(float length, float width, int height) {
        return !(this.length < length) && !(this.width < width) && !(this.height < height);

    }
}
