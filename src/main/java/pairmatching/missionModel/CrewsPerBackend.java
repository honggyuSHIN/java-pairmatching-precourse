package pairmatching.missionModel;

import pairmatching.crewModel.BackendCrew;
import pairmatching.crewModel.FrontendCrew;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CrewsPerBackend {
    private final Map<Mission, List<BackendCrew>> backendCrewsPerMission;

    public CrewsPerBackend(Map<Mission, List<BackendCrew>> backendCrewsPerMission) {
        this.backendCrewsPerMission = backendCrewsPerMission;
    }

    public CrewsPerBackend() {
        this.backendCrewsPerMission = new HashMap<>();
    }

    public List<BackendCrew> getBackendCrewsPerMission(Mission mission) {
        return backendCrewsPerMission.getOrDefault(mission, null);
    }

    public void addBackendCrewsPerMission(Mission mission, List<BackendCrew> backendCrews) {
        backendCrewsPerMission.put(mission, backendCrews);
    }

}
