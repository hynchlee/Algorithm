function solution(s) {
    var answer = true;
    var p = 0;
    var y = 0;
    s = s.toLowerCase();
    for (let index = 0; index < s.length; index++) {
        if (s.charAt(index) === 'p') {
            p++;
        } else if (s.charAt(index) === 'y') {
            y++;
        }
    }
    if (p !== y) {
        answer = false;
    }
    return answer;
}
