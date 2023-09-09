package businesscalculation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component //It is managed by Spring Framework
@Repository //- Indicates that an annotated class is used to retrieve and/or manipulate data in a database
@Primary
public class MongoDbDataService implements DataService {
    @Override
    public int[] retrieveData(){

        return new int[] { 11, 22, 33, 44, 55 };
    }
}
