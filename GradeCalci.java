
import java.util.Scanner;

public class GradeCalci{


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int [] marks;
        System.out.print("Enter total no.of subjects:");
        int n = sc.nextInt();
        int totalMarks=0;
        marks = new int[n];
        for(int i=0; i<marks.length; i++){
            marks[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            totalMarks+=marks[i];
        }
        float avgPer = (float)totalMarks/n;
    
    System.out.println("Total Marks       : "+totalMarks);
    System.out.println("Average Percentage: "+avgPer);
    if(avgPer>=90){
        System.out.println("Grade A");
    }
    if(avgPer>=90){
        System.out.println("Grade A");
    }
    else if(avgPer<90 && avgPer>=80){
        System.out.println("Grade B");
    }
    else if(avgPer<80 && avgPer>=70){
        System.out.println("Grade C");
    }
    else if(avgPer<50 && avgPer>=60){
        System.out.println("Grade D");
    }
    else
    System.out.println("Failed");
}

}
