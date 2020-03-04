class string12
{
	public static void main(String ar[])
	{
		StringBuffer s=new StringBuffer("This is a StringBuffer  ");
		s.append("This is a sample program");
		System.out.println(s);
		s.insert(22,"Object");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		//s.replace("Buffer","Builder");
		//System.out.println(s);
	}
}