package man.woman;

public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public boolean partner;

    public Person(String firstName, String lastName, int age, boolean partner) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = partner;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public boolean getPartnership() {

        return partner;
    }

    public void setPartnership(boolean partner) {

        this.partner = partner;
    }

}