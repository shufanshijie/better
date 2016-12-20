package shang.better.reflection;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Created by shangjie-work on 2016/12/20.
 */
public class TestClasses {

    @Test
    public void test() throws ClassNotFoundException, NoSuchFieldException {
        boolean b = true;
        Class c = boolean.class;

        Class testClass = Class.forName("shang.better.reflection.TestClasses");
        System.out.println(testClass);//class shang.better.reflection.TestClasses
        Class d = Class.forName("[D");
        System.out.println(d);//class [D
        Class db = double[].class;
        System.out.println(db);//class [D
        System.out.println(d == db);//true
        Class doubleType = Double.TYPE;
        System.out.println(doubleType);//double
        Class voidType = Void.TYPE;
        System.out.println(voidType);//void

        Class[] classes = Character.class.getClasses();
        System.out.println(Arrays.toString(classes));//[class java.lang.Character$Subset, class java.lang.Character$UnicodeBlock, class java.lang.Character$UnicodeScript]
        System.out.println(Arrays.toString(Character.class.getDeclaredClasses()));//[class java.lang.Character$CharacterCache, class java.lang.Character$Subset, class java.lang.Character$UnicodeBlock, class java.lang.Character$UnicodeScript]

        Field f = System.class.getField("out");
        System.out.println(f.getDeclaringClass());//class java.lang.System

        Object o = new Object() {
            public void m() {}
        };
        Class obj = o.getClass().getEnclosingClass();
        System.out.println(obj);//class shang.better.reflection.TestClasses
    }
}
