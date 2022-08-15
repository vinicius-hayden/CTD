import Item from './Item';

export default function Lista({title, itens}) {
    return (

        <>
            <h1> Meus estudos de Reat </h1>
            <ul>
                <Item task={{id: 1, title: 'banana'}}/> 
                <Item task={{id: 2, title: 'pear'}}/> 
                <Item task={{id: 3, title: 'apple'}}/> 
            </ul>
        </>

        // <section className="py-5">
        //     <h2 className="h5 mb-4">My tasks</h2>
        //     <ul className="list-group" data-todo-target="list">
        //         <Item></Item>
        //     </ul>
        // </section>
    )
}