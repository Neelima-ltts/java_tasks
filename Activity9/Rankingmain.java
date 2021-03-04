import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
	import java.util.Collections;
public class Rankingmain {

		public static void main(String[] args) throws IOException 
		{
			BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
					ArrayList<Rankingans1> al = new ArrayList<Rankingans1>();
					
					System.out.println("Please provide the number of  players: ");
					int players = Integer.parseInt(reader.readLine());
					int j=0;
					for(int i=0;i<players;i++)
					{
						System.out.println("Enter Name of Player"+j);
						String name = reader.readLine();
						System.out.println("Enter score of Player"+j);
						int age = Integer.parseInt(reader.readLine());
						al.add(new Rankingans1(age,name));
						j++;
					}
					Collections.sort(al);
					for(Rankingans1 r:al)
					{
						System.out.println(r.getName()+" "+r.getScore());
					}
		}
	}