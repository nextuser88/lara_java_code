class R
{
	static String open = "([{<";
	static String close = ")]}>";
	
	static boolean isOpen(char ch)
	{
		System.out.println("isOpen");
		return open.indexOf(ch)!= -1;
	}
	static boolean isClose(char ch)
	{
		System.out.println("isClose");
		return close.indexOf(ch)!= -1;
	}
	static boolean isMatching(char chOpen, char chClose)
	{
		System.out.println("chOpen, chClose");
		return open.indexOf(chOpen) == close.indexOf(chClose);
	}
	static boolean isBalanced(String input, String stack)
	{
		if(input.isEmpty())
		{
			System.out.println("if-1");
			return stack.isEmpty();
		}
		else if(isOpen(input.charAt(0)))
		{
			System.out.println("else-if-1");
			return isBalanced(input.substring(1), input.charAt(0)+ stack);
		}
		else if(isClose(input.charAt(0)))
		{
			System.out.println("else-if-2");
			return !stack.isEmpty() && isMatching(stack.charAt(0), 
				input.charAt(0)) && isBalanced(input.substring(1),stack.substring(1));
		}
		else
		{
			System.out.println("else");
			return isBalanced(input.substring(1), stack);
		}
	}
	public static void main(String[] args) 
	{
		boolean flag = isBalanced("a[b{c{test}g}h]","");
		System.out.println(flag);
	}
}
