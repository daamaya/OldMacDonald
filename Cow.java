class Cow implements Animal 
{     
	protected String myType;
	protected String mySound;
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
	public String getType(){return myType;}
	public String getSound(){return mySound;}
}
