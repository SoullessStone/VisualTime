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
        map.put("2", "zw�i");
        map.put("3", "dr�");
        map.put("4", "vieri");
        map.put("5", "f�fi");
        map.put("6", "s�chsi");
        map.put("7", "sibni");
        map.put("8", "achti");
        map.put("9", "n�ni");
        map.put("10", "z�ni");
        map.put("11", "eufi");
        map.put("12", "zw�ufi");
        return map;
    }

    @Override
    public HashMap<String, String> getMinutes() {
        HashMap<String, String> map = new HashMap<>();
        map.put("5", "f�f");
        map.put("10", "z�");
        map.put("15", "viertu");
        map.put("20", "zw�nzg");
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
        return "�s isch";
    }
}
