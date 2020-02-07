package example;

public class Complex extends Object
{
    /**
     * 受験者名を記憶するフィールド
     */
    private String name;

    /**
     * 数学の試験点数を記憶するフィールド
     */
    private Integer math;

    /**
     * 物理の試験点数を記憶するフィールド
     */
    private Integer physics;

    /**
     * 英語の試験点数を記憶するフィールド
     */
    private Integer english;

    /**
     * 値を生成するメソッド
     * @param inputName 受験者名
     * @return this 自身のオブジェクト
     */
    public ExamScore createScore(String inputName)
    {
        Random random = new Random();
        this.name = inputName;
        this.math = random.nextInt(101);
        this.physics = random.nextInt(101);
        this.english = random.nextInt(101);
        return this;
    }

    /**
     * 受験者名を返すゲッターメソッド
     * @return this.name 受験者名
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * 数学の試験点数を返すゲッターメソッド
     * @return this.math 数学の試験点数
     */
    public Integer getMath()
    {
        return this.math;
    }

    /**
     * 物理の試験点数を返すゲッターメソッド
     * @return this.physics 物理の試験点数
     */
    public Integer getPhysics()
    {
        return this.physics;
    }

    /**
     * 英語の試験点数を返すゲッターメソッド
     * @return this.english 英語の試験点数
     */
    public Integer getEnglish()
    {
        return this.english;
    }

    /**
     * 受験者名とその受験者の各試験点数を出力するメソッド
     */
    public void printScore()
    {
        System.out.printf("%3s| %6d| %6d| %6d| %6.3f|%n", this.name, this.math, this.physics, this.english, (this.math + this.physics + this.english) / 3.0);
    }
}
