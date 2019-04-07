package HW10;

public class ValidationExceprion extends RuntimeException {


    public ValidationExceprion(String message) {
        super(message);
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();

    }


}
