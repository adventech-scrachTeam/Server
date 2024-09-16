package adventech.project.global.repository;

import adventech.project.global.entity.ArduinoData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArduinoDataRepository extends JpaRepository<ArduinoData, Long> {
}
