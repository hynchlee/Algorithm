function solution(x, n) {
    var answer = [];
    for (let index = 0; index < n; index++) {
        answer.push(x+(x*index));
    }
    return answer;
}