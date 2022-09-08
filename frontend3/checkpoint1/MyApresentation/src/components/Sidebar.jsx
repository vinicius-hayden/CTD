export default function Sidebar({ classState }) {
  let currentState = null;
  if (classState) {
    currentState = "l-sidebar--open"; // l-sidebar--open
  } else {
    currentState = "l-sidebar--close"; //l-sidebar--close
  }

  function closeSidebar() {
    let sidebar = document.querySelector('.l-sidebar--open')
    sidebar.remove();
  }

  return (
    <div className={currentState}>
      <div className="l-sidebar">
        <h1 className="l-logo">Vinicius Hayden</h1>
        <nav className="c-sidebar">
          <a className="c-nav__item" href="#sobre-mim" onClick={closeSidebar}>
            sobre mim
          </a>
          <a className="c-nav__item" href="#contatos" onClick={closeSidebar}>
            contatos
          </a>
        </nav>
      </div>
    </div>
  );
}
