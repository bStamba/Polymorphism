public abstract class Animal {
    String name;
    int age;

    public void sleep(){
        System.out.println("Zzzzz...");
    }

    public abstract void makeNoise();

    public abstract String getName();

    public abstract void setName(String name);

    public abstract int getAge();

    public abstract void setAge(int age);
}
