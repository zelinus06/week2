import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Tạo HashSet để lưu trữ các đối tượng Person
        Set<Person> personSet = new HashSet<>();

        // Thêm các đối tượng Person vào HashSet
        personSet.add(new Person("Thai", 23));
        personSet.add(new Person("Long", 25));
        personSet.add(new Person("Thai", 23));


        // In ra các phần tử trong HashSet
        for (Person person : personSet) {
            System.out.println(person);
        }
    }
}
