class Pascal {
    String nameOfCreator;
    String type;
    int yearOfDevelopment;

    public Pascal(String nameOfCreator, String type, int yearOfDevelopment) {
        this.nameOfCreator = nameOfCreator;
        this.type = type;
        this.yearOfDevelopment = yearOfDevelopment;
    }

    public void displayIt() {
        System.out.println("Name of Creator: " + nameOfCreator);
        System.out.println("Type: " + type);
        System.out.println("Year of Development: " + yearOfDevelopment);
    }
}

class Fortran extends Pascal {
    public Fortran(String nameOfCreator, String type, int yearOfDevelopment) {
        super(nameOfCreator, type, yearOfDevelopment);
    }

    // @Override
    public void displayIt() {
        super.displayIt();
        System.out.println("This is a Fortran program.");
    }
}

class Cobol extends Fortran {
    public Cobol(String nameOfCreator, String type, int yearOfDevelopment) {
        super(nameOfCreator, type, yearOfDevelopment);
    }

    // @Override
    public void displayIt() {
        super.displayIt();
        System.out.println("This is a COBOL program.");
    }

}

class test2 {
    public static void main(String[] args) {
        Pascal p = new Pascal("Niklaus Wirth", "Compiled", 1970);
        Fortran f = new Fortran("John Backus", "Compiled", 1957);
        Cobol c = new Cobol("Grace Hopper", "Compiled", 1959);

        p.displayIt();
        f.displayIt();
        c.displayIt();

        // Determine the youngest programming language by year of development
        Pascal youngest = p;
        if (f.yearOfDevelopment > youngest.yearOfDevelopment) {
            youngest = f;
        }
        if (c.yearOfDevelopment > youngest.yearOfDevelopment) {
            youngest = c;
        }

        System.out.println("The youngest programming language is:");
        youngest.displayIt();
    }
}