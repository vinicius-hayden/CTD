export default function Sidebar({ classState, changeClass }) {
  let currentState = null;
  if (classState) {
    currentState = "l-sidebar l-sidebar--open";
  } else {
    currentState = "l-sidebar l-sidebar--close";
  }

  return (
    <div className={currentState} id="mainDiv">
      <div>
        <h1 className="l-logo">Vinicius Hayden</h1>
        <nav className="c-sidebar">
          <a className="c-nav__item" href="#sobre-mim" onClick={changeClass}>
            About me
          </a>
          <a className="c-nav__item" href="#contatos" onClick={changeClass}>
            Contacts
          </a>
        </nav>
      </div>
    </div>
  );
}
