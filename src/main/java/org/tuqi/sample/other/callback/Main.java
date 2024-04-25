package org.tuqi.sample.other.callback;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        doSomethingV1("Hello", message -> System.out.println(message + " success."));
        doSomethingV1("Hello", System.out::println);


        System.out.println("=====================================");
        System.out.println("==================V3===============");
        doSomethingV3("Hello", "hello"::equalsIgnoreCase);

        System.out.println("=====================================");
        System.out.println("==================V4===============");
//        doSomethingV4("Hello", () -> "Hello");
        doSomethingV4("Hello", new Supplier<String>() {
            @Override
            public String get() {
                return "Hello";
            }
        });
    }

    private static void doSomethingV1(String message, Callback callback) {
        System.out.println(message);
        callback.onSuccess(message);
    }

    private static void doSomethingV2(String message, Consumer<Callback> consumer) {
        System.out.println(message);
    }

    private static void doSomethingV3(String message, Predicate<String> predicate) {
        System.out.println(message);
        if (predicate.test(message)) {
            System.out.println("It's equals!!!");
        }
    }

    private static void doSomethingV4(String message, Supplier<String> supplier) {
        System.out.println(message);
        String s = supplier.get();
        if (s.equals(message)) {
            System.out.println("It's equals!!!");
        }
    }

}
