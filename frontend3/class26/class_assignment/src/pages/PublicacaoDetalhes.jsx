import Link from "react-router-dom"


export default function PublicacaoDetalhes() {

    fetch('https://jsonplaceholder.typicode.com/posts/')
    .then(response => {
        return response.json()
    })
    .then(responseJSON => {
        responseJSON.title;
        responseJSON.body;
    })

    return (
        <Link to="publicacoes/{id}"></Link>
    )
}