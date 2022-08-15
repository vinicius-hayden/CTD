function Item({ item }) { 
  return (
    <li>{item} - {item.name}</li>
  );
}

function List({title, itens}) { 
  return (
    <> 
      <h1>{title}</h1>
      <ul>
        <Item task={itens[0]}></Item>
        <Item task={itens[1]}></Item>
      </ul>
    </>
  );
}

export default { List };