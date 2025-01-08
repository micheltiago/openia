package ovo.ai.sim.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ContentDto {

    private String type;
    private String text;
    private String image_url;
}
