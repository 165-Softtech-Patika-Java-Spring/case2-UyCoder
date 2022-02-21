package dev.ahmed.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Created: 2/20/2022 00:58
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Entity
@Table(name = "ADDRESS_PROVINCE")
@Data
public class AddressProvince {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long provinceId;
    private String provinceName;

}
