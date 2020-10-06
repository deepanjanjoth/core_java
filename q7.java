class q7{
	public static void main(String[] args)
	{
	int english,physics,chemistry,maths,computer;
	int total,percentage,average;
	sc=new Scanner(System.in);
	System.out.println("please enter 5 subjects");
	english=sc.nextInt();
	chemistry=sc.nextInt();
	physics=sc.nextInt();
	maths=sc.nextInt();
	computer=sc.nextInt();
	
	total=english+chemistry+physics+computer+maths;
	average=total/5;
	perc=(total/500)*100;
	System.out.println(" Total Marks =  " + total);
	    System.out.println(" Average Marks =  " + average);
	    System.out.println(" Marks Percentage =  " + percentage);
	}
	}
