const users = [
  {
    id: 1,
    name: "John",
    age: 20,
  },
  {
    id: 2,
    name: "Julia",
    age: 19,
  },
  {
    id: 3,
    name: "Vinicius",
    age: 21,
  },
  {
    id: 4,
    name: "Peter",
    age: 25,
  }
]

export default function App() {
  return (
    <article>
      <h1>Mapping values </h1>
      <section>
        <h1>Mapping all values</h1>
        <ul> 
          {users.map((currentUser, index) => <li> {index}: {currentUser.name} - {currentUser.age}</li>)} 
        </ul>
      </section>

      <section>
        <h1>Filter user age lower than 25</h1>
        <ul> 
          {users.filter((currentUser) => {
            if (currentUser.age < 25) {
              <li> 1: {currentUser.name} - {currentUser.age}</li>
            }
          })} 
        </ul>
      </section>

      <section>
        <h1>User with greater age</h1>
        <ul> {users.find((currentUser, index) => {
          var highestNumber = 0;
          if (currentUser.age > currentUser.age) {
              <li> {index}: {currentUser.name} - {currentUser.age}</li>
            }
          })}  
        </ul>
      </section>

    </article>
  );
}
