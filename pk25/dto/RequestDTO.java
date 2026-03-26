package dto;

public class RequestDTO {

    // khai bao thong tin dto
    private String inputFile;

    // constructor khong co tham so
    public RequestDTO() {
    }

    // constructor co tham so
    public RequestDTO(String inputFile) {
        this.inputFile = inputFile;
    }

    // getter and setter
    public String getInputFile() {
        return inputFile;
    }

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

}
