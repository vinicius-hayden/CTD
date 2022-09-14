import Nav from "./components/Nav";

export default function App() {
  return (
    <div className="container">
      <div className="row">
        <div className="col">
          {/*
							O componente Nav é responsável pela navegação
							da Aplicação.
						*/}
          <Nav />
        </div>
      </div>

      <div className="row my-3">
        <div className="col">
          {/*
							Adicione o container da rota aqui...
						*/}
        </div>
      </div>
    </div>
  );
}
