package example;


public class Example extends Object
{
	
	public static void main(String[] arguments)
	{
		// モデルのインスタンスを描画文字列を指定して生成する。
		Model aModel = new Model("京都産業大学");

		// タイトル文字列を指定してウィンドウを出現させる。
		aModel.open("ExampleF");

		return;
	}
}
