function solution(s) {
    var answer = true;
    if (s.length !== 4 && s.length !== 6) {
        answer = false;
    }
    for (let i = 0; i < s.length; i++) {
        if(!s.charAt(i).match(/[0-9]/)){
            answer = false;
            break;
        }
    }
    return answer;
}