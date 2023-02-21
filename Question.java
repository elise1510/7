public class Question {
	private String question;
	private static int nextQuestionNumber = 1;
	private int rightAnswer;
	private String[] answers;
	private final int questionNumber;

	public Question(String question, String[] answers, int rightAnswer) {
		this.question = question;
		this.answers = answers;
		this.rightAnswer = rightAnswer;
		questionNumber = nextQuestionNumber++;
		if (rightAnswer < 1 || rightAnswer > answers.length){
			throw new IllegalArgumentException("Right Answer is invalid");
		}
	}

	public boolean checkAnswer(int proposedAnswer)
	{
		if (proposedAnswer == rightAnswer){
			return true;
	}
		else
				return false;
		//return proposedAnswer.equals(rightAnswer);
	}

	@Override
	public String toString() {
		return "#" + questionNumber+ ". "+ question + "?\n" + "   1) " + answers[0] + "\n" + "   2) " + answers[1] + "\n" + "   3) " + answers[2] + "\n" + "   4) " + answers[3];

	}
	//return "#" + questionNumber+ ". "+ question + "\n" + "   1) " + answers[0] + "\n" + "   2) " + answers[1] + "\n" + "   3) " + answers[2] + "\n" + "   4) " + answers[3];
}