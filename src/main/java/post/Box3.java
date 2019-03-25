package post;

public class Box3 extends Box {
    static float length = 23f, width = 14f, height = 13f;

    public Box3() {
        super();
    }

    @Override
    public boolean validate(float length, float width, int height) {
        return !(this.length < length) && !(this.width < width) && !(this.height < height);
    }
}
