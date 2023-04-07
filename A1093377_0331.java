

// 動物類別
class Animal {
    protected String name;
    protected double height;
    protected double weight;
    protected String gender;
    protected boolean frozenSkill;
    protected int speed;

    // 建構式
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

    // 計算跑步距難
    public double distance(int x, double y) {
        if (y == 0) {
            return x * speed;
        } else {
            return x * y * speed;
        }
    }

    // 多載distance方法，不輸入y值，預設為0
    public double distance(int x) {
        return distance(x, 0);
    }
}

// 人類類別，繼承動物類別
class Human extends Animal {
    public Human(String name, double height, double weight, int speed, String gender) {
        super(name, height, weight, speed);
        this.gender = gender;
    }

    // 改寫show方法，增加顯示性別
    @Override
    public void show() {
        super.show();
        System.out.println("性別：" + gender);
    }
}

// 冰雪女王類別，繼承人類類別
class SnowQueen extends Human {
    public SnowQueen(String name, double height, double weight, int speed, String gender, boolean frozenSkill) {
        super(name, height, weight, speed, gender);
        this.frozenSkill = frozenSkill;
    }

    // 改寫show方法，增加顯示冰凍技能
    @Override
    public void show() {
        super.show();
        System.out.println("冰凍技能：" + (frozenSkill ? "Yes" : "No"));
    }

    // 改寫distance方法，奔跑距難在原公式下*2
    @Override
    public double distance(int x, double y) {
        if (y == 0) {
            return x * speed * 2;
        } else {
            return x * y * speed * 2;
        }
    }

    // 多載distance方法，不輸入y值，預設為0
    public double distance(int x) {
        return distance(x, 0);
    }
}

// 執行用的類別
public class A1093377_0331{
    // 透過static方法顯示系統歡迎訊息
    public static void showInfo() {
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}
