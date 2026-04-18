import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LoginDataDrivenTest {

    @DataProvider(name="loginData")
    public Object[][] loginData() {
        return new Object[][] {
            {"standard_user", "secret_sauce", true},
            {"locked_out_user", "secret_sauce", false},
            {"problem_user", "secret_sauce", true},
            {"invalid_user", "wrong_password", false}
        };
    }

    @Test(dataProvider="loginData")
    public void testLogin(String username, String password, boolean expectedSuccess) {
        // Set up WebDriver (not shown)

        // Log in with the provided username and password
        // Perform actual login steps (not shown)

        // Validate login success
        boolean loginResult = performLogin(username, password); // Mock method for login
        assertEquals(loginResult, expectedSuccess);

        // Clean up (not shown)
    }

    private boolean performLogin(String username, String password) {
        // Placeholder for actual login logic
        if (username.equals("standard_user") && password.equals("secret_sauce")) {
            return true;
        } else if (username.equals("locked_out_user")) {
            return false;
        } else if (username.equals("problem_user") && password.equals("secret_sauce")) {
            return true;
        } else {
            return false;
        }
    }
}
