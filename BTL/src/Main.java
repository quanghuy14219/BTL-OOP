import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        DictionaryManagement dima = new DictionaryManagement(dictionary);
        DictionaryCommandline dico = new DictionaryCommandline(dictionary);
        int choose;
        Scanner scan=new Scanner(System.in);
        do{
            menu();
            System.out.println("Choose: ");
            choose=scan.nextInt();
            switch (choose){
                case 1:


                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.err.println("Goodbye!!!");
                    break;
            }
        }while(choose!=4);
    }
    static void menu(){
        System.out.println("1.Keyboard interface");
        System.out.println("2.Command line interface");
        System.out.println("3.Graphic interface");
        System.out.println("4.Exit");
    }
}
