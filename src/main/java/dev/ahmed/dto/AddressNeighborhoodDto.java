package dev.ahmed.dto;

import lombok.Data;

/**
 * @Created: 2/21/2022 18:01
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Data
public class AddressNeighborhoodDto extends AddressDto {
    private String disctrict;
    private String neighborhood;

}
