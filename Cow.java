class Cow implements Animal 
{     
	private String myType;
	private String mySound;
	public Cow(String type, String sound)
	{
		myType = type;
		mySound = sound;
	}
	public Cow()
	{
		myType = "Unkown";
		mySound = "Unkown";
	}
	public getType(){return myType;}
	public getSound(){return mySound;}
}
