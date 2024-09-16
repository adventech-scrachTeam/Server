package adventech.project.global.mapper;

import adventech.project.global.dto.response.DeviceResponse;
import adventech.project.global.entity.DeviceData;
import org.springframework.stereotype.Component;

@Component
public class DeviceMapper {
    public DeviceResponse toDeviceResponse(DeviceData deviceData){
        return DeviceResponse.builder()
                .id(deviceData.getId())
                .deviceId(deviceData.getDeviceId())
                .tagName(deviceData.getTagName())
                .value(deviceData.getValue())
                .build();
    }
}

