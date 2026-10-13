import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1
        int[] arrays = new int[5];

        // 2
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // 3
        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Bob");

        for (String n : names) {
            System.out.println(n);
        }

        // 4
        Student s = new Student();
        System.out.println(s.getName());

        // 5
        Dog d = new Dog();
        d.makeSound();
    }
}