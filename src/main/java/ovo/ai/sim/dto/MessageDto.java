package ovo.ai.sim.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class MessageDto {
    private String role;
    private List<ContentDto> content;
}
