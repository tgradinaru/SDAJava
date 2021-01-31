package fundamentals;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;    ///constructor fara parametrii
    }

    public void setName(String name) {
        this.name = name;            //setez (private)
    }

    public String getName() {
        return this.name;            //accesez (private)
    }

    public boolean equals(Dog dog) {                // am suprascris metoda equals
        return (this.name == dog.getName());
    }
}
