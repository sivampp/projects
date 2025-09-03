import React, { useState } from "react";

export default function ViewOrder({custName}){

    console.log("NUMBER OF CUSTOMERS ADDED : " ,custName);
    // const [custList, setCustList] = useState(customers);

    return(
        
    <div>
        Customers List 
        {console.log("============", custName)}
        <ul>
            {custName}
        </ul>
        
    </div>)
}