public abstract class Shape {
    private int width;
    private int height;

    public Shape(){

    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return this.height;
    }
    public int getWidth() {
        return this.width;
    }
    public int getArea(){
        return this.width*this.height;
    }
}
