public class Student implements InterfaceStudent{
    private String lastname;
    private String surname;
    private Course course;
    private int matrikNumber;

    public Student(){
    }

    public Student(String lastname, String surname, Course course, int matrikNumber){
        this.lastname = lastname;
        this.surname = surname;
        this.course = course;
        this.matrikNumber = matrikNumber;
    }

    @Override
    public void setLastname( String name ) {
        this.lastname = name;
    }

    @Override
    public String getLastname() {
        return lastname;
    }

    @Override
    public void setSurname( String surname ) {
        this.surname = surname;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setCourse( Course course ) {
        this.course = course;
    }

    @Override
    public Course getCourse() {
        return course;
    }

    @Override
    public void setMetrikNumber( int metrikNumber ) {
        this.matrikNumber = metrikNumber;
    }

    @Override
    public int getMetrikNumber() {
        return matrikNumber;
    }
}
