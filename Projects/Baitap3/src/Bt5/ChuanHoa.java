package Bt5;
public class ChuanHoa {
    public String vietHoa(String x, char c) {
        x=x.toLowerCase();
        boolean flag=true;
        StringBuilder str = new StringBuilder("");
        for(int i=0;i<x.length();i++) {
            char y=x.charAt(i);
            if(y==c)
                flag=true;
            if(flag && Character.isAlphabetic(y)) {
                y=Character.toUpperCase(y);
                flag=false;
            }
            str.append(y);
        }
        return str.toString();
    }
    public String chuanHoa(String x) {
        x=x.trim();
        x=x.replaceAll("\\s+", "\\ ");
        x=x.replaceAll(" \\!", "\\!");
        x=x.replaceAll(" \\?", "\\?");
        x=x.replaceAll("\\.", "\\. ");
        x=x.replaceAll("\\!", "\\! ");
        x=x.replaceAll("\\?", "\\? ");
        x=x.replaceAll("\\.", "\\. ");
        x=x.replaceAll("\\s+", "\\ ");
        x=vietHoa(x,'.');
        x=vietHoa(x,'!');
        x=vietHoa(x,'?');
        return x;
    }
}
