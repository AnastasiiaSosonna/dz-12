import man.woman.Man;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ManTests {
    @Test(dataProvider = "manData")
    public void manCorrectRetiredAge(String firstName, String lastName, int age, boolean partnership, boolean expectedRetired) {
        // Arrange + Act
        Man man = new Man(firstName, lastName, age, partnership);
        // Assert
        Assert.assertEquals(man.isRetired(), expectedRetired, "Incorrect retiring age");
    }

    @DataProvider(name = "manData")
    public Object[][] manData() {
        return new Object[][]{
                {"Den", "Rudenko", 70, true, true},
                {"John", "Doe", 60, false, false},
                {"Michael", "Smith", 75, true, true}
        };
    }
}