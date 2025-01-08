package defualt;

public class Q5 {
	
	// 심폐소생술은 다음과 같은 순서를 통해 실시합니다.
	// 1, check
	// 2. call
	// 3. pressure
	// 4. respiration
	// 5. repeat
	
	// 배열에 무작위로 들어간 cpr 순서를 리턴해주세요.
	// 입력 예시
	// ["call", "respiration", repeat", "check", "pressure"]
	
	// 출력 예시
	// [2, 4, 5, 1, 3]

	public int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for(int i=0; i<cpr.length; i++){
            for(int j=0; j<basic_order.length; j++){
                if(cpr[i].equals(basic_order[j])){
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        return answer;
	}
	

}
