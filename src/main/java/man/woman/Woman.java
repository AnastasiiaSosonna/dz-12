package man.woman;

public class Woman extends Person {
    public String spouseLastName;

    public Woman(String firstName, String lastName, int age, boolean partner) {
        super(firstName, lastName, age, partner);
    }

    public boolean isRetired() {
        if (age > 60) {
            return true;
        } else return false;
    }

    public void registerPartnership(Man husband) {
        this.spouseLastName = husband.getLastName();
        this.setPartnership(true);
    }

    public void deregisterPartnership() {
        this.setPartnership(false);
    }

    @Override
    public String getLastName() {
        if (this.partner) {
            return spouseLastName;
        } else {
            return super.getLastName();
        }
    }
}