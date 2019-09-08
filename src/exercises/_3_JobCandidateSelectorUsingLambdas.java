package exercises;



import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;


public class _3_JobCandidateSelectorUsingLambdas {
	public static void main(String[] args) {

		// 1. Sort the candidates by salary requirements, low to high.
		
		Collections.sort(JobCandidate.jobCandidates, (jc1,jc2)-> jc1.getSalaryRequired()-jc2.getSalaryRequired());
															
		
		System.out.println(JobCandidate.jobCandidates.toString());

		// 2. Filter out any candidates that have not been taught by me (June)
		// Hint: see the removeIf() method in the Collections class
		
		Predicate<JobCandidate> sorting = jc -> !jc.getTeacherName().contains("June");
		 JobCandidate.jobCandidates.removeIf(sorting);
		 System.out.println(JobCandidate.jobCandidates);
			
		
	}
}
