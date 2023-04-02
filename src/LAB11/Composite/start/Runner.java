package LAB11.Composite.start;

public class Runner {
    public static void main(String[] args) {
        // Create a directory and add some files and subdirectories
        Directory root = new Directory("Root");
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        Directory dir1 = new Directory("Dir1");
        File file3 = new File("File3.txt");
        File file4 = new File("File4.txt");
        Directory dir2 = new Directory("Dir2");
        root.addComponent(file1);
        root.addComponent(file2);
        root.addComponent(dir1);
        dir1.addComponent(file3);
        dir1.addComponent(file4);
        dir1.addComponent(dir2);

        // Display the entire file system
        root.display();
    }
}
//EXAMPLE OUTPUT:
//Directory: Root
//File: File1.txt
//File: File2.txt
//Directory: Dir1
//File: File3.txt
//File: File4.txt
//Directory: Dir2