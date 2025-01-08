
public class Q1 {
	
//	문제 설명
//	당신은 동영상 재생기를 만들고 있습니다. 당신의 동영상 재생기는 10초 전으로 이동, 10초 후로 이동, 오프닝 건너뛰기 3가지 기능을 지원합니다. 각 기능이 수행하는 작업은 다음과 같습니다.
//
//	10초 전으로 이동: 사용자가 "prev" 명령을 입력할 경우 동영상의 재생 위치를 현재 위치에서 10초 전으로 이동합니다. 현재 위치가 10초 미만인 경우 영상의 처음 위치로 이동합니다. 영상의 처음 위치는 0분 0초입니다.
//	10초 후로 이동: 사용자가 "next" 명령을 입력할 경우 동영상의 재생 위치를 현재 위치에서 10초 후로 이동합니다. 동영상의 남은 시간이 10초 미만일 경우 영상의 마지막 위치로 이동합니다. 영상의 마지막 위치는 동영상의 길이와 같습니다.
//	오프닝 건너뛰기: 현재 재생 위치가 오프닝 구간(op_start ≤ 현재 재생 위치 ≤ op_end)인 경우 자동으로 오프닝이 끝나는 위치로 이동합니다.
//	동영상의 길이를 나타내는 문자열 video_len, 기능이 수행되기 직전의 재생위치를 나타내는 문자열 pos, 오프닝 시작 시각을 나타내는 문자열 op_start, 오프닝이 끝나는 시각을 나타내는 문자열 op_end, 사용자의 입력을 나타내는 1차원 문자열 배열 commands가 매개변수로 주어집니다. 
//	이때 사용자의 입력이 모두 끝난 후 동영상의 위치를 "mm:ss" 형식으로 return 하도록 solution 함수를 완성해 주세요.

	public int toSeconds(String Time) {
		String[] toTime = Time.split(":");
		return Integer.parseInt(toTime[0]) * 60 + Integer.parseInt(toTime[1]) ;
	}
	
	public String toTimeString(int Time) {
		int minutes = Time / 60;
		int seconds = Time % 60;
		return String.format("%02d:%02d", minutes, seconds);
	}
	
	public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
		
		int videoLength = toSeconds(video_len);
		int position = toSeconds(pos);
		int opStart = toSeconds(op_start);
		int opEnd = toSeconds(op_end);
		
		if(position >= opStart && position < opEnd ) {
			position = opEnd;
		}
		
		for(String command: commands) {
			if(command.equals("prev")) {
				position = Math.max(0, position - 10);
			} else if(command.equals("next")) {
				position = Math.min(videoLength, position + 10);
			}
		}
		
		if(position >= opStart && position < opEnd ) {
			position = opEnd;
		}
		
		return toTimeString(position);
	}
	
	public static void main(String[] args) {
		Q1 q1 = new Q1();
		String[] commands = {"next"};
		String result = q1.solution("07:22", "04:05", "00:15", "04:07", commands);
		System.out.println(result);
		

	}

}
