package adventech.project.global.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DeviceResponse {
    private Long id;
    private String deviceId;
    private String tagName;
    private double value;
}
