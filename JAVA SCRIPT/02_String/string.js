//! hoe to declare string

let str1="hello";

console.log(str1);
console.log(typeof str1);

let str2='HI';
console.log(str2);
console.log(typeof str2);

let str3 = 'hello everyone';
console.log(str3);
console.log(typeof str3);

//!how to know the length of the string

console.log(str1.length);
console.log(str2.length);
console.log(str3.length);

//! methods of string

//! 1.toUpperCase()

// this method is used to convert any string into uppercase and it will return one new string.
// it will not modify the original string.

let sname = "santhoshkumari";

let upper = sname.toUpperCase();
console.log(sname);

console.log(upper);

//! 2. toLowerCase()

let name1 = "FUNDAMENTAL";

let lower = name1.toLowerCase();

console.log(name1);
console.log(lower);

//! 3.trim()

//this method is used to remove the white spaces from both the sides of the string and
// it will return the new string.

let msg = "    good morning ";

console.log(msg.length);
console.log(msg);

let msg2 = msg.trim();

console.log(msg2);
console.log(msg2.length);
console.log(msg.length);

//! 4.indexOf()
// it is used to return the index of the given character from the string.
// it will take the first occurance of the given character.

let subject = "javascript";

console.log(subject.indexOf("a"));          // 1

//! 5.lastIndexOf()

// it is used to return the last occurance index of the given character from the string.

console.log(subject.lastIndexOf("a"));      // 3

//! 6.charAt()

// this is used to know the character which is present at the given index.

console.log(subject.charAt(5));             // c

//! 7.concat()

// it is used to combine two or more than two strings and it will return one new string.

let msg3="hello everyone,";
let msg4="good morning";

console.log(msg3.concat(" ",msg4, " ","!!!"));

//! 8.includes()

// it is used to know the given string is present or not. if it is present it will true else it will return false.

console.log(msg3.includes("a"));
console.log(msg3.includes("e"));
console.log(msg3.includes("hello"));

//! 9.replace()

// it is used to replace one string with another string and it will return one new string.
// it will replace only the first occurance.

let msg5 = "santhosh to bangalore";
console.log(msg5.replace("a","@"));
console.log(msg5);

//! 10.replaceAll()

console.log(msg5.replaceAll("a","@"));

//! 11.split()

let str4 = "good afternoon everyone";

console.log(str4.split(" "));

//! 12.slice()

// it is used to extract one string from another string.
// it will take two parameters (start index,end index)
// it will not includes the endIndex value.
// here we can give negative value also.
// we can traverse only from left to right side.

let str5 = "good afternoon";

console.log(str5.slice(0,5));  //good

console.log(str5.slice(5));    //afternoon

console.log(str5.slice(-4));   //noon
  
console.log(str5.slice(-4,-1));  //noo

//! 13.substring()

console.log(str5.substring(0,3));  //goo

console.log(str5.substring(5));     //afternoon

console.log(str5.substring(-4));    //good afternoon

console.log(str5.substring(4,0));   //good 

// ! String Interpolation

let a=10;

let b=20;

// the addition of 10 and 20 is 30

console.log(`the addition of ${a} and ${b} is ${a+b}`);

 





