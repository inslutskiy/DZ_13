public class Main {
    public static void main(String[] args) {

        MagicBox box1 = new MagicBox();

        for (int i = 0; i <= 60; i += 5) {
            System.out.println(box1.add(i));
        }

        System.out.println(box1.pick());
    }
}