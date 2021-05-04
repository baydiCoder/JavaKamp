package odev1;

public class Main {

	public static void main(String[] args) {
		
		Homework homework1= new Homework();
		homework1.homeworkId=1;
		homework1.title="Ödev1";
		homework1.content="Kodlama.io sitesini inceleyiniz.";
		
		Homework homework2= new Homework();
		homework2.homeworkId=2;
		homework2.title="Ödev2";
		homework2.content="Youtube Java videolarını izleyiniz";
		
		Homework homework1_1= new Homework();
		homework1_1.homeworkId=1;
		homework1_1.title="Ödev1";
		homework1_1.content="Altin.in sitesini inceleyiniz.";
		
		Lesson lesson1= new Lesson();
		lesson1.lessonId=1;
		lesson1.name="Java giriş ";
		lesson1.lessonDate="21.04.2021";
		lesson1.homeworks=new Homework[] {homework1_1};
		
		Lesson lesson2= new Lesson();
		lesson2.lessonId=2;
		lesson2.name="Java OOP Giriş ";
		lesson2.homeworks= new Homework[]{homework1,homework2};
		lesson2.lessonDate="24.04.2021";
		
		Subject subject= new Subject();
		subject.subjectId=1;
		subject.name="Java & React Geliştirici Kampı";
		subject.lecturer="Engin Demiroğ ve Ekibi";
		subject.lessons= new Lesson[] {lesson1,lesson2};
		
		SubjectManager subjectManager= new SubjectManager();
		subjectManager.getSubjectDetail(subject);
	}

}
