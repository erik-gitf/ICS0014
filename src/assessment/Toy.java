package assessment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Toy {
    private String name;
    private String color;

    public String toString(){
        return String.format("%s %s color", name, color);
    }
}
