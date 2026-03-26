package repository;

import constants.Message;
import dto.RequestDTO;
import dto.ResponseDTO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import model.Document;
import util.TextUtils;

public class FileRepository {

    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    // tao document tu noi dung van ban
    public Document createDocument() {
        return new Document(content);
    }

    // ham xu ly doc file va normalize
    public ResponseDTO processText(RequestDTO dto, String content) throws Exception {
        setContent(content);
        // khai bao document de xu ly doc file
        Document document = createDocument();
        // khai bao van ban
        String text = document.getText();
        // kiem tra file rong
        if (text.trim().isEmpty()) {
            throw new Exception(Message.ERROR_IS_EMPTY);
        }
        // normalize
        text = TextUtils.normalizeSpaces(text);
        text = TextUtils.normalizePunctuation(text);
        text = TextUtils.normalizeQuotes(text);
        text = TextUtils.normalizeSentences(text);
        return new ResponseDTO(text);
    }

}
