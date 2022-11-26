import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();

        File src = new File("C:\\Users\\galka\\IdeaProjects\\Games\\src");
        if (src.mkdir())output.append("Директория src создана!");

        File res = new File("C:\\Users\\galka\\IdeaProjects\\Games\\res");
        if (res.mkdir())output.append("Директория res создана!");

        File savegames = new File("C:\\Users\\galka\\IdeaProjects\\Games\\savegames");
        if (savegames.mkdir())output.append("Директория savegames создана!");

        File temp = new File("C:\\Users\\galka\\IdeaProjects\\Games\\temp");
        if (temp.mkdir())output.append("Директория temp создана!");

        //В каталоге src создайте две директории: main, test.
        File main = new File("C:\\Users\\galka\\IdeaProjects\\Games\\src\\main");
        if (main.mkdir())output.append("Директория main создана в категории src");

        File test = new File("C:\\Users\\galka\\IdeaProjects\\Games\\src\\test");
        if (test.mkdir())output.append("Директория test создана в категории src");



        File mainFile = new File("C:\\Users\\galka\\IdeaProjects\\Games\\src\\main\\Main.java");
        try {
            if (mainFile.createNewFile())output.append("Файл Main был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File utilsFile = new File("C:\\Users\\galka\\IdeaProjects\\Games\\src\\main\\Utils.java");
        try {
            if (utilsFile.createNewFile())output.append("Файл Utils был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


        File drawables = new File("C:\\Users\\galka\\IdeaProjects\\Games\\res\\drawables");
        if (drawables.mkdir())output.append("Директория src создана");
        File vectors = new File("C:\\Users\\galka\\IdeaProjects\\Games\\res\\vectors");
        if (vectors.mkdir())output.append("Директория res создана");
        File icons = new File("C:\\Users\\galka\\IdeaProjects\\Games\\res\\icons");
        if (icons.mkdir())output.append("Директория temp создана");


        File tempTxt = new File("C:\\Users\\galka\\IdeaProjects\\Games\\src\\main\\temp.txt");
        try {
            if (tempTxt.createNewFile())output.append("Файл tempTxt был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileWriter writer = new FileWriter("C:\\Users\\galka\\IdeaProjects\\Games\\src\\main\\temp.txt", false)) {
            writer.write(output.toString());
            writer.append('\n');
            writer.append('!');
            writer.flush();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            }
        }
    }
