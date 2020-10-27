/**
 * Desc : Java program that displays the number of characters, lines and words in a text 
 * @author: Cheerala Prathika
 * Date: 27/10/2020
 *
 */
public class CountOfCharacters {

	public static void main(String[] args) {
        String paragraph= "Dog is eating\nDog is running\nDog is barking";  ;
        int c=1,count=1,countLine=1;
       
        for(int i=0;i<paragraph.length();i++) {
			  c++;
			if (paragraph.charAt(i) == ' '||paragraph.charAt(i) == '\n')
			{
				count++;
			}
			if(paragraph.charAt(i) == '\n' )
			{ 
				countLine++;
			}
        }
		System.out.println("Number of characters "+c);
		System.out.println("Number of words "+count);
		System.out.println("Number of lines "+countLine);
	}

}


