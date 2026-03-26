package view;

import dto.ResponseDTO;

public class TextView {
    private ResponseDTO response;

    public void setResponse(ResponseDTO response) {
        this.response = response;
    }

    
    

    public void display() {
        // lay noi dung tu responseDTO
        System.out.println(response.getContent());
    }
}
