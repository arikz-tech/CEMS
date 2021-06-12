package models;

import java.io.Serializable;

import com.jfoenix.controls.JFXButton;

import javafx.scene.control.TextField;

public class StudentExecutedExam implements Serializable, Comparable<StudentExecutedExam> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String examID;
	private String studentID;
	private String studentName;
	private String TeacherId;
	private String subject;
	private String course;
	private String execDate;
	private String testType;
	private String grade;
	private String code;
	private String alert;
	private String execDuration;
	private String comment;
	private boolean finished;
	private boolean approved;
	private WordFile copy;
	private TextField tfGrade;
	private TextField tfComment;
	private JFXButton getCopy;

	public int compareTo(StudentExecutedExam other) {
		// comparison by the grade:
		return Integer.compare(Integer.parseInt(this.grade), Integer.parseInt(other.grade));
	}

	public StudentExecutedExam(String course, String grade, String execDate) {
		super();
		this.course = course;
		this.grade = grade;
		this.execDate = execDate;
	}

	public StudentExecutedExam(StudentExecutedExam executedStudentExam, String newGrade) {
		super();
		examID = executedStudentExam.getExamID();
		studentID = executedStudentExam.getStudentID();
		studentName = executedStudentExam.getStudentName();
		TeacherId = executedStudentExam.getTeacherId();
		subject = executedStudentExam.getSubject();
		course = executedStudentExam.getCourse();
		execDate = executedStudentExam.getExecDate();
		testType = executedStudentExam.getTestType();
		grade = executedStudentExam.getGrade();
		approved = executedStudentExam.isApproved();
		grade = newGrade;
	}


	public StudentExecutedExam(String examID, String studentID, String studentName, String teacherId, String subject,
			String course, String execDate, String testType, String grade, String alert, boolean approved,
			String comment) {
		super();
		this.examID = examID;
		this.studentID = studentID;
		this.studentName = studentName;
		TeacherId = teacherId;
		this.subject = subject;
		this.course = course;
		this.execDate = execDate;
		this.testType = testType;
		this.grade = grade;
		this.approved = approved;
		this.alert = alert;
		this.comment = comment;
	}

	public StudentExecutedExam(String examID, String studentID, String code, String execDate) {
		super();
		this.examID = examID;
		this.studentID = studentID;
		this.execDate = execDate;
		this.code = code;
	}

	public String getExamID() {
		return examID;
	}

	public void setExamID(String examID) {
		this.examID = examID;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getTeacherId() {
		return TeacherId;
	}

	public void setTeacherId(String teacherId) {
		TeacherId = teacherId;
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

	public String getExecDate() {
		return execDate;
	}

	public void setExecDate(String execDate) {
		this.execDate = execDate;
	}

	public String getTestType() {
		return testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public WordFile getCopy() {
		return copy;
	}

	public void setCopy(WordFile copy) {
		this.copy = copy;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAlert() {
		return alert;
	}

	public void setAlert(String alert) {
		this.alert = alert;
	}

	public TextField getTfGrade() {
		return tfGrade;
	}

	public void setTfGrade(TextField tfGrade) {
		this.tfGrade = tfGrade;
	}

	public JFXButton getGetCopy() {
		return getCopy;
	}

	public void setGetCopy(JFXButton getCopy) {
		this.getCopy = getCopy;
	}

	public String getExecDuration() {
		return execDuration;
	}

	public void setExecDuration(String execDuration) {
		this.execDuration = execDuration;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public TextField getTfComment() {
		return tfComment;
	}

	public void setTfComment(TextField tfComment) {
		this.tfComment = tfComment;
	}

	@Override
	public String toString() {
		return "StudentExecutedExam [examID=" + examID + ", studentID=" + studentID + ", studentName=" + studentName
				+ ", TeacherId=" + TeacherId + ", subject=" + subject + ", course=" + course + ", execDate=" + execDate
				+ ", testType=" + testType + ", grade=" + grade + ", approved=" + approved + "]";
	}

}
