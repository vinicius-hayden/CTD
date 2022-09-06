import { useEffect, useState } from "react";

function Item({ post }) {
  return <li> {post} </li>;
}

export default function App() {
  const [artigos, definirArtigos] = useState([]);
  const [comentarios, definirComentarios] = useState([]);
  const [perfil, definirPerfil] = useState({});

  useEffect(() => {
    fetch("http://localhost:3000/posts")
      .then((serverResponse) => {
        return serverResponse.json();
      })
      .then((serverResponseJSON) => {
        definirArtigos(serverResponseJSON);
      });

    fetch("http://localhost:3000/comments")
      .then((serverResponse) => {
        return serverResponse.json();
      })
      .then((serverResponseJSON) => {
        definirComentarios(serverResponseJSON);
      });

    fetch("http://localhost:3000/profile")
      .then((serverResponse) => {
        return serverResponse.json();
      })
      .then((serverResponseJSON) => {
        definirPerfil(serverResponseJSON.name);
      });
  }, []);

  return (
    <>
      <h1> Publicações </h1>
      <div>
        {artigos.map( (article) => <div key={article.id}> {article.title} </div>)}
      </div>
      <h1> Comentarios </h1>
      <div>
        {comentarios.map( (comment) => <div key={comment.id}> {comment.body} </div>)}
      </div>
      <h1> Perfil </h1>
      <div>
        {perfil}
      </div>
    </>
  );
}
