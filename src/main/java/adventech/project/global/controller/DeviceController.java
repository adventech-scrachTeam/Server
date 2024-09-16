package adventech.project.global.controller;


import adventech.project.global.common.BaseResponse;
import adventech.project.global.dto.request.DeviceRequest;
import adventech.project.global.dto.response.DeviceResponse;
import adventech.project.global.entity.ArduinoData;
import adventech.project.global.entity.DeviceData;
import adventech.project.global.service.DeviceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/arduino")
public class DeviceController {
    private final DeviceService deviceService;

    @GetMapping("/device-data")
    public BaseResponse<DeviceResponse> getLatestDeviceData() {
        return BaseResponse.onSuccess(deviceService.getLatestDeviceData());  // 최신 데이터를 반환
    }

    @PostMapping("/data")
    public  BaseResponse<ArduinoData> createArduinoData(@RequestBody DeviceRequest request){
        return BaseResponse.onSuccess(deviceService.createArduinoData(request));
    }

}
