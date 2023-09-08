package businesscalculation;

import org.springframework.stereotype.Component;

@Component //It is managed by Spring Framework
public class MySQLDataService implements DataService {
    @Override
    public int[] retrieveData(){

        return new int[] { 1, 2, 3, 4, 5 };
    }
}
