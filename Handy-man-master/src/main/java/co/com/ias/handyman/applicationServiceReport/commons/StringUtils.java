package co.com.ias.handyman.applicationServiceReport.commons;

public class StringUtils {

    public static boolean antNon (String value){
        String trimmed =value.trim();
        return trimmed.length()>0;

    }

    public static boolean nonBlank (String value){
       String trimmed =value.trim();
        return trimmed.length()>0;
    }

}
