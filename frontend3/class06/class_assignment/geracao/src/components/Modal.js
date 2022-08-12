export default function Modal( {nome, idade} ) {
  return (
    <div className="row">
      <div className="col">
        <div className="modal fade" id="modal" tabIndex="-1">
          <div className="modal-dialog">
            <div className="modal-content">
              <div className="modal-header">
                <h5 className="modal-title">Olá, {nome}</h5>
                <button type="button" className="btn-close" data-bs-dismiss="modal"
                  aria-label="Close"></button>
              </div>
              <div className="modal-body">
                <p>Você nasceu em {2022 - idade}.</p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}