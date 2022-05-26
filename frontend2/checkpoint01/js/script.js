window.onload=function(){
    const button = document.getElementById("button");
    const mainDiv = document.createElement('div');
    document.body.appendChild(mainDiv);
    mainDiv.setAttribute('id', 'mainDiv');

    button.addEventListener('click', function(){
    
        let titleInput = document.getElementById("titleInput").value;
        let urlInput = document.getElementById("url").value    
        let description = document.getElementById("description").value;
        
        if(titleInput == '' || urlInput == '' || description == ''){
            alert("Please, inform every input");
        }
        else {
            const divCard = document.createElement('div');
            const h1 = document.createElement('h1');
            const img = document.createElement('img');
            const p = document.createElement('p');
            
            mainDiv.appendChild(divCard);
            divCard.setAttribute('id', 'divCard');
            
            divCard.appendChild(h1);
            divCard.appendChild(img);
            divCard.appendChild(p);
    
            h1.innerHTML = titleInput;
            img.setAttribute('src', `${urlInput}`);
            p.innerHTML = description;
        }
    })
}