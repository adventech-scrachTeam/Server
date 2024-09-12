package adventech.project.global.repository;

import adventech.project.global.entity.DeviceData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceDataRepository extends JpaRepository<DeviceData, String> {
    DeviceData findTopByOrderByIdDesc();
}
