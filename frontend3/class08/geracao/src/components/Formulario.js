export default function Formulario() {
  return (
    <>
      <div className="row mb-3">
        <div className="col">
          <article>
            <h1 className="text-center">Qual minha geração?</h1>
          </article>
        </div>
      </div>
      <div className="row">
        <div className="col-12 col-md-6">
          <div className="form-group my-2">
            <label className="mb-2" htmlFor="idade">Seu nome</label>
            <input type="text" id="idade" className="form-control form-control-lg"
              placeholder="Digite seu nome completo" />
          </div>
        </div>
        <div className="col-12 col-md-6 my-2">
          <div className="form-group">
            <label className="mb-2" htmlFor="idade">Quantos anos você tem?</label>
            <input type="text" id="idade" className="form-control form-control-lg" placeholder="ex.: 18" />
          </div>
        </div>
        <div className="col-12 mt-4 d-grid">
          <button className="btn btn-primary btn-lg" data-bs-toggle="modal" data-bs-target="#modal">Calcular</button>
        </div>
      </div>
    </>
  );
}