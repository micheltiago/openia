package ovo.ai.sim.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ImageUrlDto {

    private String url;
    private String detail;

}
