package String;

public class CHxau_C1 {
    public String chuanhoa(String str) {
        str=str.trim();
        
        //str=str.replaceAll("\\s+", " ");

        str=str.replaceAll("\\.", "\\. ");
        
        str=str.replaceAll(" \\.", "\\.");

        str=str.replaceAll("\\!", "\\! ");

        str=str.replaceAll(" \\!", "\\!");

        str=str.replaceAll("\\?", "\\? ");

        str=str.replaceAll(" \\?", "\\?");

        str=str.replaceAll(" \\,", "\\,");

        str=str.replaceAll("\\,", "\\, ");

        str=str.replaceAll("\\s+", " ");
        
        str=str.toLowerCase();
        String temp[]=str.split(" ");
        str="";
        temp[0]=String.valueOf(temp[0].charAt(0)).toUpperCase() + temp[0].substring(1);
        for(int i=0;i<temp.length;i++) {
            // Viet hoa ku tu sau dau ".,!,?" viet lien sau chu.
            if( (i>0) && (temp[i-1].charAt(temp[i-1].length()-1) == '.' 
                        || temp[i-1].charAt(temp[i-1].length()-1) == '!' 
                        || temp[i-1].charAt(temp[i-1].length()-1) == '?')) {
                    temp[i]=String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
                }
            str+=temp[i];
            /*  if(i<temp.length-1) {
                //xoa bo dau cach truoc dau .,"?!
                if(temp[i+1].charAt(0) != ',' && temp[i+1].charAt(0) != '.'
                        && temp[i+1].charAt(0) != '!' && temp[i+1].charAt(0) != '?'
                        && temp[i+1].charAt(0) != ':')
                    str+=" ";
                // Viet hoa ku tu sau dau ".,!,?" viet khong lien sau chu.
                if(temp[i].charAt(0) == '.' || temp[i].charAt(0) == '!' 
                        || temp[i].charAt(0) == '?') {
                    temp[i+1]=String.valueOf(temp[i+1].charAt(0)).toUpperCase() + temp[i+1].substring(1);
                } 
            }     */
                if(i<temp.length-1) {
                    str+=" ";
                }
        }
        return str;
    }
}
