function solution(arr, divisor) {
    var answer = [];
    var count = 0;
    arr.sort(function(a, b) {
        return a - b;
    });
    for (let i = 0; i < arr.length; i++) {
        if(arr[i] % divisor == 0){
            answer.push(arr[i]);
            count++;
        }
    }
    if(count === 0){
        answer.push(-1);
    }
    return answer;
}