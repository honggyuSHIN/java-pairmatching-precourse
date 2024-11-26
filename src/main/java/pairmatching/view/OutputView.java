package pairmatching.view;

import java.util.List;

public class OutputView {

    public void printFrontendCrew(List<String> frontendCrews) {
        System.out.println("프론트엔드 크루 목록");
        for (String frontendCrew : frontendCrews) {
            System.out.println(frontendCrew);
        }

    }

    public void printBackendCrew(List<String> backendCrews) {
        System.out.println("백엔드 크루 목록");
        for (String backendCrew : backendCrews) {
            System.out.println(backendCrew);
        }
    }
}
