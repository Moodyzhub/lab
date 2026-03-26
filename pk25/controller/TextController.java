package controller;

import dto.RequestDTO;
import dto.ResponseDTO;
import repository.FileRepository;
import view.TextView;

public class TextController {

    // khai bao repository va view
    private FileRepository repository = new FileRepository();
    private TextView view = new TextView();

    // ham doc file
    public void processText(RequestDTO request, String content) throws Exception {
        // goi repository de xu ly du lieu
        ResponseDTO response = repository.processText(request, content);
        // hien thi ket qua thong qua view
        view.setResponse(response);
        view.display();
    }

}
