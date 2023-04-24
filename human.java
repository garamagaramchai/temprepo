class Human {
    String name;
    String gender;

    public Human(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public static void find(Man m, Woman w) {
        if (m.age > w.age) {
            System.out.println(m.name + " is elder.");
        } else if (w.age > m.age) {
            System.out.println(w.name + " is elder.");
        } else {
            System.out.println(m.name + " and " + w.name + " are of the same age.");
        }
    }
}

class Man extends Human {
    int age;

    public Man(String name, String gender, int age) {
        super(name, gender);
        this.age = age;
    }
}

class Woman extends Human {
    int age;

    public Woman(String name, String gender, int age) {
        super(name, gender);
        this.age = age;
    }
}

public class test3 {
    public static void main(String[] args) {
        Man john = new Man("John", "Male", 30);
        Woman jane = new Woman("Jane", "Female", 25);

        Human.find(john, jane);
    }
}
