function solution(arr) {
    var answer = 0;
    for (let index = 0; index < arr.length; index++) {
        answer += arr[index];        
    }
    return answer/arr.length;
}