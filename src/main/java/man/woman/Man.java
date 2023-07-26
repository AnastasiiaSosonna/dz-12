package man.woman;

public class Man extends Person {

    public Man(String firstName, String lastName, int age, boolean partner) {
        super(firstName, lastName, age, partner);
    }

    public boolean isRetired() {
        if (age > 65) {
            return true;
        } else return false;
    }

}