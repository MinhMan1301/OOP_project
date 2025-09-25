public class plants{
    // gắn thuộc tính cho cây
    int health;
    int cost;
    int dame_attack;
    int cooldown;
    int range;

    // hàm khởi tạo thuộc tính
    public plants(int health, int cost, int dame_attack, int cooldown, int range) {
        this.health = health;
        this.cost = cost;
        this.dame_attack = dame_attack;
        this.cooldown = cooldown;
        this.range = range;
    }

    public static void main(String[] args) {
        // tạo các đối tượng cây (demo)
        plants sun_flower  = new plants(300 , 50 , 0 , 5 , 0);
        plants pea_shooter = new plants(300 , 100, 20 , 3 , 3);
        plants cactus      = new plants(1000, 150, 50 , 7 , 5);
        plants cherry_bomb = new plants(500 , 200, 200, 10, 2);
        plants walnut      = new plants(2500, 100, 0  , 10, 0);
        plants potato_mine = new plants(700 , 300, 300, 20, 1);
        plants snow_pea    = new plants(800 , 0  , 0  , 12, 0);
        System.out.println("Nononononononono");

        //tạo phuong thức hoạt động của cây

    }
}