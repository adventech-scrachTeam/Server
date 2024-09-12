package adventech.project.global.service;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SchedulerService {
    private final ArduinoControlService arduinoControlService;


    @Scheduled(fixedRate = 60000)  // 60초 주기로 실행
    public void checkAndControl() {
        arduinoControlService.controlArduino();
    }
}
