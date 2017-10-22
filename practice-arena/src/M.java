class  M
{
	public static void main(String[] args) 
	{
		String str = "v c n n j k i uy t rr e e d h jk k l l";
		char[] strArray =  str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < strArray.length; i++)
		{
			if((strArray[i] != ' ') && (strArray[i] != '\t'))
			{
				sb.append(strArray[i]);
			}
		}
		System.out.println(sb);
	}
}
