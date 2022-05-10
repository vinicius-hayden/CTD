const checkbox1 = document.querySelector('#checkbox');
const darkbackground = document.querySelector('.body');

checkbox1.addEventListener('change' , function(){
    // document.body.style.background = "black";
    darkbackground.classList.remove('body');
    darkbackground.classList.toggle('dark');
})