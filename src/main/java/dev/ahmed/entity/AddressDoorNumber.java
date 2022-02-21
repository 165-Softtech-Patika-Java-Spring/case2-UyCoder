package dev.ahmed.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Created: 2/20/2022 01:01
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Entity
@Table(name = "ADDRESS_DOOR_NUMBER")
@Data
public class AddressDoorNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long doorNoId;
    private String DoorName;

}
