package languages;

import java.util.HashMap;

/**
 * Created by U115726 on 09.04.2015.
 */
public class BerndeutschGenerator extends AbstractLanguageGenerator {
    @Override
    public HashMap<String, String> getHours() {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "eis");
        map.put("2", "zwöi");
        map.put("3", "drü");
        map.put("4", "vieri");
        map.put("5", "füfi");
        map.put("6", "sächsi");
        map.put("7", "sibni");
        map.put("8", "achti");
        map.put("9", "nüni");
        map.put("10", "zäni");
        map.put("11", "eufi");
        map.put("12", "zwöufi");
        return map;
    }

    @Override
    public HashMap<String, String> getMinutes() {
        HashMap<String, String> map = new HashMap<>();
        map.put("5", "füf");
        map.put("10", "zä");
        map.put("15", "viertu");
        map.put("20", "zwänzg");
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
        return "haubi";
    }

    @Override
    public String getFront() {
        return "Äs isch";
    }
}
