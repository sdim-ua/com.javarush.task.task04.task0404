public class v {
    private static int catsCount = 0;

    public static void addNewCat() {
        //напишите тут ваш код
        Cat.catsCount ++;
        System.out.println (Cat.catsCount);
    }

    public static void main(String[] args) {
        addNewCat();
    }
}
