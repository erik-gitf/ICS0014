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

public class Cat {
    private String name;
    private String breed;
    private String furColor;
    private String eyeColor;
    private List<Toy> favoriteToys;


    @Override
    public String toString(){
        return String.format("%s, the cat is %s, has %s fur and %s eyes, its favorite toys are: %s", name, breed, furColor, eyeColor, favoriteToys);
    }

    public static class Toy {
        private String name;
        private String color;

        public Toy(String name, String color) {
            this.name = name;
            this.color = color;
        }

    }
}
