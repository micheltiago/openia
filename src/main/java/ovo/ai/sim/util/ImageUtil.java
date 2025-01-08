package ovo.ai.sim.util;

import ovo.ai.sim.dto.ContentDto;
import ovo.ai.sim.dto.ImageDto;
import ovo.ai.sim.dto.MessageDto;
import ovo.ai.sim.dto.UrlDto;

import java.util.List;

public class ImageUtil {

    private static final String IMG = "https://cdn.awsli.com.br/300x300/2599/2599960/produto/264148593/js771alab657dq4z55ab4klg9ooekuqaflynanpv-c4b3tuov19-rwo14j414r.jpg";

    public static ImageDto montarTstIMG() {
        return ImageDto.builder()
                .model("gpt-4o-mini")
                .messages(montaMessage())
                .maxTokens("300")
                .build();
    }

    private static List<MessageDto> montaMessage() {
        MessageDto message = MessageDto
                .builder()
                .role("user")
                .content(montaContent())
                .build();
        return List.of(message);
    }

    private static List<ContentDto> montaContent() {
        return List.of(montaContent01(), montaContent02());
    }

    private static ContentDto montaContent02() {
        return ContentDto
                .builder()
                .type("image_url")
                .imageUrl(montaUrl())
                .build();
    }

    private static ContentDto montaContent01() {
        return ContentDto
                .builder()
                .type("text")
                .text("O que é esta imagem?")
                .build();
    }

    private static UrlDto montaUrl() {
        return UrlDto
                .builder()
                .url(IMG)
                .build();
    }

}
