package adventech.project.global.mapper;


import adventech.project.global.dto.response.DeviceResponse;
import adventech.project.global.entity.DeviceData;
import adventech.project.global.entity.TempData;
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

    public DeviceResponse toDeviceResponse(TempData tempData){
        return DeviceResponse.builder()
                .id(tempData.getId())
                .deviceId(tempData.getDeviceId())
                .tagName(tempData.getTagName())
                .value(tempData.getValue())
                .build();
    }
}

