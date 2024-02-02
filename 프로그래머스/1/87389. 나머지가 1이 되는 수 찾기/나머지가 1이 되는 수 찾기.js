function solution(n) {
    var answer = 0;
    for (let index = 1; index < n; index++) {
        if(n%index == 1){
            answer = index;
            break;
        }
    }
    return answer;
}