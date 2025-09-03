import React from "react";
import ViewCustomer from "./viewCustomer";
import { useState, useEffect } from "react";
import { addCustomer as addCustomerAction } from "../store/customerSlice";
import { useDispatch } from "react-redux";

export default function AddCustomer(){
    const dispatch = useDispatch();
    const [customer, setInput] = useState("");
    const [customers, setCustomers] = useState([]);
    const [custName, setCusName] = useState('Krishna');
        function addCustomer(){
            if(customer){
                dispatch(addCustomerAction(customer))
                setInput("");
            }
            else{
                return<div>Please enter Customer Name</div>
            }
        }
    return(
    <div>
        <div>
            <h2>Add new Customer</h2>
            <input type='text' value={customer} onChange={(e) => setInput(e.target.value)}/>
            <button onClick={addCustomer} >Add</button>
            {/* <button onChange={setCustomers()}>Add</button> */}
        </div>
    </div>
    );
}