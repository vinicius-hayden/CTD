export default function Sidebar( {classState} ) {
  let currentState = null;
  if (classState) {
    currentState = "l-sidebar--open"; // l-sidebar--open
  } else {
    currentState = "l-sidebar--close"; //l-sidebar--close
  }

  return (
  <> 
    <div className={currentState}>
      <h1 className="l-logo">Vinicius Hayden</h1>
      <nav className="c-sidebar">
        <a className="c-nav__item" href="#sobre-mim">
          sobre mim
        </a>
        <a className="c-nav__item" href="#contatos">
          contatos
        </a>
      </nav>
    </div>
  </>);
}
