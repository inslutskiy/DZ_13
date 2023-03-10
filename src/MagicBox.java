import java.util.Random;

public class MagicBox<T> {

    protected T[] items;

    public MagicBox (int x) {
        T[] items = (T[]) new Object[x];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка еще не полна. Осталось заполнить " + (items.length - i) + " ячеек");
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }



}
