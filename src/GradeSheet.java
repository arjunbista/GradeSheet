
import java.util.Scanner;
import java.io.*;


public class GradeSheet {
    public static void main(String[] args) {
        int Fullmarks,subj_1,subj_2,subj_3,subj_4,subj_5,Obtmarks,grade,percentage;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Total Full Marks: ");
        int FullMarks=sc.nextInt();
        
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the Obtained Marks for Subject_1: ");
        int Subj_1=sc.nextInt();
        
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter the Obtained Marks for Subject_2: ");
        int Subj_2=sc.nextInt();
        
        Scanner sc3=new Scanner(System.in);
        System.out.println("Enter the Obtained Marks for Subject_3: ");
        int Subj_3=sc.nextInt();
        
        Scanner sc4=new Scanner(System.in);
        System.out.println("Enter the Obtained Marks for Subject_4: ");
        int Subj_4=sc.nextInt();
        
        Scanner sc5=new Scanner(System.in);
        System.out.println("Enter the Obtained Marks for Subject_5: ");
        int Subj_5=sc.nextInt();
        
        //Calculation of total marks and its percentage.
        Obtmarks= Subj_1+Subj_2+Subj_3+Subj_4+Subj_5;
        System.out.println("You obtained Total marks is: " +Obtmarks+" out of "+FullMarks);
        percentage=((Obtmarks*100)/FullMarks);
        System.out.println("You scored "+percentage+" % in full marks.");
        
        //Check Score for Grade.
        if(percentage>=90)
            System.out.println("Outstanding, A+ Grade.");
        if(percentage>=80&&percentage<90)
            System.out.println("Excellent,A Grade.");
        if(percentage>=70&&percentage<80)
            System.out.println("Very Good,B+ Grade.");
        if(percentage>=60&&percentage<70)
            System.out.println("Good,B");
        if(percentage>=50&&percentage<60)
            System.out.println("Above Average,C+ Grade.");
        if(percentage>=40&&percentage<50)
            System.out.println("Average,C Grade.");
        if(percentage>=25&&percentage<40)
            System.out.println("Below Average,D Grade.");
        if(percentage>=1&&percentage<25)
            System.out.println("Insufficient,E Grade.");
        if(percentage==0)
            System.out.println("Null,N");
            
       
                     
        
        
    }
    
}
