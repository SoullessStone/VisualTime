package languages;

import java.util.HashMap;

/**
 * Created by U115726 on 09.04.2015.
 */
public class HochdeutschGenerator extends AbstractLanguageGenerator {
    @Override
    public HashMap<String, String> getHours() {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "eins");
        map.put("2", "zwei");
        map.put("3", "drei");
        map.put("4", "vier");
        map.put("5", "fünf");
        map.put("6", "sechs");
        map.put("7", "sieben");
        map.put("8", "acht");
        map.put("9", "neun");
        map.put("10", "zehn");
        map.put("11", "elf");
        map.put("12", "zwölf");
        return map;
    }

    @Override
    public HashMap<String, String> getMinutes() {
        HashMap<String, String> map = new HashMap<>();
        map.put("5", "fünf");
        map.put("10", "zehn");
        map.put("15", "viertel");
        map.put("20", "zwanzig");
        return map;
    }

    @Override
    public String getPast() {
        return "nach";
    }

    @Override
    public String getBefore() {
        return "vor";
    }

    @Override
    public String getHalf() {
        return "halb";
    }

    @Override
    public String getFront() {
        return "Es ist";
    }
}
