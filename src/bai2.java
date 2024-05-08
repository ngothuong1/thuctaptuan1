import java.util.regex.*;

public class bai2 {
    public static void main(String[] args){
        String url = " https://tiki.vn/dien-thoai-may-tinh-bang/c1789?src=mega-menu";
        String regex = "^(http|https)://(www\\.)?[a-zA-Z0-9]+\\.[a-z]{2,6}(\\S*)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);
        if (matcher.matches()) {
            System.out.println("URL hợp lệ");
        } else {
            System.out.println("URL không hợp lệ");
        }
    }
}

