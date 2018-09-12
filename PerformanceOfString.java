package StringBuffer;

public class PerformanceOfString {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		String s1 = new String("Java");
		for(int i=0;i<=1000000;i++)
		{
			s1 = s1+ "point";
		}
		System.out.println("Time for String : "+ (System.currentTimeMillis()-startTime) + "ms");
		
		startTime = System.currentTimeMillis();
		StringBuffer s2 = new StringBuffer("Java");
		for(int i=0;i<=1000000;i++)
		{
			s2.append("point");
		}
		System.out.println("Time for String : "+ (System.currentTimeMillis()-startTime) + "ms");

		startTime = System.currentTimeMillis();
		StringBuilder s3 = new StringBuilder("Java");
		for(int i=0;i<=1000000;i++)
		{
			s3.append("point");
		}
		System.out.println("Time for String : "+ (System.currentTimeMillis()-startTime) + "ms");

	}

}
