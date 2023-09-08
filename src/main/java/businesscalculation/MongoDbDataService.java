package businesscalculation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //It is managed by Spring Framework
@Primary
public class MongoDbDataService implements DataService {
    @Override
    public int[] retrieveData(){

        return new int[] { 11, 22, 33, 44, 55 };
    }
}
