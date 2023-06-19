public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
         task1(8);
        System.out.println("task 2");
         task2(10);
        System.out.println("\ntask 3");
        task3(8,'#');
    }
    public static void task1(int i) {
        System.out.println(i*i);
    }
    public static void task2(int i) {
       for (int j =0; j <i; j++) {
           System.out.print("*");
       }
    }
    public static void task3(int i,char ch) {
        for (int j =0; j <i; j++) {
            System.out.print(ch);
        }
    }
}
