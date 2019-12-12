package example;

import java.util.List;
import java.util.ArrayList;
import java.math.BigInteger;

public class Fibonacci extends Object
{
    /**
     * 発展プログラミング演習 練習問題2-5のメインプログラム。
     * @param arguments 引数の文字列の配列
     */
    public static void main(final String[] arguments)
    {
        //変数の宣言
        Integer aNumber = 5000;

        //連想表の宣言
        final List<BigInteger> aList = new ArrayList<BigInteger>();
        aList.add(BigInteger.valueOf(0));
        aList.add(BigInteger.valueOf(1));

        //コマンドライン引数の有無の判別
        if(arguments.length == 0){
            System.out.println("入力がなかったため、コマンドライン引数を「5000」とします");
        } else{
            aNumber = Integer.valueOf(arguments[0]);
        }

        //連想表の作成
        for(Integer index = 2; index <= aNumber; index++){
            aList.add(aList.get(index-1).add(aList.get(index-2)));
        }

        //連想表の表示
        for(Integer index = 0; index <= aNumber; index++){
            final StringBuffer aBuffer = new StringBuffer();
            aBuffer.append("F(");
            aBuffer.append(index);
            aBuffer.append(") = ");
            aBuffer.append(aList.get(index));
            System.out.println(aBuffer.toString());
        }

    }
}
