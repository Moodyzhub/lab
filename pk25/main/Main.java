package main;

import controller.TextController;
import dto.RequestDTO;
import util.FileUtils;
import constants.Message;


public class Main {

    public static void main(String[] args) {
        try {
            // tao request chua ten file dau vao
            RequestDTO request = new RequestDTO("input.txt");
            // doc file bang ham ho tro tu FileUtils
            String content = FileUtils.readFile(request.getInputFile());
            // thong bao doc thanh cong
            System.out.println(Message.READ_SUCCESSFULLY);
            // khoi tao controller 
            TextController controller = new TextController();
            // goi controller de xu ly du lieu
            controller.processText(request, content.toString());
        } catch (Exception e) {
            // in thong bao loi
            System.err.println(Message.ERROR_FILE);
        }
    }
}
