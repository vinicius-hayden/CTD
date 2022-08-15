import { List } from "./Components";

function App() {

  let task = [
    {
      id: 1,
      name: "Item1"
    } ,
    {
      id: 2,
      name: "Item2"
    }
  ]

  return (
    <>
      <List title="Title!"></List>
    </>
  );
}

export default App;
