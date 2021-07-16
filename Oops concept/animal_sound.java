
abstract class animal
{
	public abstract void animalsound();
	public void sleep() {
		System.out.println("zzzzzzzzz");
	}
}

class pig extends animal{
	public void animalsound()
	{
		System.out.println("The pig say weeeeeee weeeeeee");
	}
}

class Main{
	public static void main(String[] args)
	{
		pig mypig=new pig();
		mypig.animalsound();
		mypig.sleep();
	}
}