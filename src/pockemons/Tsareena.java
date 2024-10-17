package pockemons;

import moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tsareena extends Steenee {
    public Tsareena(String name, int level) {
        super(name, level);
        setType(Type.STEEL, Type.FLYING);
        setStats(72, 120, 98, 50, 98, 72);
        // hp att def spec att spec def speed
        Swagger swagger = new Swagger();
        super.setMove(swagger);
    }
}
