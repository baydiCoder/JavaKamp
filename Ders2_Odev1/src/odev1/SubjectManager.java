package odev1;

public class SubjectManager {

	public void addSubject(Subject subject)
	{
		System.out.println(subject.subjectId + " tanımlandı.");
	}
	
	public void getSubjectDetail(Subject subject)
	{
		
		System.out.println("Konu Bilgisi : "+subject.name);
		System.out.println("Eğitmen : "+subject.lecturer);
		System.out.println("-------------------------");
		
		for(Lesson lesson:subject.lessons)
		{
			System.out.println("Ders : " + lesson.name);
			System.out.println("Tarih : "+ lesson.lessonDate);
			for(Homework homework:lesson.homeworks)
			{
				System.out.println("Ödev Bilgileri");
				System.out.println(homework.title);
				System.out.println(homework.content);
			}
			System.out.println("-------------------------");
		}
		
	}
}
