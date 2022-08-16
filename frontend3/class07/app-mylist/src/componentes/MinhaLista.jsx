
// Passe as propriedades produto e preço para o componente...
function Produto() {
  return (
    <>
      <li>Nome do produto - R$ preço</li>
    </>
  )
}

export default function MinhaLista({ titulo, produtos }) {

  return (
    <article>
      <h1>{titulo}</h1>
      <section>
        <h2>Cinco primeiros produtos</h2>
        <ul>
          {
            produtos.map((produto, indice) => {
              if (indice <= 4) { 
                <li> Indice:{indice} - {produto.nome} </li>
              }
            })
          }
          < Produto />
        </ul>
      </section>
      <section>
        <h2>Três produtos de maior preço</h2>
        <ul>
          {
            produtos.filter((produto, indice) => {
              if (produto.idade > 10) { 
                <li> Indice:{indice} - {produto.nome} - {produto.idade} </li>
              } 
            })
          }
          <Produto />
        </ul>
      </section>
      <section>
        <h2>O produto de id 4</h2>
        <ul>
          {
           produtos.find((produto, indice) => {
            
            if(produto.id == 4) { 
              <li> Indice:{indice} - {produto.nome} </li>
            }
           })
          }
          <Produto />
        </ul>
      </section>
    </article>
  )
}