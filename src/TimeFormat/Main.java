package TimeFormat;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        String pattern = "EEE MMM dd yyyy HH:mm:ss 'GMT'Z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println("SimpleDateFormat: " + date);

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("DateTimeFormatter: " + now.format(DateTimeFormatter.ofPattern("EEE MMM dd yyyy HH:mm:ss 'GMT'Z")));
    }
}
