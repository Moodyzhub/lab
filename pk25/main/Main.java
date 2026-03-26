package main;

import controller.TextController;
import dto.RequestDTO;
import dto.ResponseDTO;
import util.TextUtils;
import constants.Message;
import java.io.BufferedReader;
import java.io.FileReader;


public class Main {

    public static void main(String[] args) {
        try {
            // tao request chua ten file dau vao
            RequestDTO request = new RequestDTO("input.txt");
            // khoi tao reader de doc file
            BufferedReader reader = new BufferedReader(new FileReader(request.getInputFile()));
            // khoi tao content de luu noi dung file
            StringBuilder content = new StringBuilder();
            String line;
            // doc tung dong trong file
            while ((line = reader.readLine()) != null) {
                // neu dong khong rong thi them vao content
                if (!line.trim().isEmpty()) {
                    content.append(line).append(" ");
                }
            }
            // dong file sau khi doc xong
            reader.close();
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
