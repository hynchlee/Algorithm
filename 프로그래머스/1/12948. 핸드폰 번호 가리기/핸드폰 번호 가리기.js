function solution(phone_number) {
    var answer = phone_number.substring(0, phone_number.length - 4).replaceAll(/[0-9]/g, "*") + phone_number.substring(phone_number.length - 4);
    return answer;
}
