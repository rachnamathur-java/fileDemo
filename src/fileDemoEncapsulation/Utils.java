package fileDemoEncapsulation;

public class Utils {

    public static void chooseFileType(){
        System.out.println();
        System.out.println("To check status Select a File Type...");
        System.out.println();
        System.out.println("Press 1 for Pdf File");
        System.out.println("Press 2 for Word File");
        System.out.println("Press 3 for Google Sheet");
        System.out.println();
    }

    public static void newStatus(){
        System.out.println();
        System.out.println("Do you want to change the changeStatus of file...");
        System.out.println();
        System.out.println("Press 'R' to make it Read only...");
        System.out.println("Press 'W' to make it Write only...");
        System.out.println("Press 'RW' to make it Read and Write both...");
        System.out.println();
    }
}
