package languages;

import java.util.HashMap;

/**
 * Created by U115726 on 09.04.2015.
 */
public abstract class AbstractLanguageGenerator {
    public abstract HashMap<String, String> getHours();
    public abstract HashMap<String, String> getMinutes();
    public abstract String getPast();
    public abstract String getBefore();
    public abstract String getHalf();
    public abstract String getFront();
}
