package src;

import java.util.stream.IntStream;

/**
 * 素因数を算出するクラス
 * @author Keisuke Ikeda
 * @version 1.2
 */
public class Calculation extends Object
{
    /**
     * 戻り値を記憶するフィールド。
     */
    private Integer anotherNumber = 0;
    
    /**
     * 素因数を算出するプログラム。
     * @param aNumber 素因数分解する値
     * @return  anotherNumber 算出された素因数
     */
    public Integer getPrimes(Integer aNumber)
    {
        for(Integer index = 2; index <= aNumber; index++){
            if(aNumber % index == 0){
                this.anotherNumber = index;
                break;
            }
        }

        return this.anotherNumber;
    }
}
