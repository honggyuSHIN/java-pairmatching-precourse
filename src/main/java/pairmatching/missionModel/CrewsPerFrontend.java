package pairmatching.missionModel;

import pairmatching.crewModel.FrontendCrew;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CrewsPerFrontend {
    private final Map<Mission, List<FrontendCrew>> frontendCrewsPerMission;

    public CrewsPerFrontend(Map<Mission, List<FrontendCrew>> frontendCrewsPerMission) {
        this.frontendCrewsPerMission = frontendCrewsPerMission;
    }

    public CrewsPerFrontend() {
        this.frontendCrewsPerMission = new HashMap<>();
    }

    public Map<Mission, List<FrontendCrew>> getFrontendCrewsPerMission() {
        return frontendCrewsPerMission;
    }

    public void addFrontendCrewsPerMission(Mission mission, List<FrontendCrew> frontendCrew) {
        frontendCrewsPerMission.put(mission, frontendCrew);
    }



}
