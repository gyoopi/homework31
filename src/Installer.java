import java.io.*;
import java.io.File;

public class Installer {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(creatorDirectory("/Users/shamil/Games"));
        sb.append(creatorDirectory("/Users/shamil/Games/temp"));
        sb.append(creatorDirectory("/Users/shamil/Games/src"));
        sb.append(creatorDirectory("/Users/shamil/Games/res"));
        sb.append(creatorDirectory("/Users/shamil/Games/savegames"));
        sb.append(creatorDirectory("/Users/shamil/Games/src/main"));
        sb.append(creatorDirectory("/Users/shamil/Games/src/test"));
        sb.append(creatorFile("/Users/shamil/Games/src/main/", "Main.java"));
        sb.append(creatorFile("/Users/shamil/Games/src/main/", "Utils.java"));
        sb.append(creatorDirectory("/Users/shamil/Games/res/drawables"));
        sb.append(creatorDirectory("/Users/shamil/Games/res/vectors"));
        sb.append(creatorDirectory("/Users/shamil/Games/res/icons"));
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
