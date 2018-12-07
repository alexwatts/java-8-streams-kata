
import java.util.List;
import java.util.stream.Collectors;

public class Mapper {
    
        //apples.stream().map(...)
        return apples.stream().map(apple -> new Orange()).collect(Collectors.toList());
    }
    
}