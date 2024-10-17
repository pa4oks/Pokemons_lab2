package moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove{
        public Facade() {
                super(Type.NORMAL, 70, 100);
        }
        @Override
        protected void applyOppDamage(Pokemon def, double damage){ //def - обороняющийся покемон, damage - расчетное повреждение
                super.applyOppDamage(def, damage);
                if (def.getCondition() == Status.BURN || def.getCondition() == Status.PARALYZE || def.getCondition() == Status.POISON){
                        super.applyOppDamage(def, damage);// this.damage *= 2; как увеличить урон в 2 раза?
                }
        }
        @Override
        protected String describe() {
                return "атакует Facade";
        }
}