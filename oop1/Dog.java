public class Dog {
    /* …源代码… */
    String name;
    String color;
    int age;

    Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show() {
        System.out.println("name:" + name + ",color=" + color + ",age=" + age);
    }

    public static void main(String[] args) {
        Dog ram = new Dog("Ram", "white", 2);
        ram.show();
        Dog nim = new Dog("nim", "black", 3);
        nim.show();
    }
}