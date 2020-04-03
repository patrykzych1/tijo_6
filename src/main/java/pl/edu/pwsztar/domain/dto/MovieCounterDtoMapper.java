package pl.edu.pwsztar.domain.dto;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.converter.Converter;

@Component
public class MovieCounterDtoMapper implements Converter<Long, MovieCounterDto> {

    @Override
    public MovieCounterDto convert(Long from) {
        return new MovieCounterDto(from);
    }
}
