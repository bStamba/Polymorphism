public class Cat extends Animal {

    private String name;
    private int age;

    @Override
    public void makeNoise() {
        System.out.println("Meoooow HISS");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}
