public class PoisonMatango extends Matango {


    public class pm {

            pm.attack(
        Hero h)

        {
            int i = 5;
            i = i - 1;
            System.out.println("さらに毒の胞子をばらまいた！");
            System.out.println(h.getHp() * 0.2 + "ポイントのダメージ");
            h.setHp(h.getHp() * 0.8);
        }
    }

    PoisonMatango pm = new PoisonMatango('A');
}