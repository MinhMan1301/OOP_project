public class zombies {
    // biến ở thuộc tính zomebie
    int health;
    int dame_attack;
    int speed;
    String name;
    int cooldown;

    // biến ở các method zombie
    
    

    // hàm khởi tạo thuộc tính
    public zombies(int health,int dame_attack, int speed, int cooldown){
        this.health = health;
        this.dame_attack = dame_attack;
        this.speed = speed;
        this.cooldown = cooldown;
    }
    // Các hàm phương thức của zombie
    public void move(){
        int position_zombie = 20;
        while (position_zombie <= 0){
            position_zombie = - speed;
        }
    }
    
    public static void main(String[] args){
        //tạo các đối tượng chứa thuộc tính zombie
        zombies normal_zombie = new zombies(  100  ,  100  ,  1  ,   5  );
        zombies zombie_hat    = new zombies(  150  ,  100  ,  1  ,   7  );
        zombies zombie_bucket = new zombies(  200  ,  100  ,  1  ,   10 );
        zombies zombie_healthy= new zombies(  120  ,  150  ,  2  ,   12 );
        zombies zombie_giant  = new zombies(  500  ,  200  ,  1  ,   15 );

    }
}
