package dev.ahmed.converter;

import dev.ahmed.dto.*;
import dev.ahmed.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @Created: 2/21/2022 19:36
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AdressMapper {

    AdressMapper INSTANCE = Mappers.getMapper(AdressMapper.class);

    Address convertToAdress(SaveCountryRequestDto saveCountryRequestDto);

    List<AddressDto> convertToAdressDtoList(List<Address> addressList);

    AddressDto convertToadressDto(Address address);

    Address convertToAdress(SaveCityRequestDto saveCityRequestDto);

    Address convertToAdress(SaveDistrictRequestDto saveDistrictRequestDto);

    Address convertToAdress(AddressUpdateRequestDto addressUpdateRequestDto);

    Address convertToAdress(SaveProvinceRequestDto saveProvinceRequestDto);

    Address convertToAdress(SaveNeighborhoodRequestDto saveNeighborhoodRequestDto);

    Address convertToAdress(SaveStreetRequestDto saveStreetRequestDto);

    Address convertToAdress(SaveAdressRequestDto saveAdressRequestDto);
}
