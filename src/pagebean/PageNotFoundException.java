package pagebean;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class PageNotFoundException extends RuntimeException {

    private static String message = "This is the first page. No previous page found";

    public PageNotFoundException () {
        super(message);
    }

    public PageNotFoundException (String message) {
        super(message);
    }
}
