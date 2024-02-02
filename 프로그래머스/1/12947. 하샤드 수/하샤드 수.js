function solution(x) {
    var answer = true;
    var sum = 0;
    var num = x;
    while(num>=1){
        sum += num%10;
        num = Math.floor(num/10);
    }

    if(x%sum !== 0){
        answer = false;
    }else{
        answer = true;
    }
    return answer;
}