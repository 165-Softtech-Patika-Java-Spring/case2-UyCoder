package dev.ahmed.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Created: 2/20/2022 01:00
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Entity
@Table(name = "ADDRESS_NEIGHBORHOOD")
@Data
public class AddressNeighborhood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long neighborhoodId;
    private String neighborhoodName;
}
