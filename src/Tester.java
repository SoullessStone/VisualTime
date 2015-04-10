
/**
 * Created by U115726 on 09.04.2015.
 */

import java.time.LocalTime;

import languages.*;

public class Tester {

    public static void main(String[] args) {
        TimeGenerator tg = new TimeGenerator(LocalTime.now(), new BerndeutschGenerator());
        System.out.println(tg);
    }

}
