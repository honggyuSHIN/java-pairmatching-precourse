package pairmatching.controller;

import pairmatching.missionModel.Course;
import pairmatching.missionModel.Level;
import pairmatching.missionModel.Mission;
import pairmatching.service.CrewService;
import pairmatching.service.MissionService;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

import java.util.List;

public class CrewController {
    private final CrewService crewService;
    private final MissionService missionService;
    private final InputView inputView;
    private final OutputView outputView;

    public CrewController(CrewService crewService, MissionService missionService, InputView inputView, OutputView outputView) {
        this.crewService = crewService;
        this.missionService = missionService;
        this.inputView = inputView;
        this.outputView = outputView;
    }
    
    public void run() {
        String userChoose = printFunctionChoose();

        List<Mission> missions = saveMission();
        setMissions(missions);
        String chooseMission = inputView.printMissions();
        String[] chooseMissions = chooseMission.split(",");
        Mission userChooseMission = changeToMission(chooseMissions[0],chooseMissions[1],chooseMissions[2]);
        if (userChoose.equals("1")) {
            fairMatching(missions, userChooseMission);
        }
    }

    private Mission changeToMission(String chooseMission, String chooseMission1, String chooseMission2) {
        Course course = Course.valueOf(chooseMission);
        Level level = Level.valueOf(chooseMission1);
        return new Mission(course, level, chooseMission2);
    }

    private void setMissions(List<Mission> missions) {

    }

    private void fairMatching(Mission userChooseMission) {
        crewService.checkPair(userChooseMission);
    }




    public List<Mission> saveMission() {
        return missionService.saveMissions();
    }


    public String printFunctionChoose() {
        return inputView.printFunctionChoose();
    }


    public void readCrewFile() {
        List<String> backendCrews = crewService.readBackendCrewFile();

    }
}
