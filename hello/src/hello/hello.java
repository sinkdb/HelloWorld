package hello;

public class Hello 
{
	public static void main(String[] args)
	{
		String name = "";
		if(args.length > 0)
		{
			name = args[0];
		}
		Hello p = new Hello();
		p.hello(name);
	}
	
	public void hello(String name)
	{
		if(name.length() < 1)
		{
			name = "Devin";
		}
		else 
		{
			name = name.toLowerCase();
			name = name.substring(0,1).toUpperCase() + name.substring(1);
		}
		System.out.print("Hello " + name);
	}
}