class Student
{
	public String env;
	public String name;
	Student(String env, String name)
	{
		this.env = env;
		this.name = name;
	}
}

public class test_jenkins
{
	public static void main (String[] args)
	{
		Student[] arr = new Student[9];
		arr[0] = new Student("sita","aman");
		arr[1] = new Student("sita","vaibhav");
		arr[2] = new Student("sitb","shikar");
		arr[3] = new Student("sitci","dharmesh");
		arr[4] = new Student("sitd","mohit");
arr[5] = new Student("sita","vaibhav");
		arr[6] = new Student("sitb","shikar");
		arr[7] = new Student("sitci","dharmesh");
		arr[8] = new Student("sitd","mohit");
		for (int i = 0; i < arr.length; i++)
			System.out.println( i + " : " +
						arr[i].env +" "+ arr[i].name);
	}
}
