import java.util.List;
import java.util.stream.Stream;

public class Viblo {
    public static void main(String[] args) {
//        1) Java 9: Interface private method
//        Có thể tạo private method dùng chung cho các default method (abstract method ko có nội dung)
//        Như vậy, interface đã có non-abstract method, private/public static method, public static variable. Về mặt implement đã không còn khác nhau quá nhiều giữa interface và abstract class

//        2) Java 9: CompletableFuture API improvement
//        static Executor delayedExecutor(long delay, TimeUnit unit);  => Thực thi task sau 1 khoản time delay.
//        static Executor delayedExecutor(long delay, TimeUnit unit, Executor executor);

//        CompletableFuture<T> orTimeout(long timeout, TimeUnit unit); => throw exception nếu process time quá khoảng thời gian chỉ định.
//        CompletableFuture<T> completeOnTimeout(T value, long timeout, TimeUnit unit); => Không throw mà trả về giá trị default value.

//        3) Java 9: Stream API improvement
//        Stream<T> takeWhile(Predicate<? super T> predicate); => về tất cả các element thỏa mãn điều kiện, nê gặp phần tử không thoả điều kiện, dừng luôn. (khác 1 chút so với filter)
//        Stream<T> dropWhile(Predicate<? super T> predicate); => loại bỏ tất cả các element thỏa mãn điều kiện và dừng lại cho đến khi gặp phần tử không thỏa mãn. (gặp phần tử không thoả thì các phần tử sau ko loại bỏ nữa)
//        static <T> Stream<T> iterate(T seed, Predicate<? super T> hasNext, UnaryOperator<T> next); => Tạo 1 Stream với 3 param (element đầu tiên, điều kiện để dừng tạo element, cách tạo data cho element tiếp theo.)
//        static <T> Stream<T> ofNullable(T t); => nó sẽ trả về stream chứa element đó nếu element not null, còn không sẽ trả về empty stream

//        4) Java 9: Collection factory
//        List<String> values = List.of("Hello", "World"); => Tạo List 1 cách đơn giản hơn.

//        5) Java 9: Java Module system => là 1 cấu trụúc, GG đi =))

//        6) Java 10: var => Kiểu dư liệu là kiểu của data nhận được. hoạt động lúc compile time. (Trong java11, có thể khai báo var trong param của lambda.)
//        Lombok cũng có var, và cả val (final var)

//        7) Java 11: String API improvement
//        7.1) isBlank() : nó sẽ = trim() + isEmpty()
//        7.2) repeat(n) : method này thực hiện nối chuỗi với chính nó theo số lần chỉ định
//        7.3) strip() : là trim() nhưng sịn hơn. performance tốt hơn. và trim cả  \u0040 to \u0020
//        7.4 lines() : method này giúp chúng ta chia string thành stream of lines phân cách nhau bằng \n

//        8) Java 12: String API improvement
//        8.1) indent(): chuỗi ban đầu được split thành nhiều line giống method lines(), sau đó mỗi line được indent (thêm khoảng trắng) dựa trên giá trị truyền vào [  value]

//        8.2) transform(): apply function lên string hiện tại để tạo ra một kết quả mới
//        var result = "Hello".transform(input -> input + " world");
//        System.out.println(result); // Hello world


//        9) Java 14: Switch expression
//        ternary operator
//        var isMonday = day == Day.Monday ? true : false;
//
//        switch expression
//        var isMonday = switch (day) {
//            case MONDAY -> true;
//            default -> false;
//        };


//        10) Java 14: NullPointerException
//        -XX:+ShowCodeDetailsInExceptionMessages : show log nullpointer dể đọc hơn. từ java 17. nó là default.

//        11) Java 15: Text block

//        Với Java 15 trở xuống, nếu muốn tạo một String và xuống dòng
//        var string = "Line 1\n"
//                + "Line 2\n"
//                + "Line 3";

//        Với Java 15
//        var string = """
//             Line 1
//             Line 2
//             Line 3
//             """;

//        12) Java 16: Pattern matching for instanceof

//        Kiểm tra 1 obj có phải là kiểu String hay không. và ép kiểu nó.
//        Object object = "";
//        if (object instanceof String) {
//            var string = (String) object;
//            System.out.println(string);
//        }

//        Java 16 hổ trợ ép kiểu luôn
//        Object object = "";
//        if (object instanceof String string) {
//            System.out.println(string);
//        }

//        13) Java 16: Record type

//        record: thay thế cho getter, setter, constructor
//        public record Person(String fullName, String address) {
//
//            public Person() {
//                this("defaultValue", "defaultValue");
//            }
//        }

//        14) JDK 17: Sealed class : chỉ cho phép class Dog đc phép implements Runnable.

//        sealed interface Runnable permits Dog {
//            void run();
//        }






    }
}
