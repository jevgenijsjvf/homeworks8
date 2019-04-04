package HW10;

import javax.xml.bind.ValidationException;

public class ValidationExceprion extends ValidationException {


    public ValidationExceprion(String message) {
        super(message);
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();

    }


}
