package src;

/**
 * 素数表を生成するクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Calculation extends Object
{
    /**
     * 素数表を生成するプログラム。
     * @param aNumber 要素の値
     * @return flag 要素の値が素数かどうかの真偽値
     */
    public Boolean getPrimes(Integer aNumber) {

        //要素の値が素数かどうかの真偽値を記憶する
        Boolean flag = false;

        //要素の値が素数かどうか判別
        if (aNumber.equals(0) | aNumber.equals(1)) {
            flag = false;
        }else {
            for(Integer index = 2; index < 200; index++) {
                if (aNumber.equals(index)) {
                    flag = true;
                }else if (aNumber % index == 0) {
                    flag = false;
                    break;
                }else {
                    flag = true;
                }
            }
        }
        return flag;
    }
}

