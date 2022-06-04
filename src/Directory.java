import java.util.*;

public class Directory{

    private String[] dirs;
    private String[] files;

    public Directory() {
        this.dirs = new String[]{
                "/Users/shamil/Games",
                "/Users/shamil/Games/temp",
                "/Users/shamil/Games/src",
                "/Users/shamil/Games/res",
                "/Users/shamil/Games/savegames",
                "/Users/shamil/Games/src/main",
                "/Users/shamil/Games/src/test",
                "/Users/shamil/Games/src/main/",
                "/Users/shamil/Games/res/drawables",
                "/Users/shamil/Games/res/vectors",
                "/Users/shamil/Games/res/icons"};
        this.files = new String[]{
                "Main.java",
                "Utils.java"};
    }

    public String dirsGet(int index){
        return this.dirs[index];
    }

    public String fileGet(int index){
        return this.files[index];
    }

    public int dirsLength(){
        return this.dirs.length;
    }

    public int filesLength(){
        return this.files.length;
    }
}