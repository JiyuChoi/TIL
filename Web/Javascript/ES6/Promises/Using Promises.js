//1. Then (return Promise resolve)

// const amIPretty = new Promise((resolve, reject) => {
//     setTimeout(resolve, 3000, "Yes you are!");
// });

//amIPretty.then(value => console.log(value));

const amIPretty = new Promise((resolve, reject) => {
    resolve("Yes you are!");
});

const thenFn = value => console.log(value);

amIPretty.then(thenFn);

// 2.Catch (reject)
const amIPretty = new Promise((resolve, reject) => {
    setTimeout(reject, 3000, "You are ugly");
});

amIPretty
    .then(result => console.log(result)) //resolve
    .catch(error => console.log(error)); //reject

// then이 실행되면 catch 실행 X
// catch가 실행되면 then 실행 X