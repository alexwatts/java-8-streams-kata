import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class MapTest {
    
    Mapper mapper = new Mapper();
    
    @Test
    public void shouldMapApplesToOranges() {
        
        List<Apple> apples = givenApples();
        List<Orange> mappedList = mapper.mapApplesToOranges(apples);
        assertThat(mappedList.size(), equalTo(3));
        
    }
       
    private List<Apple> givenApples() {
        return Arrays.asList(new Apple(), new Apple(), new Apple());
    }
    
}