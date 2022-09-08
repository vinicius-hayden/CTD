import { useState } from "react";
import { useRef, useEffect } from "react";
import Sidebar from "./components/Sidebar";
import Forms from "./components/Forms";

const ESCAPE_KEYS = ["27", "Escape", " "];

const useEventListener = (eventName, handler, element = window) => {
  const savedHandler = useRef();

  useEffect(() => {
    savedHandler.current = handler;
  }, [handler]);

  useEffect(() => {
    const eventListener = (event) => savedHandler.current(event);
    element.addEventListener(eventName, eventListener);
    return () => {
      element.removeEventListener(eventName, eventListener);
    };
  }, [eventName, element]);
};

export default function App() {
  const ref = useRef(null);

  let [sidebarState, toggleSideBarState] = useState(false);

  function changeClass() {
    toggleSideBarState(!sidebarState);
    return sidebarState;
  }

  const keydownHandler = ({ key }) => {
    if (ESCAPE_KEYS.includes(String(key))) {
      changeClass();
    }
  };

  const doubleClickHandler = (event) => {
    changeClass();
  };

  useEventListener("keydown", keydownHandler);
  useEventListener("dblclick", doubleClickHandler);

  return (
    <>
      <div className="l-app" ref={ref}>
        <button className="l-sidebar__btn" type="button" onClick={changeClass}>
          Menu
        </button>
        
        <Sidebar classState={sidebarState} changeClass={changeClass}></Sidebar>
        
        <div className="l-content">
          <div className="l-page bg__profile">
            <main>
              <h1 className="title">Olá, me chamo Vinícius Hayden</h1>
              <p className="description">
                Seja bem vindo ao meu currículo on-line.
              </p>
              <nav className="c-nav u-my-3">
                <a className="c-nav__item" href="">Github</a>
                <a className="c-nav__item" href="">Linkedin</a>
              </nav>
              <a className="c-btn u-my-3" href="#sobre-mim">sobre mim</a>
            </main>
          </div>

          <div className="l-page" id="sobre-mim">
            <article>
              <h1 className="title">Sobre mim</h1>
              <p>
                Mussum Ipsum, cacilds vidis litro abertis. Paisis, filhis,
                espiritis santis.Per aumento de cachacis, eu
                reclamis.Casamentiss faiz malandris se pirulitá.Copo furadis é
                disculpa de bebadis, arcu quam euismod magna.
              </p>
              <p>
                Mauris nec dolor in eros commodo tempor. Aenean aliquam molestie
                leo, vitae iaculis nisl.Leite de capivaris, leite de mula
                manquis sem cabeça. Suco de cevadiss, é um leite divinis, qui
                tem lupuliz, matis, aguis e fermentis.Manduma pindureta quium
                dia nois paga.
              </p>
              <p>
                Interagi no mé, cursus quis, vehicula ac nisi.Nullam volutpat
                risus nec leo commodo, ut interdum diam laoreet. Sed non
                consequat odio.Todo mundo vê os porris que eu tomo, mas ninguém
                vê os tombis que eu levo!Sapien in monti palavris qui num
                significa nadis i pareci latim.
              </p>
            </article>
          </div>
          <Forms/>
        </div>
      </div>
    </>
  );
}
