import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Mapper {

    public List<Orange> mapApplesToOranges(List<Apple> apples) {
        //apples.stream().map(...)
        return apples.stream().map(apple -> new Orange()).collect(Collectors.toList());
    }
    
}