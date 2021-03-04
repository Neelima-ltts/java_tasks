package ThreadDemo;

import java.util.Arrays;
import java.util.Comparator;

public class SortScore<String> extends Thread{
String matchType;
String scoreString;
 String[] score;

public String[] getScore() {
	return score;
}
public void setScore(String[] score) {
	this.score = score;
}
public String getMatchType() {
	return matchType;
}
public void setMatchType(String matchType) {
	this.matchType = matchType;
}
public String getScoreString() {
	return scoreString;
}
public void setScoreString(String scoreString) {
	this.scoreString = scoreString;
}





public SortScore(String matchType, String scoreString) 
{
	super();
	this.matchType = matchType;
	this.scoreString = scoreString;
}
public void run()
{
	
	System.out.println("Match : "+matchType);
	System.out.println(getScore1());
}

public SortScore() {
	super();
}
public  java.lang.String getScore1()
{
	
	 for(String s2:score)
	{
		Arrays.sort(score,new Comparator<String>()
				{

					@Override
					public int compare(String s1, String s2) {
						// TODO Auto-generated method stub
						return Integer.valueOf((java.lang.String) s1).compareTo(Integer.valueOf((java.lang.String) s2));
						
					}
			
				});
	}
	
	//System.out.print(Arrays.toString(score));
for(Object i:score)
{
	System.out.println(i);
}
	return "";
	
	 
}

}

