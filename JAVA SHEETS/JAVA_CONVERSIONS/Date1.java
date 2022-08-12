package JAVA_CONVERSIONS;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//use the date pattern
        String strDate = "10/12/1997";
        Date date = null ;
        try {
            date = sdf.parse(strDate);
            System.out.println(strDate + "\t" + date);
        } catch (ParseException e) {
            //sdf parse method throws ParseException that need be handle.
            System.out.println(e.getMessage());
        }
    }
}
