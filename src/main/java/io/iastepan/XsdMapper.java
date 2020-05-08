package io.iastepan;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface XsdMapper {

    XsdMapper INSTANCE = Mappers.getMapper(XsdMapper.class);

    @Mapping(source = "numberOfSeats", target = "seatCount")
    ApiUnified v1ToUnified(ApiV1 api);

    @Mapping(source = "seats", target = "seatCount")
    ApiUnified v2ToUnified(ApiV2 api);
}

