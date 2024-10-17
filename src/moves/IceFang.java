package moves;

import ru.ifmo.se.pokemon.*;

public class IceFang extends PhysicalMove {
    public IceFang() {
        super(Type.ICE, 65, 95);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){ //def - обороняющийся покемон, damage - расчетное повреждение
        super.applyOppDamage(def, damage);
        if(Math.random()<=0.1 ) Effect.freeze(def);
        if(Math.random()<=0.1 ) Effect.flinch(def);
    }


    @Override
    protected String describe() {
        return "атакует IceFang";
    }
}
