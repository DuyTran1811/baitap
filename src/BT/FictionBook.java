package BT;

public class FictionBook extends Books implements Discount {
    private String category;
    private float promotionalPrice;

    public FictionBook() {
    }

    public FictionBook(String category, float promotionalPrice) {
        this.category = category;
        this.promotionalPrice = promotionalPrice;
    }

    public FictionBook(String bookCode, String name,
                       float price, String author, String category, float promotionalPrice) {
        super(bookCode, name, price, author);
        this.category = category;
        this.promotionalPrice = promotionalPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPromotionalPrice() {
        return promotionalPrice;
    }

    public void setPromotionalPrice(float promotionalPrice) {
        this.promotionalPrice = promotionalPrice;
    }

    @Override
    public float setDiscount(int percent) {
        return promotionalPrice = getPrice() * (1 - percent)/100;
    }
}
