public enum Course {


    C1("Math"),
    C2("Language"),
    C3("Computing");

    private String name;

    Course(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}
