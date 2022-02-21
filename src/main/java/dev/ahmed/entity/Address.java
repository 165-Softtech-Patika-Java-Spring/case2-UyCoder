package dev.ahmed.entity;

import dev.ahmed.gen.entity.BaseEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * @Created: 2/19/2022 17:02
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Entity
@Table(name = "ADDRESS")
@Data
public class Address extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;
    private String city;
    private String province;
    private String disctrict;
    private String neighborhood;
    private String street;
    private int doorNumber;
    private Long apartmentNumber;

}
