import { useState } from "react";
import Swal from "sweetalert2/dist/sweetalert2";
import { FaLinkedin, FaGithub, FaPhoneAlt } from 'react-icons/fa'

export default function Forms() {
  const [name, setName] = useState("");
  const [nameError, setNameError] = useState("");
  const [email, setEmail] = useState("");
  const [emailError, setEmailError] = useState("");
  const [successMsg, setSuccessMsg] = useState("");
  const style = {fontSize: "1.8em"}
  
  const handleNameChange=(e)=> {
    setSuccessMsg('')
    setNameError('')
    setName(e.target.value);
  }

  const handleEmailChange=(e)=> {
    setSuccessMsg('')
    setEmailError('');
    setEmail(e.target.value);
  }

  function isValidEmail(email) {
    return /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(
      email
    );
  }

  function isValidName(name) {
    return /^[\sa-zA-Z]+$/.test(name);
  }
  
  const handleFormSubmit=(e)=> {
    e.preventDefault();

    if (!isValidName(name)) {
      setNameError("Name Required")
    }

    if (!isValidEmail(email)) {
      setEmailError("Email not valid");
    } 

    if (isValidEmail(email) && isValidName(name)) {
      Swal.fire({
        icon: 'success',
        title: 'All done!',
        text: `I'll get in touch ASAP!`
      })
    }

    else { 
      Swal.fire({
        icon: 'error',
        title: 'Oops...',
        text: 'Something went wrong!'
      })
    }

  }

  return (
    <>
      <div className="l-page" id="contatos">
        <section>
          <h1 className="title">How can I help you?</h1>

          <nav className="c-nav">
            <a className="c-nav__item" href="https://github.com/vinicius-hayden"><FaGithub style={style}/></a>
            <a className="c-nav__item" href="https://www.linkedin.com/in/vinicius-hayden/"><FaLinkedin style={style}/></a>
            <a className="c-nav__item" href="tel:+5521979365994"><FaPhoneAlt style={style}/></a>
          </nav>

          <form name="contact" className="c-form" onSubmit={handleFormSubmit}>
            <div className="c-form__group">
              <label htmlFor="name" className="c-form__label">Name</label>
              <input type="text" placeholder="Type your name" id="name" className="c-form__control" onChange={handleNameChange} value={name}/>
            </div>
            {nameError&&<div className="error-msg">{nameError}</div>}
            <div className="c-form__group">
              <label htmlFor="email" className="c-form__label">E-mail</label>
              <input type="text" placeholder="Type your e-mail" id="email" className="c-form__control" onChange={handleEmailChange} value={email}/>
            </div>
            {emailError&&<div className="error-msg">{emailError}</div>}
            <div className="c-form__group">
              <label htmlFor="subject" className="c-form__label">Subject</label>
              <select id="subject" className="c-form__control">
                <option enabled='true'> What is it about? </option>
                <option defaultValue="orcamento">Orçamento</option>
                <option defaultValue="oportunidade">Oportunidade</option>
                <option defaultValue="parceria">Parcerias</option>
              </select>
            </div>
            <div className="c-form__group">
              <label htmlFor="messager" className="c-form__label">Message</label>
              <textarea rows="5" placeholder="Feel free to explain to me, I'll gladly listen to it" id="messager" className="c-form__control"></textarea>
            </div>
            <div className="c-form__group">
              <button className="c-btn" type="submit">
                Send
              </button>
            </div>
          </form>
        </section>

        <footer className="u-my-3">
          <span>All rights reserved @Vinicius Hayden.</span>
        </footer>
      </div>
    </>
  );
}
