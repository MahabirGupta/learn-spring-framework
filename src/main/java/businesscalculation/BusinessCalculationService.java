package businesscalculation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

//@Component //It is managed by Spring Framework
@Service //- Indicates that an annotated class has business logic
public class BusinessCalculationService {
   private DataService dataService;

//   Using constructor as dependency injection
    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax(){

        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
