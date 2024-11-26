package pairmatching.service;

import pairmatching.missionModel.Course;
import pairmatching.missionModel.Level;
import pairmatching.missionModel.Mission;

import java.util.ArrayList;
import java.util.List;

public class MissionService {

    public List<Mission> saveMissions() {
        List<Mission> missions = new ArrayList<>();
        missions.add(addMission(Course.FRONTEND, Level.LEVEL1, new String[]{"자동차경주", "로또","숫자야구게임"}));
        missions.add(addMission(Course.BACKEND, Level.LEVEL1, new String[]{"자동차경주", "로또", "숫자야구게임"}));
        missions.add(addMission(Course.FRONTEND, Level.LEVEL2, new String[]{"장바구니", "결제", "지하철노선도"}));
        missions.add(addMission(Course.BACKEND, Level.LEVEL2, new String[]{"장바구니", "결제", "지하철노선도"}));
        missions.add(addMission(Course.FRONTEND, Level.LEVEL4, new String[]{"성능개선", "배포"}));
        missions.add(addMission(Course.BACKEND, Level.LEVEL4, new String[]{"성능개선", "배포"}));
        return missions;
    }

    public Mission addMission(Course course, Level level, String[] tasks) {
        Mission mission = new Mission(course, level);
        for (String task : tasks) {
            mission.addTask(task);
        }
        return mission;
    }

    public Mission makeMission(String course, String level, String mission) {
        Course course1 = Course.valueOf(course);
        Level level1 = Level.valueOf(level);
        if (course.equals("백엔드")) {
            course1 = Course.BACKEND;
        }
        course1 = Course.FRONTEND;

        if (level.equals("레벨1")) {
            level1 = Level.LEVEL1;
        }
        if (level.equals("레벨2")) {
            level1 = Level.LEVEL2;
        }
        if (level.equals("레벨3")) {
            level1 = Level.LEVEL3;
        }
        if (level.equals("레벨4")) {
            level1 = Level.LEVEL4;
        }
        if (level.equals("레벨5")) {
            level1 = Level.LEVEL5;
        }
        return new Mission(course1, level1, mission);
    }
}
