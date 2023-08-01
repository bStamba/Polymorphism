public abstract class Animal {

    String name;
    int age;

    public Animal(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void sleep() {
        System.out.println("Zzzzz...");
    }

    public abstract void makeNoise();

    public abstract String getName();

    public abstract int getAge();
}
