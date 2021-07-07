package co.com.ias.handyman.applicationServiceReport.commons;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Validate {

    public static void notNull(Object value, String message) {
        if(value==null || value == "0"){
            throw new NullPointerException(message);
        }
    }
    public static void isTrue (boolean condition, String message){
        if(!condition){
            throw new IllegalArgumentException(message);
        }
    }

    public static void validateDate (NonEmptyStartDate startDate, NonEmptyFinishDate finishDate, String message){
        LocalDateTime start, finish;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
        start= LocalDateTime.parse(startDate.toString(), DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm"));
        finish = LocalDateTime.parse(finishDate.toString(),DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm"));
         if (finish.isBefore(start)){
            throw new IllegalArgumentException(message);
         }
    }


}
