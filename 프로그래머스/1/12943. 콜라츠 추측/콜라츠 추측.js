function solution(num) {
    var answer = 0;
    var n = num;
    while (n !== 1) {
        if (n % 2 === 0) {
            n /= 2;
            answer++;
        } else {
            n = n * 3 + 1;
            answer++;
        }
        if(answer >= 500){
            answer = -1;
            break;
        }
    }
    return answer;
}