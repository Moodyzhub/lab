package dto;

public class ResponseDTO {

    // khai bao thong tin dto
    private String content;

    // constructor khong co tham so
    public ResponseDTO() {
    }

    // constructor co tham so
    public ResponseDTO(String content) {
        this.content = content;
    }

    // getter and setter
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
