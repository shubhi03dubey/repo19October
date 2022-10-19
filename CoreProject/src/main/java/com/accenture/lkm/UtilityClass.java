package com.accenture.lkm;

public class UtilityClass {
	public boolean checkdataType(Object data,String type)
	{
		boolean b=false;
		if(data.getClass().getName().equalsIgnoreCase(type))
		{
			b=true;
			
		}return b;
	}
	public boolean checkLength(String data,int limit)
	{
		boolean b=false;
		if(data.length()<=limit)
		{
			b=true;
		}
		return b;
	}

}
