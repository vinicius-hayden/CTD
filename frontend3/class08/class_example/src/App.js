import { useState } from 'react';

function App() {
  let [counter, defineCounter] = useState(0);
  let [name, defineName] = useState("Nome!");

  function addOne() {
    defineCounter(counter + 1);
    return <p>{counter}</p>
  }

  return (
    <>
      <input type="text" onChange={(event) => defineName(event.target.value)}/>
      <br/>
      {name}
      <br/>
      {counter}
      <br/>
      <button onClick={addOne}>+1</button>
    </>
  );
}

export default App;
