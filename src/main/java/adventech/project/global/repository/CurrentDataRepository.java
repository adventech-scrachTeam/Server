package adventech.project.global.repository;

import adventech.project.global.entity.CurrentData;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CurrentDataRepository extends JpaRepository<CurrentData, Long> {
}
