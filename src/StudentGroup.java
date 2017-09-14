import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
            
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
	
        if(students == null)
             throw new IllegalArgumentException();
        else{
        this.students=students;
        }
          
	}

	@Override
	public Student getStudent(int index) {
	 if(index<0 || index>students.length)
            throw new IllegalArgumentException();
	else	return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		if(students[index] == null)
             throw new IllegalArgumentException();
        else if(index<0 || index>students.length)
            throw new IllegalArgumentException();
        else{
            
            students[index].setId(student.getId());
            students[index].setFullName(student.getFullName());
             students[index].setBirthDate(student.getBirthDate());
            students[index].setAvgMark(student.getAvgMark());
            
          }
	}

	@Override
	public void addFirst(Student student) {
            //Student s;
           LinkedList<Student> ls=new LinkedList(Arrays.asList(students));
	
	if(student == null)
             throw new IllegalArgumentException();
        else{
           /* students[0].setId(student.getId());
            students[0].setFullName(student.getFullName());
             students[0].setBirthDate(student.getBirthDate());
            students[0].setAvgMark(student.getAvgMark());
        */
           ls.addFirst(student);
           students=(Student[]) ls.toArray();
        }
	}

	@Override
	public void addLast(Student student) {
            LinkedList<Student> ls=new LinkedList(Arrays.asList(students));
	
		if(student == null)
             throw new IllegalArgumentException();
            else{
              /*  int index=students.length-1;
                students[index].setId(student.getId());
            students[index].setFullName(student.getFullName());
             students[index].setBirthDate(student.getBirthDate());
            students[index].setAvgMark(student.getAvgMark());*/
                ls.addLast(student);
                students=(Student[]) ls.toArray();
                }
                    
	}

	@Override
	public void add(Student student, int index) {
            LinkedList<Student> ls=new LinkedList(Arrays.asList(students));
	if(student == null)
             throw new IllegalArgumentException();
        else if(index<0 || index>students.length)
            throw new IllegalArgumentException();
        else{ /*students[index].setId(student.getId());
            students[index].setFullName(student.getFullName());
             students[index].setBirthDate(student.getBirthDate());
            students[index].setAvgMark(student.getAvgMark());*/
            ls.add(index, student);
            students=(Student[]) ls.toArray();
        
        }
	}

	@Override
	public void remove(int index) {
	LinkedList<Student> ls=new LinkedList(Arrays.asList(students));
	if(index<0 || index>students.length)
            throw new IllegalArgumentException();
        else{ /*students[index].setId(student.getId());
            students[index].setFullName(student.getFullName());
             students[index].setBirthDate(student.getBirthDate());
            students[index].setAvgMark(student.getAvgMark());*/
           // ls.add(index, student);
           ls.remove(index);
            students=(Student[]) ls.toArray();
        
        }
	}

	@Override
	public void remove(Student student) {
            LinkedList<Student> ls=new LinkedList(Arrays.asList(students));
	
            int id,c=0;
		if(student == null)
             throw new IllegalArgumentException();
                else if(student!=null){
                    for(int i=0;i<students.length;i++){
                        id=students[i].getId();
                    if(id==student.getId()){
                    c=1;
                    ls.remove(i);
                    break;
                    
                    }
                    }
                    if(c==0){
                    System.out.println("Student not exist");
                    }
                }
                students=(Student[]) ls.toArray(); 
	}

	@Override
	public void removeFromIndex(int index) {
		LinkedList<Student> ls=new LinkedList(Arrays.asList(students));
	if(index<0 || index>students.length)
            throw new IllegalArgumentException();
        else{ 
            for(int i=index+1;i<students.length;i++){
           ls.remove(i);
            }
            students=(Student[]) ls.toArray();
        
        }
	}

	@Override
	public void removeFromElement(Student student) {
		LinkedList<Student> ls=new LinkedList(Arrays.asList(students));
	
            int id,c=0,k=0;
		if(student == null)
             throw new IllegalArgumentException();
                else if(student!=null){
                    for(int i=0;i<students.length;i++){
                        id=students[i].getId();
                    if(id==student.getId()){
                    c=1;
                    k=i;
                    //ls.remove(i);
                    break;
                    
                    }
                    }
                    for(int j=k;j<students.length;j++){
                    ls.remove(j);
                    }
                    if(c==0){
                    System.out.println("Student not exist");
                    }
                }
                students=(Student[]) ls.toArray(); 
	}

	@Override
	public void removeToIndex(int index) {
        LinkedList<Student> ls=new LinkedList(Arrays.asList(students));
	if(index<0 || index>students.length)
            throw new IllegalArgumentException();
        else{ 
            for(int i=0;i<index;i++){
           ls.remove(i);
            }
            students=(Student[]) ls.toArray();
        
        }
	}

	@Override
	public void removeToElement(Student student) {
		LinkedList<Student> ls=new LinkedList(Arrays.asList(students));
	
            int id,c=0,k=0;
		if(student == null)
             throw new IllegalArgumentException();
                else if(student!=null){
                    for(int i=0;i<students.length;i++){
                        id=students[i].getId();
                    if(id==student.getId()){
                    c=1;
                   k=i;
                    break;
                    
                    }
                    }
                    for(int i=0;i<k;i++){
                        ls.remove(i);
            }
                    if(c==0){
                    System.out.println("Student not exist");
                    }
                }
                students=(Student[]) ls.toArray(); 
	}

	@Override
	public void bubbleSort() {
		Arrays.sort(students);
	}

	@Override
	public Student[] getByBirthDate(Date date) {
            Date d;
            Student[] s1 = null;
            int k=0;
		if(date==null)
                    throw new IllegalArgumentException();
                else{
                for(int i=0;i<students.length;i++){
                d=students[i].getBirthDate();
                if(d.equals(date)){
                    s1[k]=students[i];
                    k++;
                }
                }
                }
		return s1;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		Date d,d1;
            Student[] s1 = null;
            int k=0;
		if(firstDate==null || lastDate==null)
                    throw new IllegalArgumentException();
                else{
                for(int i=0;i<students.length;i++){
                d=students[i].getBirthDate();
                if(d.before(lastDate) && d.after(firstDate)){
                    s1[k]=students[i];
                    k++;
                }
                }
                }
		return s1;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
           Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);
        Date d1=cal.getTime();
		 Date d;
            Student[] s1 = null;
            int k=0;
		if(date==null)
                    throw new IllegalArgumentException();
                else{
                for(int i=0;i<students.length;i++){
                d=students[i].getBirthDate();
                if(d.equals(date) ){
                    s1[k]=students[i];
                    k++;
                }
                else if(d.before(d1) && d.after(d)){
                    s1[k]=students[i];
                    k++;
                }
                }
                }
		return s1;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
            int age;
            Date d;
		if(indexOfStudent==0){
               throw new IllegalArgumentException();
                }
                else{
                d=students[indexOfStudent].getBirthDate();
                
                }
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
             Student[] s1 = null;
             int k=0;
            double max=0,c=0;
            double t=0;
		for(int i=0;i<students.length;i++){
                    t=students[i].getAvgMark();
                    if(t>max)
                        max=t;
                    
                }
                for(int i=0;i<students.length;i++){
                    c=students[i].getAvgMark();
                    if(c==max){
                      s1[k]=students[i];
                    k++;
                    }
                    
                }
		return s1;
	}

	@Override
	public Student getNextStudent(Student student) {
		int id,c=0;
	if(student == null)
             throw new IllegalArgumentException();
                else {
                    for(int i=0;i<students.length;i++){
                        id=students[i].getId();
                    if(id==student.getId()){
                    c=i;
                    //ls.remove(i);
                    break;
                    
                    }
                    }
                    
                    
                }
		return students[c+1];
	}
}
