package com.mithra.Constuction;

public class Construction {
	public static double cost(int choice,double Area_of_house)
	{
		double cost = 0;
		if(choice==1)
			cost=Area_of_house*1200;
		else if(choice==2)
			cost=Area_of_house*1500;
		else if(choice==3)
			cost=Area_of_house*1800;
		else if(choice==4)
			cost=Area_of_house*2500;
		return cost;
		
	}

}
