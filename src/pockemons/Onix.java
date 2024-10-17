package pockemons;

import moves.DoubleEdge;
import moves.Facade;
import moves.Screech;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Onix extends Pokemon {
    public Onix(String name, int level) {
        super(name, level);
        setType(Type.STEEL, Type.FLYING);
        setStats(35, 45, 160, 30, 45, 70);
        // hp att def spec att spec def speed
        Screech screech = new Screech();
        Facade facade = new Facade();
        DoubleEdge edge = new DoubleEdge();
        super.setMove(screech, facade, edge);
    }
}
