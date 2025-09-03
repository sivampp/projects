import React, { useState, useEffect} from 'react';


export default function Count(){

    const [count, setCount] = useState(0);

   const handleClick = () => {
    setCount(count + 1)
   }

    return(<div>
        <button onClick={handleClick}>{count}</button>
    </div>);
}