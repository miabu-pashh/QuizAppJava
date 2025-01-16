import java.util.Scanner;
public class QuestionService {

    Question[] questions = new Question[5];
    public QuestionService(){
        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "siz of long", "2", "6", "4", "8", "8");
        questions[3] = new Question(4, "size of char", "2", "6", "4", "8", "2");
        questions[4] = new Question(5, "size of boolean", "1", "6", "4", "8", "1");
    }
    String selection[]=new String[5];

    public void playQuiz(){
        int i=0;
        for (Question q:questions){
            System.out.println("Question no:  "+ q.getId());
            System.out.println(q.getQuestion());
            System.out.println("1. "+ q.getOpt1());
            System.out.println("2. "+ q.getOpt2());
            System.out.println("3. "+ q.getOpt3());
            System.out.println("4. "+ q.getOpt4());
            Scanner sc=new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;

        }
        System.out.println("Your answers are: ");

        for (String s:selection){
            System.out.println(s);
        }

         
    
    }

    public void printScore()
    {
        int score=0;

        for(int i=0;i<questions.length;i++){

            Question q=questions[i];
            String correctAnswer=q.getAnswer();
            String userAnswer=selection[i];

            if(correctAnswer.equals(userAnswer)){
                score++;
            }

        }

        System.out.println("Your final score is : "+score+"/5");
    }

}