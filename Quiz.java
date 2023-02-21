import java.util.Scanner;


public class Quiz {
	private Question Questions[];

	public Quiz() {
		loadQuiz();

	}

	private void loadQuiz() {
	 Questions = new Question[] { new Question("What is Composition on a UML chart", new String[] { "——>", "——◇", "———", "——◆" }, 4), new Question("What is the definition of Regression Testing ", new String[] { "Running the program as rough as possible", "Testing and repeating for each requirment", "Crossing your fingers and praying", "Another main program that tests the correctness of a class or system" }, 4), new Question("What does catch do in JDB", new String[] { "Nothing", "Catches a change in a variable", "Catches the line you want to stop at", "Catches an exeception" }, 4),new Question("What is an array list ", new String[] { "Another word for array", "A 2D array", "An array type that only holds other arrays", "A resizable array" }, 4),};
	}

	public double takeQuiz() {
		Scanner scan = new Scanner(System.in);
		double numberCorrect = 0;
		int i = 0;

		while (i < Questions.length) {
			System.out.println(Questions[i]);
			System.out.print("   Your answer? ");
			int proposedAnswer = scan.nextInt();
			if (Questions[i].checkAnswer(proposedAnswer) == true) {
				numberCorrect++;
			}
			i++;

		}
		scan.close();	
	
		return (numberCorrect/ i)*100;
		
	}

}