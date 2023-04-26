public class testAnimals {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog doge = new Dog();
        doge.run(300);
        cat.run(300);
        doge.swim(5);
        cat.swim(5);
        doge.jump(1.5f);
        cat.jump(1.5f);
    }
}
