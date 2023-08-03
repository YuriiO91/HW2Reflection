import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            Total total = new Total();
            Method method = Total.class.getDeclaredMethod("addition", int.class, int.class);
            TestAnnotation annotation = method.getAnnotation(TestAnnotation.class);
            method.invoke(total,annotation.param1(),annotation.param2());
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}