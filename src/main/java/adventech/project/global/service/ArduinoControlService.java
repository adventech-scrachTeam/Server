package adventech.project.global.service;


import adventech.project.global.entity.DeviceData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class ArduinoControlService {
    private final RestTemplate restTemplate;
    private final DeviceService deviceService;

    public void controlArduino(){
        DeviceData latestData = deviceService.getLatestDeviceData();

        //Todo 간단하게만 해놓았기 때문에 로직에 맞게 알고리즘 다시 코딩
        if ("humi".equals(latestData.getTagName()) && latestData.getValue() > 50) {
            // 습도가 50 이상이면 팬을 켜는 명령 전송
            sendCommandToArduino("http://arduino.local/fan/on");
        } else if ("humi".equals(latestData.getTagName()) && latestData.getValue() <= 50) {
            // 습도가 50 이하이면 팬을 끄는 명령 전송
            sendCommandToArduino("http://arduino.local/fan/off");
        }
    }


    private void sendCommandToArduino(String url) {
        restTemplate.getForObject(url, String.class);
    }
}
