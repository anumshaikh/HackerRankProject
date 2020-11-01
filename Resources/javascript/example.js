
function factorial(n){
    var x=1;
    for (var i=n;i>=1;i--)
        x=x*i;
    return x;
}

function Regex(s){
    let re = /^([aeiou]).+\1$/;
    return re;
}
function main() {
    const n = +(readLine());

    console.log(factorial(n));
}