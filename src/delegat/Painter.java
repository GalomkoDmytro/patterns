package delegat;

public class Painter {
    Graphic graphic;

    void setGraphic(Graphic graphic) {
        this.graphic = graphic;
    }

    void draw() {
        graphic.draw();
    }
}
