package adventech.project.global.service;


import adventech.project.global.dto.request.CurrentRequest;
import adventech.project.global.dto.request.DeviceRequest;
import adventech.project.global.dto.response.DeviceResponse;
import adventech.project.global.entity.ArduinoData;
import adventech.project.global.entity.CurrentData;
import adventech.project.global.entity.DeviceData;
import adventech.project.global.entity.TempData;
import adventech.project.global.mapper.ArduinoDataMapper;
import adventech.project.global.mapper.CurrentMapper;
import adventech.project.global.mapper.DeviceMapper;
import adventech.project.global.repository.ArduinoDataRepository;
import adventech.project.global.repository.CurrentDataRepository;
import adventech.project.global.repository.DeviceDataRepository;
import adventech.project.global.repository.TempDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DeviceService {
    private final DeviceDataRepository deviceDataRepository;
    private final DeviceMapper deviceMapper;
    private final ArduinoDataMapper arduinoDataMapper;
    private final ArduinoDataRepository arduinoDataRepository;
    private final TempDataRepository tempDataRepository;
    private final CurrentMapper currentMapper;
    private final CurrentDataRepository currentDataRepository;

    @Transactional
    public DeviceResponse getLatestDeviceData() {
        DeviceData deviceData = deviceDataRepository.findTopByOrderByIdDesc();
        return deviceMapper.toDeviceResponse(deviceData);
    }

    @Transactional
    public DeviceResponse getLatestTempData() {
        TempData tempData = tempDataRepository.findTopByOrderByIdDesc();
        return deviceMapper.toDeviceResponse(tempData);
    }

    @Transactional
    public ArduinoData createArduinoData(DeviceRequest request){
        ArduinoData arduinoData = arduinoDataMapper.toArduinoData(request);
        return arduinoDataRepository.save(arduinoData);
    }

    @Transactional
    public CurrentData createCurrentData(CurrentRequest request){
        CurrentData currentData = currentMapper.toCurrentData(request);
        return currentDataRepository.save(currentData);
    }
}
