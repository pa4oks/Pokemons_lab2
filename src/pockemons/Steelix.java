package pockemons;

import moves.IceFang;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Steelix extends Onix {
    public Steelix(String name, int level) {
        super(name, level);
        setType(Type.STEEL, Type.FLYING);
        setStats(75, 85, 200, 55, 65, 30);
        // hp att def spec att spec def speed
        IceFang iceFang = new IceFang();
        super.setMove(iceFang);
    }
}
