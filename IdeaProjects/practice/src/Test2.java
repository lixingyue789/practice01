/**
 * Author:lxy1999
 * Created:2019/8/15
 */

import java.lang.reflect.Field;

class MyClass<T, E> {
    private T message;
    private E text;

    public E getText() {
        return text;
    }

    public void setText(E text) {
        this.text = text;
    }

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }

    public void testMethod1(T t) {
        System.out.println(t);
    }
}

public class Test2 {
    public static void main(String[] args) {
        MyClass<String, Integer> myClass1 = new MyClass<>();
        Class cls = myClass1.getClass();
        System.out.println(cls);
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}