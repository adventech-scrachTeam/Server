package adventech.project.global.service;


import adventech.project.global.entity.DeviceData;
import adventech.project.global.repository.DeviceDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeviceService {
    private final DeviceDataRepository deviceDataRepository;

    public DeviceData getLatestDeviceData() {
        return deviceDataRepository.findTopByOrderByIdDesc();
    }
}
