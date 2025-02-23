package C42;

public class testPerson {
        public static void main(String[] args) {
            Person p1 = new Person("thành", "34 nguyễn tạo");
            Student s1 = new Student("quân", "kí túc xá", "Computer Science", 2, 15000.0);
            Staff st1 = new Staff("VKU", "long", "nhà", 3000.0);

            System.out.println(p1);
            System.out.println(s1);
            System.out.println(st1);
        }
    }

