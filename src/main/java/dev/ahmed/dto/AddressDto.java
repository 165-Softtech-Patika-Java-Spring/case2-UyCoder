package dev.ahmed.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @Created: 2/20/2022 03:55
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Data
public class AddressDto {
    private Long Id;
    private String country;
    private String city;
    private String province;
    private String disctrict;
    private String neighborhood;
    private String street;
    private int doorNumber;
    private Long apartmentNumber;
}
