class Quizzer {
	public static void main(String[] args) {
		try{
			Quiz quiz = new Quiz();
			System.out.println("Your grade is " + quiz.takeQuiz() );
			return;
		}
		catch(IllegalArgumentException i){
			System.err.println("Invalid data");
			System.exit(1);
		}
	}
}