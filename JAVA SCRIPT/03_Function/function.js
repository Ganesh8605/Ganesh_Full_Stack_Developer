


//! how to create function

//! 1. Named function

function display()
{
    console.log("I am dispaly function");
    
}

display();

function add(a,b)
{
    console.log(a+b);
    
}
add(5,6);
add(5,10);
add(11,10);

//! Arrow function


//! Nested function

let outer=()=>{

    console.log("I am outer function");

    let inner=() => {
        console.log("I am inner function");        
    }
    inner()
}
outer()

//! Lexical scopping
// in nested function inner function can access all the properties of outer function but outer function 
//cannot access the properties of innner function,this is called lexical scopping. 

let parent = ()=>{
    let a=10;
    let child = ()=>{
        let b=20;
        console.log(a);
        console.log(b);
    }
    child();
}
parent();

//! Higher order function and callback function ****

// any function that takes another function as parameter.
// the function we are sending as a parameter to the highorder function is called callback fuction.

let practice =(a) =>{
    // console.log(a); --------------->it throws full fuction as a output not the output so,we call only parameter.
    a();
}

practice(()=>{
    console.log("how are you?");
    
});

//----------------------------------->
let hof=(a)=>{
    a();
}

hof(()=>{
    console.log("higher order and callback fuction");
});

//! IIFE (immediate invoke function expression)

(function()
{
    console.log("I am life function");
    
})();