const items = document.querySelectorAll('.selections li');

items.forEach(function(option){
    option.addEventListener('click', function() {
        const change = document.getElementById(this.id);
        change.style.background = "black";
    })
})