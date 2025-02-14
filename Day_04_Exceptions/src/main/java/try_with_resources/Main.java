package try_with_resources;

public class Main {
    public static void main(String[] args) {
        String filePath="src/main/resources/info.txt";   //remove file or  give wrong path to test exception
        TryWithResourcesDemo.generateException(filePath);
    }
}
