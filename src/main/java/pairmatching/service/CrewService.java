package pairmatching.service;

import pairmatching.crewModel.BackendCrew;
import pairmatching.crewModel.FrontendCrew;
import pairmatching.missionModel.CrewsPerBackend;

import pairmatching.missionModel.CrewsPerFrontend;
import pairmatching.missionModel.Mission;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CrewService {
    List<FrontendCrew> frontendCrews;
    List<BackendCrew> backendCrews;

    public List<String> readFrontendCrewFile() {
        String frontendFilePath = "src/main/resources/frontend-crew.md";
        List<String> frontendCrewsNames = null;
        try {
            frontendCrewsNames = Files.readAllLines(Paths.get(frontendFilePath));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return frontendCrewsNames;
    }

    public List<String> readBackendCrewFile() {
        String backendFilePath = "src/main/resources/backend-crew.md";
        List<String> backendCrewNames = null;
        try {
            backendCrewNames = Files.readAllLines(Paths.get(backendFilePath));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return backendCrewNames;
    }

    public List<FrontendCrew> saveFrontendCrews(List<String> frontendCrewNames) {
        try {
            for (String crewName : frontendCrewNames) {
                frontendCrews.add(new FrontendCrew(crewName));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return frontendCrews;
    }

    public List<BackendCrew> saveBackendCrews(List<String> backendCrewNames) {
        try {
            for (String crewName : backendCrewNames) {
                backendCrews.add(new BackendCrew(crewName));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return backendCrews;
    }

    public List<BackendCrew> matchBackendCrew(Mission userMission) {
        if (userMission.getCourse().equals("백엔드")) {
            CrewsPerBackend crewsPerBackend = new CrewsPerBackend();
            List<BackendCrew> matchCrews = crewsPerBackend.getBackendCrewsPerMission(userMission);
            if (matchCrews != null) {
                return matchCrews;
            }
        }
        return null;
    }

    public void checkPair(Mission userChooseMission) {
    }
}
