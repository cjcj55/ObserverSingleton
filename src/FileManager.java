import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
    private static FileManager instance;
    private static Object mutex = new Object();

    private FileManager() {
        File file = new File("grades.txt");
        // Tries to create a new file.  Otherwise, does nothing
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static FileManager getInstance() {
        if (instance == null) {
            synchronized (mutex) {
                if (instance == null) {
                    instance = new FileManager();
                }
            }
        }
        return instance;
    }

    /**
     * Adds a grade to the file and notifies the observers
     * @param grade
     */
    public void addGrade(int grade) {

    }

    /**
     * Returns the first grade in the file.  Returns null if no items exist in the file
     * @return grade
     */
    public Integer getFirstGrade() {
        Integer grade = null;

        return grade;
    }

    /**
     * Returns a list of grades
     * @return list
     */
    public ArrayList<Integer> getAllGrades() {
        return null;
    }

    /**
     * Deletes all grades in the file and notifies the observers
     */
    public void deleteAllGrades() {

    }
}
