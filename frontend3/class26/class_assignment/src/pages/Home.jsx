import { useState } from "react";
import { Link } from "react-router-dom"
import Publicacao from './Publicacao';

export default function Home() {

    const [artigos, definirArtigos] = useState([]);

    fetch('https://jsonplaceholder.typicode.com/posts/')
    .then(response => {
        return response.json()
    })
    .then(responseJSON => {
        definirArtigos(responseJSON);
    })


    return (
        <>
            <Link to="/">publicacoes</Link>
            <ul>
                {artigos.map(artigo => <Publicacao titulo={artigo.title} body={artigo.body}/>)}
            </ul>
        </>
    )
}
