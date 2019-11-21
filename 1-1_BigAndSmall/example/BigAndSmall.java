package example;

public class BigAndSmall extends Object
{
	public static void main(String[] arguments)
	{
		Double aDouble = Math.random();
		String aString = new String();

		if(aDouble >= 0.5){
			aString = "Big";
		}else {
			aString = "Small";
		}

		System.out.println("value:" + aDouble);
		System.out.println("result:" + aString);
	}
}
