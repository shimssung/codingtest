package defualt;

public class Q8 {
    public String solution(String nickname) {
        String answer = "";
        for(int i=0; i<nickname.length(); i++){
            if(nickname.charAt(i) == 'l'){
                answer += "I";
            }
            else if(nickname.charAt(i) == 'w'){
                answer += "vv";
            }
            else if(nickname.charAt(i) == 'W'){
                answer += "VV";
            }
            else if(nickname.charAt(i) == 'O'){
                answer += "0";
            }
            else{
                answer += nickname.charAt(i);
            }
        }
        // if(answer.length() < 3){     이 부분 수정정
        while(answer.length() < 4){     // 수정 후
            answer += "o";
        }
        if(answer.length() > 8){
            answer = answer.substring(0, 8);
        }
        return answer;
    }

    public static void main(String[] args) {
        Q8 q8 = new Q8();
        String result = q8.solution("GO");
        System.out.println(result);
    }
}
