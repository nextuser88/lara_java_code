class O 
{
	static String open = "([<{";
	static String close = ")]>}";

	static boolean isOpen(char ch)
	{
		return open.indexOf(ch)!= -1;
	}
	static boolean isClose(char ch)
	{
		return close.indexOf(ch)!= -1;
	}
	static boolean isMatching(char chOpen, char chClose)
	{
		return open.indexOf(chOpen) == close.indexOf(chClose);
	}

	static boolean isBalanced(String input, String stack)
	{
		return input.isEmpty()? stack.isEmpty() : isOpen(input.charAt(0))? isBalanced(input.substring(1), input.charAt(0) + stack ): isClose(input.charAt(0))? !stack.isEmpty() && isMatching(stack.charAt(0), input.charAt(0)) && isBalanced(input.substring(1), stack.substring(1)): isBalanced(input.substring(1), stack);
					
			
	}
	public static void main(String[] args) 
	{
		boolean flag = isBalanced("[{([()])}]", "");
		System.out.println(flag);
	}
}
