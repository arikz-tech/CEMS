package models;

public class QuestionInExam extends Question {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String note;
	private int points;

	enum NoteType {
		STUDENTS, TEACHERS
	}

	public QuestionInExam(Question question, String note, int points) {
		super(question.getQuestionID(), question.getTeacherName(), question.getSubject(), question.getCourse(),
				question.getDetails(), question.getAnswer1(), question.getAnswer2(), question.getAnswer3(),
				question.getAnswer4(), question.getCorrectAnswer(), question.getDetailsButton());
		this.note = note;
		this.points = points;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "QuestionInExam [note=" + note + ", points=" + points + ", getQuestionID()=" + getQuestionID()
				+ ", getTeacherName()=" + getTeacherName() + ", getSubject()=" + getSubject() + ", getCourse()="
				+ getCourse() + ", getDetails()=" + getDetails() + ", getAnswer1()=" + getAnswer1() + ", getAnswer2()="
				+ getAnswer2() + ", getAnswer3()=" + getAnswer3() + ", getAnswer4()=" + getAnswer4()
				+ ", getCorrectAnswer()=" + getCorrectAnswer() + ", getDetailsButton()=" + getDetailsButton()
				+ ", getAddButton()=" + getAddButton() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
