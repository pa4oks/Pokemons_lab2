package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class FrostBreath extends SpecialMove {
    public FrostBreath() {
        super(Type.ICE, 60, 90);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){ //def - обороняющийся покемон, damage - расчетное повреждение
        super.applyOppDamage(def, 90);

    }
    @Override
    protected String describe() {
        return "атакует FrostBreath";
    }
}
