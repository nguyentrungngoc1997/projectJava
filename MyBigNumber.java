/**
 * My <b>MyBigNumber</b>.
 *
 * @see Annotation
 */

class MyBigNumber
{
	public static String Sum(String s1, String s2)
	{
		String str = ""; //Khai bao de tra ve chuoi
		String []array1 = s1.split("//"); // chuyen chuoi thanh mang chuoi cua s1
		char []charArray1=array1[0].toCharArray(); // chuyen mang chuoi thanh mang ki tu cua array1
		
		String []array2 = s2.split("//");// chuyen chuoi thanh mang chuoi cua s2
		char []charArray2=array2[0].toCharArray();// chuyen mang chuoi thanh mang ki tu cua array2
		int a = 0;// chuyen chuoi thanh so cua charArray1
		int b = 0;// chuyen chuoi thanh so cua charArray2
		int c ;// dung de cong a+b
		int temp ;// dung de chua gia tri bien j
		int i, j;
		
		
		for(i = 0; i <charArray1.length ; i++)
		{
			for(j =0; j<=9; j++)// ki tu bat dau tu 0 den 9
			{
				if((charArray1[i]+ "").equals( j+ ""))// so sanh neu 2 cai bang nhau thi luu vao bien temp
					{ 
						temp = 0;
						 temp = j;
						a = a * 10 + temp;// chuyen chuoi thanh so gan vao bien a
					}
			}
		}

		
		for(i = 0; i <charArray2.length; i++)
		{
			for(j = 0; j <= 9; j++)
			{
				if((charArray2[i]+ "").equals(j+ ""))// so sanh neu 2 cai bang nhau thi luu vao bien temp
					{
						temp = 0;
						 temp = j;
						b= b * 10 + temp;// chuyen chu thanh so gan vao bien b
					}
			}
		}

		 c = a + b; // cong 2 bien a,b 
		 
		 return str + c;
	}
	public static void main(String[] args) // test thu chuong trinnh
	{
		System.out.println(Sum("75","945"));
	}
}