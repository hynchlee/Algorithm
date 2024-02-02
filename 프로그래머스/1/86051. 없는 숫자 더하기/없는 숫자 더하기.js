function solution(numbers) {
    var answer = 0;
    var sum = 45;
    var s = 0;
    for (let i = 0; i < numbers.length; i++) {
        s += numbers[i];
    }
    answer = sum - s;
    return answer;
}