package dev.ahmed;

import dev.ahmed.entity.Address;
import dev.ahmed.gen.enums.BaseErrorMessage;

/**
 * @Created: 2/21/2022 20:34
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
public enum AddressMessage implements BaseErrorMessage {
    CUSTOMER_ERROR_MESSAGE("Adress Bulunamadi!"),
    ;

    private String message;
    AddressMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
    @Override
    public String toString() {
        return message;
    }

}

