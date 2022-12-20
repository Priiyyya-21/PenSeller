public class PenController {

    PenModel pen;
    PenView penView;

    void setPen(PenModel pen) {
        this.pen = pen;
    }

    void setPenView(PenView penView) {
        this.penView = penView;
    }

    public void setPenName(String name) {
        pen.setName(name);
    }

    public void setPenBrand(String brand) {
        pen.setBrand(brand);
    }

    public void setPenPrice(double price) {
        pen.setPrice(price);
    }

    public void setPenColor(String color) {
        pen.setColor(color);
    }

    int sellPen(int quantity) {
        if (PenModel.quantity >= quantity) {
            PenModel.quantity -= quantity;
            return -1;
        } else {
            return PenModel.quantity;
        }
    }

    void updateView() {
        penView.printPenDetails(pen.getName(), pen.getBrand(), pen.getPrice(), pen.getColor());
    }


}
