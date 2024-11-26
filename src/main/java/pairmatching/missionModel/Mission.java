package pairmatching.missionModel;



import java.util.ArrayList;
import java.util.List;

public class Mission {
    private Course course;
    private Level level;
    private List<String> tasks;

    public Mission(Course course, Level level) {
        this.course = course;
        this.level = level;
        this.tasks = new ArrayList<>();
    }

    public Mission(Course course, Level level, String task) {
        this.course = course;
        this.level = level;
        this.tasks = new ArrayList<>();
        this.tasks.add(task);
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public Course getCourse() {
        return course;
    }

    public Level getLevel() {
        return level;
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "Course: " + course.getName() + ", Level: " + level.getName() + ", Tasks: " + tasks;
    }

}

