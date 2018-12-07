
import java.util.List;
import java.util.stream.Collectors;

public class Mapper {
    
    public List<Orange> mapApplesToOranges(List<Apple> apples) {
        return apples.stream().map(apple -> new Orange()).collect(Collectors.toList());
    }
    
}