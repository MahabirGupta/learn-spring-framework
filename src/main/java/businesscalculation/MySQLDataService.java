package businesscalculation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component //It is managed by Spring Framework
@Repository //- Indicates that an annotated class is used to retrieve and/or manipulate data in a database

public class MySQLDataService implements DataService {
    @Override
    public int[] retrieveData(){

        return new int[] { 1, 2, 3, 4, 5 };
    }
}
