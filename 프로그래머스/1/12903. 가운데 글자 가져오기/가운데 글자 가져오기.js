function solution(s) {
    var answer = '';
    if(Math.floor(s.length%2) === 0){
        answer = s.charAt(Math.floor(s.length/2-1))+s.charAt(Math.floor(s.length/2));
    }else{
        answer = s.charAt(Math.floor(s.length/2));
    }
    return answer;
}