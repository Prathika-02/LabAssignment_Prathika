/**
 * Desc : Takes a jagged array of Salutations and names and are fixed accordingly.
 * @author Cheerala Prathika
 * Date: 23/10/2020
 *
 */

public class SalutationName {

	public static void main(String[] args) {
		//Decleration, Insantiation and Initialization
		String Name[][] = new String[2][];
		Name[0] = new String[]{"Mr", "Mrs", "Miss"};
		Name[1] = new String[]{"Pratik", "Aishwarya", "Surya", "Dishant", "Somesh", "Praveen"};

		for(int i=0;i<=5;i++)
		{
			if(Name[1][i] == "Pratik" || Name[1][i] == "Rohan" || Name[1][i] == "Somesh" || Name[1][i] == "Dishant" || Name[1][i] == "Praveen") 
			{
				System.out.println(Name[0][0]+" "+Name[1][i]);
			}
			else if(Name[1][i] == "Surya") 
				System.out.println(Name[0][1]+" "+Name[1][i]);
			else 	
				System.out.println(Name[0][2]+" "+Name[1][i]);
		}


	}

}

