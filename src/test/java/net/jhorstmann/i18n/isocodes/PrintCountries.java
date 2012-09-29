package net.jhorstmann.i18n.isocodes;

import java.util.Collections;
import java.util.Locale;
import java.util.ResourceBundle;

public class PrintCountries {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("net.jhorstmann.i18n.isocodes.ISO15924", Locale.GERMANY);
        System.out.println(bundle.getClass().getName());
        for (String key : Collections.list(bundle.getKeys())) {
            System.out.println(key + "=" + bundle.getString(key));
        }
    }

}
