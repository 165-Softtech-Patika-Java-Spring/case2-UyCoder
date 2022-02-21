package dev.ahmed.dto;

import lombok.Data;

/**
 * @Created: 2/21/2022 20:31
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Data
public class AddressUpdateRequestDto extends AddressDto {
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
