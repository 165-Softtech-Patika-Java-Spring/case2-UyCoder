package dev.ahmed.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Created: 2/21/2022 01:50
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Entity
@Table(name = "ADDRESS_APARTMENT_NUMBER")
@Data
public class AddressApartmentNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long apartmentId;
    private String apartmentName;
}
