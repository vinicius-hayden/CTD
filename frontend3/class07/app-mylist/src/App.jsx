import MinhaLista from "./componentes/MinhaLista";

export default function App() {
  const produtos = [
    {
      id: 1,
      nome: "Banana",
      idade: 5.4,
    },
    {
      id: 2,
      nome: "Uva",
      idade: 12,
    },
    {
      id: 3,
      nome: "Morango",
      idade: 10,
    },
    {
      id: 4,
      nome: "Abacate",
      idade: 8.42,
    },
    {
      id: 5,
      nome: "Côco",
      idade: 2.7,
    },
    {
      id: 6,
      nome: "Maçã",
      idade: 3.8,
    },
    {
      id: 7,
      nome: "Açaí",
      idade: 18,
    },
    {
      id: 8,
      nome: "Pêra",
      idade: 5.31,
    },
    {
      id: 9,
      nome: "Mamão",
      idade: 2.1,
    },
    {
      id: 10,
      nome: "Pêssego",
      idade: 5.31,
    },
  ];

  return <MinhaLista produtos={produtos} />;
}
