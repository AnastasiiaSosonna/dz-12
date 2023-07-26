import man.woman.Person;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PersonTests {
    @Test(dataProvider = "personData")
    public void firstNameIsNotNull(String firstName, String lastName, int age, boolean partnership) {
        Person person = new Person(firstName, lastName, age, partnership);
        Assert.assertNotNull(person.firstName, "First name is null");
    }

    @Test(dataProvider = "personData")
    public void lastNameIsNotNull(String firstName, String lastName, int age, boolean partnership) {
        Person person = new Person(firstName, lastName, age, partnership);
        Assert.assertNotNull(person.lastName, "Last name is null");
    }

    @Test(dataProvider = "personData")
    public void ageIsNotNull(String firstName, String lastName, int age, boolean partnership) {
        Person person = new Person(firstName, lastName, age, partnership);
        Assert.assertNotNull(person.age, "Age is null");
    }

    @Test(dataProvider = "personData")
    public void partnerIsNotNull(String firstName, String lastName, int age, boolean partnership) {
        Person person = new Person(firstName, lastName, age, partnership);
        Assert.assertNotNull(person.partner, "Partner is null");
    }

    @Test(dataProvider = "personData")
    public void getterAgeTest(String firstName, String lastName, int age, boolean partnership) {
        // Arrange + Act
        Person person = new Person(firstName, lastName, age, partnership);
        // Assert
        Assert.assertEquals(person.getAge(), age);
    }

    @Test(dataProvider = "personData")
    public void setterAgeTest(String firstName, String lastName, int age, boolean partnership) {
        // Arrange
        Person person = new Person(firstName, lastName, age, partnership);
        // Act
        person.setAge(13);
        // Assert
        Assert.assertEquals(person.getAge(), 13);
    }

    @Test(dataProvider = "personData")
    public void getterLastNameTest(String firstName, String lastName, int age, boolean partnership){
        // Arrange + Act
        Person person = new Person(firstName, lastName, age, partnership);
        // Assert
        Assert.assertEquals(person.getLastName(), lastName);
    }

    @Test(dataProvider = "personData")
    public void setterLastNameTest(String firstName, String lastName, int age, boolean partnership) {
        // Arrange
        Person person = new Person(firstName, lastName, age, partnership);
        // Act
        person.setLastName("Potter");
        // Assert
        Assert.assertEquals(person.getLastName(), "Potter");
    }
    @Test(dataProvider = "personData")
    public void getterPartnershipTest(String firstName, String lastName, int age, boolean partnership){
        // Arrange + Act
        Person person = new Person(firstName, lastName, age, partnership);
        // Assert
        Assert.assertEquals(person.getPartnership(), true);
    }

    @Test(dataProvider = "personData")
    public void setterPartnershipTest(String firstName, String lastName, int age, boolean partnership) {
        // Arrange
        Person person = new Person(firstName, lastName, age, partnership);
        // Act
        person.setPartnership(false);
        // Assert
        Assert.assertEquals(person.getPartnership(), false);
    }

    @DataProvider(name = "personData")
    public Object[][] personData() {
        return new Object[][]{
                {"Den", "Rudenko", 70, true},
                {"Anna", "Smith", 45, true},
                {"John", "Doe", 25, true}
        };
    }
}
