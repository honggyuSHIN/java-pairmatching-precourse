package pairmatching;

import pairmatching.controller.CrewController;
import pairmatching.service.CrewService;
import pairmatching.service.MissionService;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행
        CrewService crewService = new CrewService();
        MissionService missionService = new MissionService();
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        CrewController crewController = new CrewController(crewService,missionService, inputView, outputView);
        crewController.run();
    }
}
