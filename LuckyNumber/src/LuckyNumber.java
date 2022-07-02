import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		play();
	}

	// Tạo hằng số lưu giá tri lớn nhất
	static final int MAX = 100;

	public static void play() {
		Scanner input = new Scanner(System.in);
		int totalGames = 0;
		int totalGuess = 0;
		int bestGame = 0;
		int guess;
		String answer;
		System.out.println("Chon 1 so tu 0 den 100");
		do {
			int guessPerGame = 0;
			int randomNumber = (int) (Math.random() * MAX);
			System.out.println(randomNumber);
			do {
				System.out.print("Ban doan? ");
				guess = input.nextInt();
				guessPerGame++;
				totalGuess++;
				if (guess > randomNumber) {
					System.out.println("So ban chon lon hon so ngau nhien");

				} else if (guess < randomNumber) {
					System.out.println("So ban chon nho hon so ngau nhien");
				} else {
					System.out.println("Chuc mung doan trung sau " + guessPerGame + " lan doan");
				}
			} while (guess != randomNumber);

			totalGames++;
			if (totalGames == 1) {
				bestGame = guessPerGame;
			} else {
				if (bestGame > guessPerGame) {
					bestGame = guessPerGame;
				}
			}
			System.out.print("Ban choi tiep khong? ");
			answer = input.next();
			if (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("y")) {
				System.out.println("Tong so lan choi: " + totalGames);
				System.out.println("Tong so lan doan: " + totalGuess);
				System.out.println("So lan doan trung binh moi luot: " + (double) totalGuess / totalGames);
				System.out.println("So lan doan it nhat: " + bestGame);
			}
		} while (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y"));

	}

}
