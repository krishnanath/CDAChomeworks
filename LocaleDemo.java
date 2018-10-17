import java.util.*;
public class LocaleDemo {
    public  static void main(String[] args)
    {
        System.out.println(Locale.getDefault());
        Locale l = Locale.getDefault();
        System.out.println(l.getLanguage());
        System.out.println(l.getDisplayLanguage());
        System.out.println(l.getCountry());
        System.out.println(l.getDisplayCountry());

        Locale[] loc = l.getAvailableLocales();
        for(int i=0; i<loc.length; i++){
            String language = loc[i].getLanguage();
            String displayLanguage = loc[i].getDisplayLanguage();
            String country = loc[i].getCountry();
            String locale_name = loc[i].getDisplayName();
            System.out.println(locale_name);

        }
    }
}