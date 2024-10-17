package moves;

import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Stat.SPEED;

public class ZapCannon extends SpecialMove {
    public ZapCannon() {
        super(Type.ELECTRIC, 120, 50);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.paralyze(p);
        Effect e = new Effect().chance(0.25).attack(0);
        p.setMod(SPEED, (int)(p.getStat(SPEED)*0.5));
    }
    @Override
    protected String describe() {
        return "атакует ZapCannon";
    }
}
