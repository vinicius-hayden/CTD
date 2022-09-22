import { Routes, Route } from "react-router-dom";

import Contact from "./pages/Contact";
import Home from "./pages/Home";
import Nav from "./components/Nav";
import Product from "./pages/Product";

export default function App() {
  return (
    <>
      <Nav/>
      <Routes>
        <Route path="/" element={<Home/>} />
        <Route path="/contact" element={<Contact/>} />
        <Route path="/product/:name" element={<Product/>} />
      </Routes>
    </>
  );
}
