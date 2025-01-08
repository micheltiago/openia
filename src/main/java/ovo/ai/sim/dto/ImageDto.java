package ovo.ai.sim.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class ImageDto {
    private String model;
    private List<MessageDto> messages;
    private String maxTokens;
}
