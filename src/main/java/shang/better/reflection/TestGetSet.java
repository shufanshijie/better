package shang.better.reflection;

import java.lang.reflect.Field;
import java.util.Arrays;
import static java.lang.System.out;

enum Tweedle { DEE, DUM }
/**
 * Created by shangjie-work on 2016/12/20.
 */
public class TestGetSet {
    public long chapters = 0;
    public String[] characters = { "Alice", "White Rabbit" };
    public Tweedle twin = Tweedle.DEE;

    public static void main(String... args) {
        TestGetSet test = new TestGetSet();
        String fmt = "%6S:  %-12s = %s%n";

        try {
            Class<?> c = test.getClass();

            Field chap = c.getDeclaredField("chapters");
            out.format(fmt, "before", "chapters", test.chapters);
            chap.setLong(test, 12);
            out.format(fmt, "after", "chapters", chap.getLong(test));

            Field chars = c.getDeclaredField("characters");
            out.format(fmt, "before", "characters",
                    Arrays.asList(test.characters));
            String[] newChars = { "Queen", "King" };
            chars.set(test, newChars);
            out.format(fmt, "after", "characters",
                    Arrays.asList(test.characters));

            Field t = c.getDeclaredField("twin");
            out.format(fmt, "before", "twin", test.twin);
            t.set(test, Tweedle.DUM);
            out.format(fmt, "after", "twin", t.get(test));

            // production code should handle these exceptions more gracefully
        } catch (NoSuchFieldException x) {
            x.printStackTrace();
        } catch (IllegalAccessException x) {
            x.printStackTrace();
        }
    }
}
