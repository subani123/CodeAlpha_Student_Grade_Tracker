import java.util.*;
class Main
{
    public static void main (String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.print("Enter Number of Students :");
        int n=ip.nextInt();
        int[] grades=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter "+(i+1)+" grade marks :");
            grades[i]=ip.nextInt();
        }
        double Avg=average(grades);
        System.out.println("\n\nStudents Average Score:"+Avg);
        int highest=highestmarks(grades);
        System.out.println("Students highest Score "+ highest);
        int lowest=lowesttmarks(grades);
        System.out.println("Students highest Score "+ lowest);
        ip.close();
    }

    private static double average(int[] grades)
    {
        int sum=0;
        for(int grade:grades)
        {
            sum+=grade;
        }
        return (double)sum/grades.length;
    }
    private static int highestmarks(int[] grades)
    {
        int high=grades[0];
        for(int grade:grades)
        {
            if(grade > high)
                high=grade;
        }
        return high;
    }

    private static int lowesttmarks(int[] grades)
    {
        int low=grades[0];
        for(int grade:grades)
        {
            if(grade < low)
                low=grade;
        }
        return low;
    }
}
