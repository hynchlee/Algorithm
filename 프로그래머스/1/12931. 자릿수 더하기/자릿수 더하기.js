function solution(n) {
    var answer = 0;
    while(true){
        answer += n%10;
        if(n<10) break;
        n = Math.floor(n/10);
    }
    return answer;
}