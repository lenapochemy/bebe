public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cat kitty = new Cat("Kitty");

        System.out.println(kitty.getName());
        Dog sky = new Dog("Sky");
        System.out.println("cat's name:" + kitty.getName() );
        System.out.println("dog's name "+ sky.getName());
    }
}