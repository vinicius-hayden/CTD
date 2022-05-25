window.onload=function(){
    const button = document.getElementById("button");
    
    button.addEventListener('click', function(){
    
        let titleInput = document.getElementById("titleInput").value;
        let urlInput = document.getElementById("url").value    
        let description = document.getElementById("description").value;
        
        if(titleInput == '' || urlInput == '' || description == ''){
            alert("Please, inform every input");
        }
        else {
            const div = document.createElement('div');
            const h1 = document.createElement('h1');
            const img = document.createElement('img');
            const p = document.createElement('p');
            
            document.body.appendChild(div);
            div.setAttribute('id', 'divCard');
    
            div.appendChild(h1);
            div.appendChild(img);
            div.appendChild(p);
    
            h1.innerHTML = `<h1>${titleInput}</h1>`;
            img.setAttribute('src', `${urlInput}`);
            p.innerHTML = `<p>${description}</p>`;
        }
    })
}