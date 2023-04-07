


class Animal {
    protected String name;
    protected double height;
    protected double weight;
    protected String gender;
    protected boolean frozenSkill;
    protected int speed;

   
    public Animal(String name, double height, double weight, int speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    // 顯示動物資訊
    public void show() {
        System.out.println("名稱：" + name);
        System.out.println("身高：" + height + " 公尺");
        System.out.println("體重：" + weight + " 公斤");
        System.out.println("速度：" + speed);
    }


    public double distance(int x, double y) {
        if (y == 0) {
            return x * speed;
        } else {
            return x * y * speed;
        }
    }

    
    public double distance(int x) {
        return distance(x, 0);
    }
}


class Human extends Animal {
    public Human(String name, double height, double weight, int speed, String gender) {
        super(name, height, weight, speed);
        this.gender = gender;
    }

    
    @Override
    public void show() {
        super.show();
        System.out.println("性別：" + gender);
    }
}


class SnowQueen extends Human {
    public SnowQueen(String name, double height, double weight, int speed, String gender, boolean frozenSkill) {
        super(name, height, weight, speed, gender);
        this.frozenSkill = frozenSkill;
    }

   
    @Override
    public void show() {
        super.show();
        System.out.println("冰凍技能：" + (frozenSkill ? "Yes" : "No"));
    }

   
    @Override
    public double distance(int x, double y) {
        if (y == 0) {
            return x * speed * 2;
        } else {
            return x * y * speed * 2;
        }
    }

   
    public double distance(int x) {
        return distance(x, 0);
    }
}


public class A1093377_0331{
    // 透過static方法顯示系統歡迎訊息
    public static void showInfo() {
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}
