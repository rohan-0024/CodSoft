import java.util.Scanner;


public class Grade {

    public static char getGrade(double average){
        char grade = switch ((int) average){
            case 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            case 5 -> 'E';
            default -> 'F';

        };
        return grade;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int math,phy,chem,eng,cs;


        System.out.println("Welcome to Student Grade Calculator");

        System.out.println("Enter marks for Mathematics : ");
        math=sc.nextInt();
        if(math > 100){
            System.out.println("Error.Maximum mark is 100.");
        }

        System.out.println("Enter marks for Physics : ");
        phy=sc.nextInt();
        if(phy > 100){
            System.out.println("Error.Maximum mark is 100.");
        }

        System.out.println("Enter marks for Chemistry : ");
        chem=sc.nextInt();
        if(chem > 100){
            System.out.println("Error.Maximum mark is 100.");
        }

        System.out.println("Enter marks for English : ");
        eng=sc.nextInt();
        if(eng > 100){
            System.out.println("Error.Maximum mark is 100.");
        }

        System.out.println("Enter marks for Computer Science : ");
        cs=sc.nextInt();
        if(cs > 100){
            System.out.println("Error.Maximum mark is 100.");
        }

        double total,avg;

        total = math+phy+chem+eng+cs;
        avg = total/5.0;

        char grade = getGrade(avg);


    }
}
