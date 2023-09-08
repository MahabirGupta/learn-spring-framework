package businesscalculation;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component //It is managed by Spring Framework
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
