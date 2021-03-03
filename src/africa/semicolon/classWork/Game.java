import java.util.Scanner;
public class Game {
	public static void main(String[] args){
		int guessNumber = 100;

		Scanner numberGame = new Scanner(System.in);

		System.out.println("Enter your IQ score:");

		int enterNumber = numberGame.nextInt();

			if (guessNumber == enterNumber){
				System.out.printf("Score Match!, your score is %d%n", enterNumber);
}
			if (guessNumber > enterNumber){
				System.out.printf("Your IQ is less, You're an idiot! your score is %d%n", enterNumber);
}
			if (guessNumber < enterNumber){
				System.out.printf("Your IQ is high, Genius! your score is %d%n", enterNumber);
}

}

}