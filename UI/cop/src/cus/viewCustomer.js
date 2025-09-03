import React, { useState } from "react";
import { useSelector } from "react-redux";

export default function ViewCustomer(){

    const customers = useSelector((state) => state.customers)
    return( 
    <div>
        Customers List 
        <ul style={{listStyle:'none'}}>
           {customers.map((customer) => <li>{customer}</li> )}
        </ul>
    </div>)
}