console.log("i am external javascript");
// how to declare variable;

let sname="santhosh";

console.log("name is "+sname);

// !re-declaration is not possible in let keyword.

var age;
age=30;

console.log("age is "+age);

var age=40;

console.log("now age is "+age);

// !re-declaration is possible in var keyword.

const aadharno=123456789012;

console.log("aadhar no "+aadharno);

//!aadharno=9999999999999;      error

//!const keyword cannot change the value & we cannot re-declare.

//!const Pi
//!=3.14;
//!we cannot do declaration and initiliasation in the different line.

//! data types in JS 

//? 1.primitive  2.non-primitive

//! 1.Number

let phno=9876543210;

console.log("phno "+phno);

console.log(typeof phno);

let salary=20000.50;

console.log("salary "+salary);

console.log(typeof salary);

//! how to know the datatype

// => by using typeof operator

//! 2.boolean

let isMarried=true;

console.log(isMarried);
console.log(typeof isMarried);

let haskid=true;

console.log(haskid);
console.log(typeof haskid);

//! 3.String

let city="chennai";
let state='tamilnadu';
let country='india'

console.log(city);
console.log(state);
console.log(country);

console.log(typeof city);
console.log(typeof state);
console.log(typeof country);

//! 4.undefined

let wifeName;

console.log(wifeName);
console.log(typeof wifeName);

//! 5.null

let noGf= null;

console.log("nogf "+noGf);
console.log(typeof noGf); //object

//! 6.bigint

let largenum=2n;

console.log(largenum);
console.log(typeof largenum);



//! 2. Non-primitive datatype

//array, function, object

//! 1. array

let arr=[20,"html",true,undefined];

console.log(arr);

//! 2.function

function add()
{
    console.log("I am add function");
}
add();

//! 3.object

let emp = {
    ename : "miller",
    eid   : 1001
}
console.log(emp);

console.log(emp.ename);

