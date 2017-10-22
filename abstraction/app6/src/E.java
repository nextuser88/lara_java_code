class E 
{
}
class F extends E
{
}
class G extends F
{
}
class H
{
	F test()
	{
		return null;
	}
}
class I extends H
{
	G test()// co- variant
	{
		return null;
	}
}
