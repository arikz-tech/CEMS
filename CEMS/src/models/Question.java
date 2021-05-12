package models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import client.Client;

public class Question implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final int NUMBER_OF_QUESTION = 1000;

	private String questionID;
	private String teacherName;
	private String subject;
	private String course;
	private String details;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private int correctAnswer;

	private static Map<String, String> subjectMap = new HashMap<String, String>() {
		{
			put("Social Studies", "01");
			put("Mathematics", "02");
			put("Language", "03");
			put("Science", "04");
		}
	};

	private static Map<String, Integer> questionCounter = new HashMap<String, Integer>() {
		{
			put("Social Studies", NUMBER_OF_QUESTION);
			put("Mathematics", NUMBER_OF_QUESTION);
			put("Language", NUMBER_OF_QUESTION);
			put("Science", NUMBER_OF_QUESTION);
		}
	};

	public Question(String teacherName, String subject, String course, String details, String answer1, String answer2,
			String answer3, String answer4, int correctAnswer) {
		super();
		
		this.questionID = subjectMap.get(subject)
				+ String.format("%03d", NUMBER_OF_QUESTION - questionCounter.get(subject));
		questionCounter.put(subject, questionCounter.get(subject) - 1);
		this.teacherName = teacherName;
		this.subject = subject;
		this.course = course;
		this.details = details;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		this.correctAnswer = correctAnswer;
	}

	public String getQuestionID() {
		return questionID;
	}

	public void setQuestionID(String questionID) {
		this.questionID = questionID;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public String getAnswer3() {
		return answer3;
	}

	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}

	public String getAnswer4() {
		return answer4;
	}

	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}

	public int getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	@Override
	public String toString() {
		return "Question [questionID=" + questionID + ", teacherName=" + teacherName + ", subject=" + subject
				+ ", course=" + course + ", details=" + details + ", answer1=" + answer1 + ", answer2=" + answer2
				+ ", answer3=" + answer3 + ", answer4=" + answer4 + ", correctAnswer=" + correctAnswer + "]";
	}

	public static Map<String, String> getSubjectMap() {
		return subjectMap;
	}

	public static void setSubjectMap(Map<String, String> subjectMap) {
		Question.subjectMap = subjectMap;
	}
	
	

}
