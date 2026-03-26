package model;

// model dai dien cho 1 tai lieu
public class Document {

    // khai bao thong tin
    private String text;

    // constructor khong co tham so
    public Document() {
    }

    // constructor co tham so
    public Document(String text) {
        this.text = text;
    }

    // getter and setter
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
