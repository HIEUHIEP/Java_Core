import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
//      I: Method Reference
//      * Reference to method static: Math::pow
//      * Reference to method instance: str::length
//      * Reference to method constructor: Car::new

//      II: Stream Method
//      1. Filter
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers); // Kết quả: [2, 4, 6, 8, 10]

//      2. Mapping - chuyển kiểu
        List<String> names = Arrays.asList("John", "Jane", "Alice", "Bob");
        List<Integer> nameLengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(nameLengths); // Kết quả: [4, 4, 5, 3]

//      3. Mapping - flatMap()

//      4. Distinct()
        List<Integer> numbersDistinct = Arrays.asList(1, 2, 3, 3, 4, 4, 5, 5);
        List<Integer> distinctNumbers = numbersDistinct.stream()
                .distinct()
                .collect(Collectors.toList());

//      5. Sorted() - Sếp tăng dần
        List<Integer> numbersSorted = Arrays.asList(5, 2, 9, 1, 7, 3);
        List<Integer> sortedNumbers = numbersSorted.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNumbers); // Kết quả: [1, 2, 3, 5, 7, 9]

//      6. Sorted(Comparator<T> comparator)
        List<Person> persons = Arrays.asList(
                new Person("John", 30),
                new Person("Alice", 25),
                new Person("Bob", 35),
                new Person("Charlie", 20)
        );

        List<Person> sortedPersons = persons.stream()
                .sorted(Comparator.comparing(Person::getAge)) // Sắp xếp theo tuổi
                .collect(Collectors.toList());
        System.out.println(sortedPersons);
        // Kết quả: [Person [name=Charlie, age=20], Person [name=Alice, age=25],
        //          Person [name=John, age=30], Person [name=Bob, age=35]]

//      7. peek(Consumer<T> action): Thực hiện một hành động trên mỗi phần tử và trả về stream đầu vào.
        List<Integer> numberspeek = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumberspeek = numberspeek.stream()
                .filter(n -> n % 2 == 0) // Lọc các số chẵn
                .peek(System.out::println) // In ra các số đã được lọc
                .collect(Collectors.toList());
        System.out.println(evenNumbers); // Kết quả: [2, 4]

//      8. limit(long maxSize): Giới hạn số phần tử được trả về trong stream.
//      9. skip(long n): trả về 1 stream nhưng bỏ qua n phần tử đầu tiên từ stream ban đầu.
//      10. forEach(Consumer<T> action): Thực hiện một hành động trên mỗi phần tử.
//      11. toArray(): Chuyển stream thành một mảng.

//      12. reduce(T identity, BinaryOperator<T> accumulator): Tính toán kết quả của các phần tử trong stream bằng cách sử dụng một phép tính nhị phân được chỉ định bởi accumulator, với giá trị ban đầu được cung cấp bởi identity.
        List<Integer> numbersreduce = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = numbersreduce.stream()
                .reduce(0, (a, b) -> a + b); // Tính tổng của các số nguyên trong Stream
        System.out.println(sum); // Kết quả: 15

//      13. collect(Collector<T, A, R> collector): Tính toán kết quả của các phần tử trong stream bằng cách sử dụng một đối tượng Collector.
        List<String> namescollect = Arrays.asList("John", "Jane", "Alice", "Bob");
        String joinedNames = namescollect.stream()
                .collect(Collectors.joining(", "));
        System.out.println(joinedNames); // Kết quả: "John, Jane, Alice, Bob"

//        14. anyMatch(Predicate<T> predicate): Kiểm tra xem có phần tử nào trong stream thỏa mãn điều kiện được đưa ra bởi predicate hay không.
//        15. allMatch(Predicate<T> predicate): Kiểm tra xem tất cả các phần tử trong stream đều thỏa mãn điều kiện được đưa ra bởi predicate hay không.
//        16. noneMatch(Predicate<T> predicate): Kiểm tra xem không có phần tử nào trong stream thỏa mãn điều kiện được đưa ra bởi predicate hay không.
//        17. findFirst(): Trả về phần tử đầu tiên trong stream.
//        18. findAny(): Trả về bất kỳ phần tử nào trong stream.
//        19. count(): Đếm số phần tử trong stream.
//        20. max(Comparator<T> comparator): Trả về phần tử lớn nhất theo thứ tự được chỉ định bởi comparator. => numbers.stream().max(Integer::compareTo);
//        21. min(Comparator<T> comparator): Trả về phần tử nhỏ nhất theo thứ tự được chỉ định bởi comparator. => numbers.stream().min(Integer::compareTo);
//        22. forEachOrdered(Consumer<T> action): Thực hiện một hành động trên mỗi phần tử theo thứ tự được đảm bảo bởi stream theo thứ tự đúng (ordered). => là thứ tự khai báo.
//        23. isParallel(): Kiểm tra xem stream có được thực thi song song (parallel) hay không. .stream() => Không parallel, parallelStream() => có parallel
//        24. sequential(): Chuyển đổi stream hoạt động ở chế độ song song (parallel) sang chế độ tuần tự (sequential).
//        25. parallel(): Chuyển đổi stream hoạt động ở chế độ tuần tự (sequential) sang chế độ song song (parallel).
//        26. unordered(): Chuyển đổi stream thành một stream không đảm bảo thứ tự.
//        27. onClose(Runnable closeHandler): Thêm một hàm xử lý được thực thi khi stream bị đóng.
//        28. close(): Đóng stream và giải phóng tài nguyên.
//        29. iterator(): Trả về một iterator cho stream.
//        30. spliterator(): Trả về một Spliterator cho stream.
//        Stream of primitive type:
//        31. mapToInt(): Chuyển đổi các phần tử của một Stream thành các giá trị kiểu nguyên
//        Tạo Stream
//        1. stream(): Tạo Stream từ một collection (tập hợp) như List, Set hoặc Map.
//        2. parallelStream(): Tạo Stream song song từ một collection.
//        3. of(T... values): Tạo Stream từ một mảng giá trị.
//        4. generate(Supplier<T> s): Tạo Stream vô hạn bằng cách sử dụng một Supplier.
//        5. iterate(T seed, UnaryOperator<T> f): Tạo Stream vô hạn bằng cách sử dụng một hạt giống và một UnaryOperator.
//        6. concat(Stream<? extends T> a, Stream<? extends T> b): Nối hai Stream lại với nhau.
//        7. empty(): Tạo Stream trống.
//        8. ifPresent() : Sử dụng để kiểm tra xem có phần tử trong Stream không và thực thi một tác vụ xác định nếu có.

//      III: Default Methods
//        Ứng dụng ở interface, khi 1 interface có 10 class implement. Ta muốn thêm 1 method mới vào interface nhưng không muốn bổ sung method mới đó cho toàn bộ 10 class implement. => dùng default method

    }
}