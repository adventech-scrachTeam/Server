package adventech.project.global.mapper;

import adventech.project.global.dto.request.DeviceRequest;
import adventech.project.global.entity.ArduinoData;
import org.springframework.stereotype.Component;

@Component
public class ArduinoDataMapper {
    public ArduinoData toArduinoData(DeviceRequest request){
        return ArduinoData.builder()
                .time(request.getTime())
                .temperature(request.getTemperature())
                .build();
    }

}
