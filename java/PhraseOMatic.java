public class PhraseOMatic 
{
	public static void main (String[] args)
	{
		String[] wordListOne = {"24/7", "multi-tier", "30000 foot", "B-to-B", "win-win", "front-end", "web-based", "smart" ,"dynamic"};
		
		String[] wordListTwo = {"empowered","sticky","oriented","centric","aligned","cooperative","focused","networked","targeted"};
		
		String[] wordListThree = {"portal","space","vision","solution","mindshare","strategy","mision","paradigm","architecture"};
		
		int oneLenght = wordListOne.lenght;
		int twoLenght = wordListTwo.lenght;
		int threelenght = wordListThree.lenght;
		
		int rand1 = (int) (Math.random() * oneLenght);
		int rand2 = (int) (Math.random() * twoLenght);
		int rand3 = (int) (Math.random() * threelenght);
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		System.out.println("What we need is a " + phrase);
	}
} 