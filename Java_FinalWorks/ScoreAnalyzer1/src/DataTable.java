package src;

/**
 * csvファイルの内容を格納するクラス
 * @author Keisuke Ikeda
 * @version 1.0
 */
public class DataTable extends Object
{
	/**
	 * 日付を格納するフィールド
	 */
	private String date;

	/**
	 * ラベルを格納するフィールド
	 */
	private String label;

	/**
	 * 問題番号を格納するフィールド
	 */
	private Integer problemNumber;

	/**
	 * 学生番号（受験者番号）を格納するフィールド
	 */
	private Integer studentNumber;

	/**
	 * 点数を格納するフィールド
	 */
	private String score;

	/**
	 * 開始時間を格納するフィールド
	 */
	private String startTime;

	/**
	 * 終了時間を格納するフィールド
	 */
	private String endTime;

	/**
	 * コンストラクタ
	 */
	DataTable()
	{
		super();

		return;
	}

	/**
	 * コンストラクタ
	 * @param anArray 文字列の配列
	 */
	DataTable(String... anArray)
	{
		super();

		this.date = anArray[0];
		this.label = anArray[1];
		this.problemNumber = Integer.valueOf(anArray[2]);
		this.studentNumber = Integer.valueOf(anArray[3]);
		try
		{
			this.score = anArray[4];
		}
		catch(NumberFormatException anException) { this.score = ""; }
		this.startTime = anArray[5];
		// this.endTime = anArray[6];

		return;
	}

	/**
	 * 全てのフィールドを返すゲッターメソッド
	 * @return aString 全てのフィールドを","で結合した文字列
	 */
	public String getAll()
	{
		final StringBuffer aBuffer = new StringBuffer();
		aBuffer.append(this.date);
		aBuffer.append(", ");
		aBuffer.append(this.label);
		aBuffer.append(", ");
		aBuffer.append(this.problemNumber);
		aBuffer.append(", ");
		aBuffer.append(this.studentNumber);
		aBuffer.append(", ");
		aBuffer.append(this.score);
		aBuffer.append(", ");
		aBuffer.append(this.startTime);
		aBuffer.append(", ");
		aBuffer.append(this.endTime);
        aBuffer.append(", ");
		return aBuffer.toString();
	}

	/**
	 * 日付を返すゲッターメソッド
	 * @return date 日付
	 */
	public String getDate() 
	{
		return this.date;
	}

	/**
	 * ラベルを返すゲッターメソッド
	 * @return label ラベル
	 */
	public String getLabel() 
	{
		return this.label;
	}

	/**
	 * 問題番号を返すゲッターメソッド
	 * @return problemNumber 問題番号
	 */
	public Integer getProblemNumber() 
	{
		return this.problemNumber;
	}

	/**
	 * 学生番号（受験者番号）を返すゲッターメソッド
	 * @return studentNumber 学生番号（受験者番号）
	 */
	public Integer getStudentNumber() 
	{
		return this.studentNumber;
	}

	/**
	 * 点数を返すゲッターメソッド
	 * @return score 点数
	 */
	public String getScore() 
	{
		return this.score;
	}

	/**
	 * 開始時間を返すゲッターメソッド
	 * @return startTime 開始時間
	 */
	public String getStartTime() 
	{
		return this.startTime;
	}

	/**
	 * 終了時間を返すゲッターメソッド
	 * @return endTime 終了時間
	 */
	public String getEndTime() 
	{
		return this.endTime;
	}

	/**
	 * 日付を更新するセッターメソッド
	 * @param aString 日付
	 */
	public void setDate(String aString) 
	{
		this.date = aString;
		return;
	}

	/**
	 * ラベルを更新するセッターメソッド
	 * @param aString ラベル
	 */
	public void setLabel(String aString) 
	{
		this.label = aString;
		return;
	}

	/**
	 * 問題番号を更新するセッターメソッド
	 * @param aNumber 問題番号
	 */
	public void setProblemNumber(Integer aNumber) 
	{
		this.problemNumber = aNumber;
		return;
	}

	/**
	 * 学生番号（受験者番号）を更新するセッターメソッド
	 * @param aNumber 学生番号（受験者番号）
	 */
	public void setStudentNumber(Integer aNumber) 
	{
		this.studentNumber = aNumber;
		return;
	}

	/**
	 * 点数を更新するセッターメソッド
	 * @param aString 点数
	 */
	public void setScore(String aString) 
	{
		this.score = aString;
		return;
	}

	/**
	 * 日付を更新するセッターメソッド
	 * @param aString 日付
	 */
	public void setStartTime(String aString) 
	{
		this.startTime = aString;
		return;
	}

	/**
	 * 日付を更新するセッターメソッド
	 * @param aString 日付
	 */
	public void setEndTime(String aString) 
	{
		this.endTime = aString;
		return;
	}

}
