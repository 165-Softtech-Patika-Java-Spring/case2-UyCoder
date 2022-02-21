package dev.ahmed.dto;

import lombok.Data;

/**
 * @Created: 2/20/2022 11:54
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Data
public class SaveNeighborhoodRequestDto extends AddressDto{
    private String country;
    private String city;
    private String province;
    private String disctrict;
    private String neighborhood;
    private String street;
    private int doorNumber;
    private Long apartmentNumber;
}
