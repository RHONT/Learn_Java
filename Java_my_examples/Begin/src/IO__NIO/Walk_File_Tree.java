package IO__NIO;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class Walk_File_Tree {
    public static void main(String[] args) throws IOException {


        File for_read=new File("D:\\temp\\Сентябрь\\Path.txt"));
        Scanner file_scan=new Scanner(for_read);
        Path source= Paths.get(file_scan.nextLine());
        Path destionation= Paths.get(file_scan.nextLine());
        file_scan.close();
        Files.walkFileTree(source,new File_Update(source,destionation));
        System.out.println("Finish!");

    }
}

class File_Update extends SimpleFileVisitor<Path>{
    Path source;
    Path destination;

    public File_Update(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        Path new_dest=destination.resolve(source.relativize(dir));
            try {
                Files.copy(dir, new_dest);
                System.out.println("Папка: " + dir.getFileName() + " Скопирована");
            } catch (IOException e) {
                System.out.println("Папка:" + new_dest.getFileName() + " уже существует");
                //e.printStackTrace();
            }
            finally {
                return FileVisitResult.CONTINUE;
            }



    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        Path new_dest=destination.resolve(source.relativize(file));

            try {
                Files.copy(file,new_dest);
                System.out.println("Файл: " + file.getFileName() + " Скопирован");
            } catch (IOException e) {
                System.out.println("Файл:" + file.getFileName() + " уже существует");
                //e.printStackTrace();
            }
            finally {
                return FileVisitResult.CONTINUE;
            }


    }
}


