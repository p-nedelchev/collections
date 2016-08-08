package pagebean;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class PageNotFoundException extends RuntimeException {

    private static String message = "Page not found";

    public PageNotFoundException () {
        super(message);
    }

    public PageNotFoundException (String message) {
        super(message);
    }
}
