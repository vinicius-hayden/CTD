import Formulario from "./components/Formulario";
import Modal from "./components/Modal";

function App() {
  return (
    <>
      <div className="container my-5">
        <Formulario/>
        <Modal nome="Joao" idade="17"/>
      </div>
    </>
  );
}

export default App;
