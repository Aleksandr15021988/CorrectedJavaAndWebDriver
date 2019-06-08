public class Student {
    private String ID;
    private String name;
    private String middleName;
    private String surname;
    private String dateOfBirth;
    private String phoneNumber;
    private String faculty;
    private String course;
    private String group;

    public Student(String ID, String name, String middleName, String surname, String dateOfBirth, String phoneNumber, String faculty, String course, String group) {
        this.ID = ID;
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {

        return faculty;
    }


    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {
        return group;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
