class Chick implements Animal 
{     
    private String myType;
	private String mySound, mySound1;
	private boolean twoSounds;
	public Chick(String type, String sound)
	{
		myType = type;
		mySound = sound;
		twoSounds = false;
	}public Chick(String type, String sound, String sound1)
	{
		myType = type;
		mySound = sound;
		mySound1 = sound1;
		twoSounds = true;
	}
	public Chick()
	{
		myType = "Unkown";
		mySound = "Unkown";
	}
	public String getType(){return myType;}
	public String getSound()
	{
		if(twoSounds == true)
		{
			if(Math.random()*2 < 1){return mySound;}
			else return mySound1;
		}
		else return mySound;
	}
}
