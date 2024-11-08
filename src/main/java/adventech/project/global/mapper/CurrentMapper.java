package adventech.project.global.mapper;

import adventech.project.global.dto.request.CurrentRequest;
import adventech.project.global.entity.CurrentData;
import org.springframework.stereotype.Component;


@Component
public class CurrentMapper {

    public CurrentData toCurrentData(CurrentRequest request){
        return CurrentData.builder()
                .time(request.getTime())
                .current(request.getCurrent())
                .build();
    }
}
