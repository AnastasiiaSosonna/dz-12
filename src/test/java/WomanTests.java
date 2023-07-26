import man.woman.Woman;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WomanTests {
    @Test(dataProvider = "womanData")
    public void womanCorrectRetiredAge(String firstName, String lastName, int age, boolean partnership, boolean expectedRetired) {
        // Arrange + Act
        Woman woman = new Woman(firstName, lastName, age, partnership);
        // Assert
        Assert.assertEquals(woman.isRetired(), expectedRetired, "Incorrect age for retired woman");
    }

    @DataProvider(name = "womanData")
    public Object[][] womanData() {
        return new Object[][]{
                {"Elisa", "Luice", 80, false, true},
                {"Emma", "Watson", 30, true, false},
                {"Sophia", "Brown", 65, false, true}
        };
    }
}