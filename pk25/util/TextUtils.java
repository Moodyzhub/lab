package util;

import constants.Message;
// import jdk.nashorn.internal.ir.RuntimeNode;
// import org.omg.CORBA.Request;
import dto.RequestDTO;
public final class TextUtils {

    private TextUtils() {
    }

    // ham chuan hoa khoang trang
    public static String normalizeSpaces(String text) {
        // xoa khoang trang dau va cuoi, thay nhieu khoang trang thanh 1
        text = text.trim().replaceAll("\\s+", " ");
        // tra ve text
        return text;
    }

    // ham chuan hoa dau cau
    public static String normalizePunctuation(String text) {
        // xoa khoang trang truoc dau
        text = text.replaceAll("\\s+,", ",");
        text = text.replaceAll("\\s+\\.", ".");
        text = text.replaceAll("\\s+:", ":");
        // dam bao chi co 1 khoang trang sau dau
        text = text.replaceAll(",\\s*", ", ");
        text = text.replaceAll("\\.\\s*", ". ");
        text = text.replaceAll(":\\s*", ": ");
        return text;
    }

    // ham chuan hoa dau ngoac kep
    public static String normalizeSentences(String text) {
        // tat ca chu ve chu thuong
        text = text.toLowerCase();
        // tach cau theo dau cham
        String[] sentences = text.split("\\. ");
        StringBuilder result = new StringBuilder();
        // duyet tung cau
        for (String sentence : sentences) {
            // neu do dai cau lon hon 0
            if (sentence.length() > 0) {
                // viet hoa chu dau cau
                sentence = Character.toUpperCase(sentence.charAt(0)) + sentence.substring(1);
            }
            result.append(sentence).append(". ");
        }
        text = result.toString().trim();
        // dam bao ket thuc bang dau cham
        if (!text.endsWith(".")) {
            text += ".";
        }
        return text;
    }

    // ham chuan hoa chu hoa dau cau
    public static String normalizeQuotes(String text) {
        // xoa khoang trang trong dau ngoac kep
        text = text.replaceAll("\\s*\"\\s*", "\"");
        return text;
    }

    public static void checkFileName(RequestDTO dto) throws Exception {
        if (dto.getInputFile().isEmpty()) {
            throw new Exception(Message.ERROR_FILE);
        }
    }

}
