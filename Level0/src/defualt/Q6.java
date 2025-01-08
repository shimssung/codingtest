package defualt;

public class Q6 {

	public int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for(int i=0; i<change.length; i++){
            usage = usage * (change[i] + 100) / 100;
            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }
	
    public static void main(String[] args) {
        Q6 q6 = new Q6(); // Q6 객체 생성
        
        // 테스트 데이터
        int storage = 5141;
        int usage = 500;
        int[] change = {10, -10, 10};
        
        // solution 메서드 실행
        int result = q6.solution(storage, usage, change);
        
        // 결과 출력
        System.out.println("Result: " + result);
    }
	
}
