import java.io.*;
import java.io.File;

public class Installer {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Directory dirsAndFiles = new Directory();
        for(int i=0 ; i < dirsAndFiles.dirsLength();i++){
            sb.append(creatorDirectory(dirsAndFiles.dirsGet(i)));
            if(dirsAndFiles.dirsGet(i).equals("/Users/shamil/Games/src/main/")){
                for(int j = 0; j < dirsAndFiles.filesLength();j++)
                sb.append(creatorFile(dirsAndFiles.dirsGet(i),dirsAndFiles.fileGet(j)));
            }
        }
        String text = sb.toString();

        try(FileWriter writer = new FileWriter("/Users/shamil/Games/temp/temp.txt",false)){
            writer.write(text);
            writer.flush();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static String creatorDirectory(String nameDir){
        File installer = new File(nameDir);
        if(installer.mkdir()){
            return nameDir + " was created\n";
        }else{
            return nameDir + " wasn't created\n";
        }
    }

    public static String creatorFile(String nameDir, String nameFile){
        File installer = new File(nameDir, nameFile);
            try {
                File newFile = new File(nameDir + "\\" + nameFile);
                if(newFile.createNewFile())
                    return nameDir + " and " + nameFile + " were created\n";
            } catch (IOException exception) {
                return exception.getMessage();
            }
        return nameDir + " and " + nameFile + " weren't created\n";
    }
}
