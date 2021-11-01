<HTML>
<HEAD>
<TITLE>MenuDriven</TITLE>
</HEAD>

<BODY>
<H1> Menu Driven Program For Experiment</H1>
<p>
<SCRIPT>
var i,j,r,ch;
var n;
var sum=0;

ch=parseInt(prompt(“Enter 1 for Armstrong number and 2 for sum of digits”));
switch(ch)

{

case 1:
const num1 = parseFloat(prompt("Enter first number: "));
const num2 = parseFloat(prompt("Enter second number: "));
const num3 = parseFloat(prompt("Enter third number: "));
let largest;

if(num1 >= num2 && num1 >= num3) {
    largest = num1;
}
else if (num2 >= num1 && num2 >= num3) {
    largest = num2;
}
else {
    largest = num3;
}


console.log("The largest number is " + largest);
break;

case 2:
n=parseInt(prompt(“Enter any number for finding sum of digits”));
while(n>0)
{
sum=sum+n%10;
n=parseInt(n/10);
}
document.write(“<br>”+”Sum of digits= “+sum);
break;
default :
alert(“Wrong choice”);
}

</SCRIPT>
</BODY>
<HTML>