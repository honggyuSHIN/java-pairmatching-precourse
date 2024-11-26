package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;
import pairmatching.missionModel.Mission;

import java.util.List;

public class InputView {
    public String printFunctionChoose() {
        /*기능을 선택하세요.
1. 페어 매칭
2. 페어 조회
3. 페어 초기화
Q. 종료
1*/

        System.out.println("기능을 선택하세요.");
        System.out.println("1. 페어 매칭");
        System.out.println("2. 페어 조회");
        System.out.println("3. 페어 초기화");
        System.out.println("Q. 종료");
        String choose = Console.readLine();
        return choose;
    }

    public String printMissions() {
        System.out.println("#############################################");
        System.out.println("과정 ");
        System.out.println("미션:\n" +
                "  - 레벨1: 자동차경주 | 로또 | 숫자야구게임\n" +
                "  - 레벨2: 장바구니 | 결제 | 지하철노선도\n" +
                "  - 레벨3: \n" +
                "  - 레벨4: 성능개선 | 배포\n" +
                "  - 레벨5: \n");
        System.out.println("#############################################");
        System.out.println("과정, 레벨, 미션을 선택하세요.\n" +
                "ex) 백엔드, 레벨1, 자동차경주\n");
        return Console.readLine();
    }
}
