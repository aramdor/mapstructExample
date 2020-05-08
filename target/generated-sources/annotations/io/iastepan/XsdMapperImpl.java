package io.iastepan;

import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-08T21:00:54+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_172 (Oracle Corporation)"
)
public class XsdMapperImpl implements XsdMapper {

    @Override
    public ApiUnified v1ToUnified(ApiV1 api) {
        if ( api == null ) {
            return null;
        }

        ApiUnified apiUnified = new ApiUnified();

        apiUnified.setSeatCount( api.getNumberOfSeats() );
        apiUnified.setMake( api.getMake() );
        apiUnified.setType( api.getType() );

        return apiUnified;
    }

    @Override
    public ApiUnified v2ToUnified(ApiV2 api) {
        if ( api == null ) {
            return null;
        }

        ApiUnified apiUnified = new ApiUnified();

        apiUnified.setSeatCount( api.getSeats() );
        apiUnified.setMake( api.getMake() );
        apiUnified.setType( String.valueOf( api.getType() ) );
        apiUnified.setSafetySystems( api.getSafetySystems() );

        return apiUnified;
    }
}
