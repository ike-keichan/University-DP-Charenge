package src;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

/**
 * 試験成績を分析するクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class ExamAnalyzer extends Object
{
    /**
     * 受験者名とその受験者の試験点数を記憶するフィールド
     */
    private List<ExamScore> scoreList = new ArrayList<ExamScore>();

    /**
     * 全受験者の数学の試験の点数の合計を記憶するフィールド
     */
    private Double mathScoreSum = 0.0;

    /**
     * 全受験者の物理の試験の点数の合計を記憶するフィールド
     */
    private Double physicsScoreSum = 0.0;

    /**
     * 全受験者の英語の試験の点数の合計を記憶するフィールド
     */
    private Double englishScoreSum = 0.0;

    /**
     * 発展プログラミング演習 練習問題4-4の起動プログラム。
     */
    public void run()
    {
        //リストの生成
        IntStream.range(0, 10).forEach(index -> {
            scoreList.add(new ExamScore()
                    .createScore(String.valueOf(index))
            );
        });

        //全受験者の数学の試験の点数の合計を算出、ラムダ式
        this.mathScoreSum = scoreList.stream()
                .mapToDouble(ExamScore::getMath)
                .sum();

        //全受験者の物理の試験の点数の合計を算出、ラムダ式
        this.physicsScoreSum = scoreList.stream()
                .mapToDouble(ExamScore::getPhysics)
                .sum();

        //全受験者の英語の試験の点数の合計を算出、ラムダ式
        this.englishScoreSum = scoreList.stream()
                .mapToDouble(ExamScore::getEnglish)
                .sum();

        //出力
        System.out.printf("   |   math|   phys|    eng|    ave|%n");
        System.out.printf("ave| %6.3f| %6.3f| %6.3f|       |%n", 
                            this.mathScoreSum / scoreList.size(), 
                            this.physicsScoreSum / scoreList.size(), 
                            this.englishScoreSum / scoreList.size());

        //出力
        scoreList.forEach(ExamScore::printScore);

    }
}
