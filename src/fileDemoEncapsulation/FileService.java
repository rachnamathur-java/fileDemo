package fileDemoEncapsulation;

import java.util.Scanner;

public class FileService {
    Scanner scanner = new Scanner(System.in);
    //FileDemo fileDemo = new FileDemo();
    PdfFile pdfFile = new PdfFile();
    WordFile wordFile = new WordFile();
    GoogleSheet googleSheet = new GoogleSheet();

    public void currentStatus(FileDemo fileDemo) {

        System.out.println("Is this file Readable. Current status :: "+ fileDemo.isReadOnly());
        System.out.println("Is this file Writable. Current status :: "+ fileDemo.isWriteOnly());
    }

    public void setFileToReadOnly(FileDemo fileDemo, boolean b){
        fileDemo.setReadOnly(b);
        System.out.println("This file is now Read only. Current status :: "+fileDemo.isReadOnly());
    }

    public void setFileToWriteOnly(FileDemo fileDemo, boolean b){
        fileDemo.setWriteOnly(b);
        System.out.println("This file is now Write only. Current status :: "+fileDemo.isWriteOnly());
    }

    public void setFileToReadAndWriteBoth(FileDemo fileDemo, boolean b){
        fileDemo.setReadOnly(b);
        fileDemo.setWriteOnly(b);
        System.out.println("This file is now Readable and Writable both.");
        System.out.println();
        System.out.println("This file is now Read only. Current status :: "+fileDemo.isReadOnly());
        System.out.println("This file is now Write only. Current status :: "+fileDemo.isWriteOnly());

    }

    public void changeStatus(FileDemo fileDemo){
        String userChoise = scanner.next();
        System.out.println();
        if (userChoise.equalsIgnoreCase("R")){
            setFileToReadOnly(fileDemo, true);
        } else if (userChoise.equalsIgnoreCase("W")) {
            setFileToWriteOnly(fileDemo, true);
        } else if (userChoise.equalsIgnoreCase("RW")) {
            setFileToReadAndWriteBoth(fileDemo , true);
        }else {
            System.out.println("Something went wrong...");
        }
    }

    public  void service(){
        Utils.chooseFileType();
        int userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                pdfFile.pdfDetails();
                currentStatus(pdfFile);
                Utils.newStatus();
                changeStatus(pdfFile);
                break;

            case 2:
                wordFile.wordDetails();
                currentStatus(wordFile);
                Utils.newStatus();
                changeStatus(wordFile);
                break;

            case 3:
                googleSheet.googleSheetDetails();
                currentStatus(googleSheet);
                Utils.newStatus();
                changeStatus(googleSheet);
                break;
            default:
                System.out.println("please select a valid file type...");
        }

    }




}
