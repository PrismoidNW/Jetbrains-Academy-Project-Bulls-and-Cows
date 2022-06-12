import java.util.Random;

class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        while (true) {
            System.out.println(r.nextInt(0, 2));
            Thread.sleep(1000);
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public int compareTo(Person o) {
        if (name.equals(o.name)){
            return Integer.compare(age, o.age);
        }
        return name.compareTo(o.name);
    }
}