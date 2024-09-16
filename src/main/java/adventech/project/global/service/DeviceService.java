package adventech.project.global.service;


import adventech.project.global.dto.response.DeviceResponse;
import adventech.project.global.entity.DeviceData;
import adventech.project.global.mapper.DeviceMapper;
import adventech.project.global.repository.DeviceDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DeviceService {
    private final DeviceDataRepository deviceDataRepository;
    private final DeviceMapper deviceMapper;
    @Transactional
    public DeviceResponse getLatestDeviceData() {
        DeviceData deviceData = deviceDataRepository.findTopByOrderByIdDesc();
        return deviceMapper.toDeviceResponse(deviceData);
    }
}
