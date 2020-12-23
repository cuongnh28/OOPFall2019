package String;

public class CHxau_C2 {
    //Viết hoa ký tự đầu câu có dấu chấm câu

    private String toCapitalize(String para, char punctuation) {

//para là đoạn cần chuẩn hóa
//punctuation dấu câu: . ? !
        boolean isCap = true;

        char c;

        StringBuilder strb = new StringBuilder("");

        for (int i = 0; i < para.length() - 1; i++) {

            c = para.charAt(i);

            if (c == punctuation) {

                isCap = true;
                
            }

            if (isCap && Character.isAlphabetic(c)) {

                c = Character.toUpperCase(c);

                isCap = false;

            }

            strb.append(c);

        }

        return strb.toString();

    }

    public String chuanhoa(String line) {

        String out = "";

//dòng lệnh này có thể bỏ vì có tên riêng viết hoa
        line = line.toLowerCase();

//mỗi từ cách 1 khoảng cách
        line = line.replaceAll("\\s+", " ");

        line = line.replaceAll("\\.", "\\. ");

        line = line.replaceAll(" \\.", "\\.");

        line = line.replaceAll("\\!", "\\! ");

        line = line.replaceAll(" \\!", "\\!");

        line = line.replaceAll("\\?", "\\? ");

        line = line.replaceAll(" \\?", "\\?");

        line = line.replaceAll(" \\,", "\\,");

        line = line.replaceAll("\\,", "\\, ");

        line = line.replaceAll("\\s+", " ");

        line = line.trim();

        out = line;

        out = toCapitalize(out, '.');

        out = toCapitalize(out, '!');

        out = toCapitalize(out, '?');

        if (out.charAt(out.length() - 1) != '.') {

            out = out + ".";

        }

        return out;

    }
}
