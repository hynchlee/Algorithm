function solution(absolutes, signs) {
    var answer = 0;
    for (let i = 0; i < absolutes.length; i++) {
        if(!signs[i]){
            absolutes[i] = absolutes[i]*(-1);
            answer += absolutes[i];
        }else{
            answer += absolutes[i];
        }
    }
    return answer;
}