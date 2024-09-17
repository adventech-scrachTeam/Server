package adventech.project.global.repository;

import adventech.project.global.entity.DeviceData;
import adventech.project.global.entity.TempData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TempDataRepository extends JpaRepository<TempData, Long> {
    TempData findTopByOrderByIdDesc();
}
