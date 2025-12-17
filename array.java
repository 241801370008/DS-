
public class array {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        String[] names = {"Prasad", "Rahul", "Anita"};

        for (int n : numbers) System.out.print(n + " ");
        System.out.println();

        for (String name : names) System.out.print(name + " ");
        System.out.println();

        float[] nums = new float[3];
        for (float f : nums) System.out.print(f + " ");
        System.out.println();

        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) num[i] = i * 2;
        for (int v : num) System.out.print(v + " ");
        System.out.println();

        String[] users = new String[5];
        users[0] = "Admin";
        users[1] = "User1";
        users[2] = "User2";

        for (String u : users) System.out.print(u + " ");
    }
}